public class Ticket extends Transport {
    static int count = 100;
    private int ticketNum;
    private String paymentMethod;
    private String name;
    private String contactNum;
    private String status;
    private String estimatedTime;

    public Ticket(String vehicles, String route, String paymentMethod, String name, String contactNum) {
        super(vehicles, route);
        this.paymentMethod = paymentMethod;
        this.name = name;
        this.contactNum = contactNum;
        this.ticketNum = count++;
        this.status = "On board";
        this.estimatedTime = "2 Hours";
    }

    public int getTicketNum() {
        return ticketNum;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContactNum() {
        return contactNum;
    }
    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }
    public String getStatus() {
        return status;
    }
    public String getEstimatedTime() {
        return estimatedTime;
    }

    @Override
    public String toString() {
        return "\nTicket #" + ticketNum +
                "\nName: " + name +
                "\nContact: " + contactNum +
                "\nVehicle: " + getVehicles() +
                "\nRoute: " + getRoute() +
                "\nPayment: " + paymentMethod +
                "\nStatus: " + status +
                "\nEstimated Arrival Time: " + estimatedTime + "\n";
    }
}
