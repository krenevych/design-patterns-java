import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {

        // Login and passwords for administrators
        Map<String, String> adminsAccounts = new HashMap<>();
        adminsAccounts.put("admin", "123qweASD");
        adminsAccounts.put("administrator", "1234");

        // Login and passwords for users
        Map<String, String> usersAccounts = new HashMap<>();
        usersAccounts.put("andrii", "1234");
        usersAccounts.put("black_knight", "S@ruman1");
        usersAccounts.put("white_knight", "ruman1");

        Account[] users = {
            Account.createAdmin("admin", "123qweASD"),
            Account.createAdmin("administrator", "1234"),
            Account.createUser("andrii", "1234"),
            Account.createGuest(),
            Account.createUser("black_knight", "S@ruman1"),
            Account.createUser("white_knight", "S111"),
            Account.createGuest(),
        };

        for (Account user : users) {

            Account.AccessType accessType = user.getAccessType();
            String userLogin = user.getLogin();
            String userPassword = user.getPassword();


            if (accessType == Account.AccessType.Guest) {
                System.out.println("Guest access provided!");
            } else if (accessType == Account.AccessType.User) {

                String passwordFromUserStorage = usersAccounts.get(userLogin);
                if (userPassword.equals(passwordFromUserStorage)) {
                    System.out.println("User access provided: " + userLogin);
                } else {
                    System.out.println("Access denied: " + userLogin);
                }

            } else if (accessType == Account.AccessType.Administrator) {

                String passwordFromAdminsStorage = adminsAccounts.get(userLogin);
                if (userPassword.equals(passwordFromAdminsStorage) && userPassword.length() >= 8) {
                    System.out.println("Administrator access provided: " + userLogin);
                } else {
                    System.out.println("Access denied: " + userLogin);
                }

            }
        }
    }
}
