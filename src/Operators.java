public class Operators {
    public static void main(String[] args) {

        //operators
        //arithmetic ops + - * %
        //logical ops --> == (comparison) = (assign ) >(greater than) < (less than) >=  <=
        //merge more than 1 condition And  && / or || operators
        /*
        AND - TRUE + TRUE - TRUE
              FALSE + TRUE - FALSE
              TRUE + FALSE - FALSE
              FALSE + FALSE - FALSE

        OR - TRUE + FALSE - TRUE
             FALSE + FALSE - FALSE

         */


        int a = 10;
        int b = 20;
        double c= (double)45/ (double)35;


        //if else
        if (a == b){
            System.out.println("value same " + a );

        }else {
            System.out.println("value different " + a + " " + b);
        }

        if (a >= b){
            System.out.println("a is greater than b " + a );

        }else {
            System.out.println("b is greater than a " +  b);
        }


        System.out.println("addition: " + a + b);
        System.out.println("subtraction: "+( a -b));
        System.out.println("multiplication: " +(a * b));
        System.out.println("Division: " + b/a);
        System.out.println(c);

        // unary operators-- short form for incrementing value by 1 or decrement value by 1
        // prefix and postfix

        a++; //increment of a happens on next line
        ++a; //increment on same line
        System.out.println(a);

        // postdecrement and pre decrement

        //a--; decrement on 2nd line
        //--a; decrement on same line


        int d= --a;
        System.out.println(a);

        String e ="abc";
        String f = "xyz";
        String i = e + f;
        System.out.println(i);





    }
}
