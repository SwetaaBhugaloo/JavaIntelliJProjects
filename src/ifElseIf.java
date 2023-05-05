public class ifElseIf {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        //modulo %2 = 0 //even or odd

        if (a % 2 == 0){
            System.out.println("a is even!");
        } else {
            System.out.println("a is odd");
        }

        if (a == 0){
            System.out.println("a is zero");
        } else if ( a < 0) {
            System.out.println("a is negative");

        }else {
            System.out.println("a is positive");
        }
    }


}
