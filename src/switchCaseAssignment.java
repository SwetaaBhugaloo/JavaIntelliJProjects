import java.util.Scanner;

public class switchCaseAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter username: ");
        String username = sc.next();
        System.out.println("User enter username: " + username);


        String password = username + "password123";

        switch (username){
            case "Swetaa" :
                System.out.println("Username is: " + username + " Password is: " + password);
                break;
            case "Sneha" :
                System.out.println("Username is: " + username + " Password is: " + password);
                break;
            case "Sarvesh" :
                System.out.println("Username is: " + username +" Password is: " + password);
                break;

            default:
                System.out.println("Wrong username: Please try again!");
                break;
        }
    }
}
