import java.util.*; // User Login

public class Login {
    private List<User> users = new ArrayList<>();

    private class User {
        private String username;
        private String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }
        public String getPassword() {
            return password;
        }
    }

    public Login() {
        addUser("admin", "admin123");
    }

    public void addUser(String username, String password) {
        users.add(new User(username, password));
    }

    public boolean startLogin() {
        Scanner sc = new Scanner(System.in);
        boolean loggedIn = false;

        System.out.println("=== Login System ===");

        while (!loggedIn) {
            System.out.print("\nEnter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (login(username, password)) {
                System.out.println("\nLogin successful! Welcome.");
                return true;
            } else {
                System.out.println("\nInvalid username or password. Try again.");
            }
        }
        return false;
    }

    private boolean login(String username, String password) {
        for (User u : users) {
            if (u.getUsername().equalsIgnoreCase(username) && u.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
