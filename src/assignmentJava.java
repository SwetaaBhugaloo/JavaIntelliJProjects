import java.util.Scanner;

public class assignmentJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("User enter input: " + a);
        if ( a > 10 ){
            System.out.println("value of integer is " + a + " and is greater than 10");
        } else if (a >0) {
            System.out.println("value of integer is " + a + " and is positive value");

        } else if ( a == 0) {
            System.out.println("value of integer is zero");
        }else if(a < 0){
            System.out.println("value of integer is " + a + " and is negative value");
        }
    }
}
