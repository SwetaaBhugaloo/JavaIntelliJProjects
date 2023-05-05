import java.util.Scanner;

public class LoopsClass {
    public static void main(String[] args) {
        //while
        //do while
        //for
        //for-each, advance for
        /**Scanner sc = new Scanner(System.in);

        int value =0;

        while (value != 5) {
            System.out.println("Please enter value: ");
            value = sc.nextInt();
            System.out.println("User input was: " + value);
        }*/

        /**int e = 0;

        while (e <= 5){
            System.out.println("Hello");
            ++e;
        }*/
        Scanner sc = new Scanner(System.in);

        int value;
        boolean flag = true;

        while (flag) {
            System.out.println("Please enter value: ");
            value = sc.nextInt();
            System.out.println("User input was: " + value);
            if (value==5){
                flag=false;
            }
        }
    }


}
