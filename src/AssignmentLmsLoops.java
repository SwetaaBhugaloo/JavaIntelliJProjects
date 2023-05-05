import java.util.Scanner;

public class AssignmentLmsLoops {
    public static void main(String[] args) {
        //1. Write a program to find the factorial of any number entered by the user
        //Factorial of number means :
        //Factorial of 5 is : 5x4x3x2x1 = 120

        //while
       Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter number you want factorial of: ");
//
//        long factorial = 1;
//        int input = sc.nextInt();
//        for (int i = 1; i <= input; ++i) {
//            factorial *= i;
//        }
//        System.out.println("Factorial of " + input + " is " + factorial);


        //2. Write a program to calculate the sum of first 10 natural number
//        int sum=0;
//        for (int j = 0; j <= 10; j++) {
//            sum += j;
//        }
//        System.out.println("Sum of the first 10 natural numbers are: " + sum);

        //3. Write a program that prompts the user to input an integer and then
        //outputs the number with the digits reversed. For example, if the input is
        //12345, the output should be 54321
//        System.out.println("Please enter number you want to reverse: ");
//        int number = sc.nextInt(), reverse=0;
//
//        while(number !=0){
//            int remainder = number % 10;
//            reverse= reverse*10 + remainder;
//            number = number/10;
//
//        }
//        System.out.println("The reverse of the number input is: " + reverse);


       //4. Write a program that read the set of integers and print sum of even and
        //odd integers
//
//        int choice;
//        int even =0;
//        int odd=0;
//        int sumEven=0;
//        int sumOdd=0;
//        System.out.println("Please enter a number: ");
//        choice=sc.nextInt();
//        int i=1;
//        do{
//            System.out.println(i);
//            i++;
//            if ((i % 2) ==0){
//                even=i;
//
//                sumEven+=i;
//            }else {
//                odd =i;
//                sumOdd += i;
//            }
//
//        }while(i<=choice);
//        System.out.println("The sum of the even numbers are" + sumEven);
//        System.out.println("The sum of the odd numbers are" + sumOdd);
//

        //5. Write a program to keep asking for a number until you enter a negative
        //number. At the end, print the sum of all entered numbers.
//        boolean flag= true;
//        int sum=0;
//        while(flag){
//            System.out.println("Please enter number:");
//            int number = sc.nextInt();
//            sum += number;
//
//            if (number< 0){
//                flag=false;
//            }
//
//        }
//        System.out.println("The sum of the numbers are:" + sum);


        //6.Print the reverse of a number 1234567.

//        long number = 1234567, reverse=0;
//
//        while(number !=0){
//            long remainder = number % 10;
//            reverse= reverse*10 + remainder;
//            number = number/10;
//
//        }
//        System.out.println("The reverse of the number input is: " + reverse);
//
        //7. Using while loop print the following pattern
        //* * * * *
        //* * * * *
        //* * * * *
        //* * * * *
        //* * * * *
//        int row =4;
//        while (row == 4){
//            System.out.print("*");
//
//        }
//        System.out.println();
    }
}

