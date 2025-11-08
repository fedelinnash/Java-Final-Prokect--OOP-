import java.util.*;

public class Main {
    private static List<Ticket> tickets = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Login login = new Login();
        if (login.startLogin()) {
            runTicketSystem();
        } else {
            System.out.println("Access denied.");
        }
    }

    private static void runTicketSystem() {
        int choice;
        do {
            System.out.println("\n===== Transportation Ticketing System =====");
            System.out.println("[1] Add Ticket");
            System.out.println("[2] View Ticket");
            System.out.println("[3] Update Ticket");
            System.out.println("[4] Delete Ticket");
            System.out.println("[0] Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addTicket();
                    break;
                case 2:
                    viewTicket();
                    break;
                case 3:
                    updateTicket();
                    break;
                case 4:
                    deleteTicket();
                    break;
                case 0:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (choice != 0);
    }

    private static void addTicket() {
        System.out.print("Enter Type of Vehicle (Bus/Car): ");
        String type = sc.nextLine();

        System.out.print("Enter Route: ");
        String route = sc.nextLine();

        System.out.print("Select Payment Method (Online Payment/Cash): ");
        String payment = sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Contact Number: ");
        String contact = sc.nextLine();

        Ticket t = new Ticket(type, route, payment, name, contact);
        tickets.add(t);
        System.out.println("\nTicket Added Successfully!");
        System.out.println(t);
    }

    private static void viewTicket() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets available.");
            return;
        }
        System.out.print("Enter Ticket Number to View: ");
        int num = sc.nextInt();
        sc.nextLine();

        for (Ticket t : tickets) {
            if (t.getTicketNum() == num) {
                System.out.println(t);
                return;
            }
        }
        System.out.println("Ticket not found.");
    }

    private static void updateTicket() {
        System.out.print("Enter Ticket Number to Update: ");
        int num = sc.nextInt();
        sc.nextLine();

        for (Ticket t : tickets) {
            if (t.getTicketNum() == num) {
                System.out.print("Update Type of Vehicle (Bus/Car): ");
                t.setVehicles(sc.nextLine());

                System.out.print("Update Route: ");
                t.setRoute(sc.nextLine());

                System.out.print("Update Name: ");
                t.setName(sc.nextLine());

                System.out.print("Update Contact Number: ");
                t.setContactNum(sc.nextLine());

                System.out.print("Update Payment Method: ");
                t.setPaymentMethod(sc.nextLine());

                System.out.println("Ticket Updated Successfully!");
                System.out.println(t);
                return;
            }
        }
        System.out.println("Ticket not found.");
    }

    private static void deleteTicket() {
        System.out.print("Enter Ticket Number to Delete: ");
        int num = sc.nextInt();
        sc.nextLine();

        Iterator<Ticket> iterator = tickets.iterator();
        while (iterator.hasNext()) {
            Ticket t = iterator.next();
            if (t.getTicketNum() == num) {
                iterator.remove();
                System.out.println("Ticket Deleted Successfully!");
                return;
            }
        }
        System.out.println("Ticket not found.");
    }
}
