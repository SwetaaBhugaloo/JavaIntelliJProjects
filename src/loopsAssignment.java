import java.util.Scanner;

public class loopsAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while(flag){
            System.out.println("Please enter your choice:\n" +
                    "1.addition \n" +
                    "2.subtraction\n" +
                    "3.multiplication\n" +
                    "4.division\n" +
                    "5.Exit");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Please enter first number: ");
                    int firstNum= sc.nextInt();
                    System.out.println("Please enter second number: ");
                    int secondNum= sc.nextInt();
                    System.out.println("The sum of " + firstNum + " and "+ secondNum + " is : " +(firstNum+secondNum));
                    break;
                case 2:
                    System.out.println("Please enter first number: ");
                    firstNum= sc.nextInt();
                    System.out.println("Please enter second number: ");
                    secondNum= sc.nextInt();
                    System.out.println("The subtraction of " + firstNum + " and "+ secondNum + " is : " +(firstNum-secondNum));
                    break;
                case 3:
                    System.out.println("Please enter first number: ");
                    firstNum= sc.nextInt();
                    System.out.println("Please enter second number: ");
                    secondNum= sc.nextInt();
                    System.out.println("The multiplication of " + firstNum + " and "+ secondNum + " is : " +(firstNum*secondNum));
                    break;
                case 4:
                    System.out.println("Please enter first number: ");
                     firstNum= sc.nextInt();
                    System.out.println("Please enter second number: ");
                     secondNum= sc.nextInt();
                    System.out.println("The division of " + firstNum + " and "+ secondNum + " is : " +(firstNum/secondNum));
                    break;
                case 5:
                    flag = false;
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Incorrect choice! please try again!");

            }


        }


    }

}
