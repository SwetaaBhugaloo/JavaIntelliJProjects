public class MethodsSession {
    static int sum =0;
    public static void main(String[] args) {
        System.out.println("Display something");
        //method name, return type and parameters

//        int a=5;
//        int b=7;
//        int sum = a+b;

        int d =doSum(2,3);// method name + parameters= method signature
        // in one class just one method signature can be there
        System.out.println("sum=" + d);

        int e= doSum(2,3,4);
        System.out.println(e);

        displaySomething();
    }

    /*
    *returntype methodname(parameters){
    *}
     */
    static int doSum(int a, int b, int c){
        int sum = a+b+c;
        return sum;
    }
    static int doSum(int a, int b){
        sum = a+b+sum;
        System.out.println(sum);
        if (sum<100) {
            doSum(a, b);//recursion
        }

        return sum;
    }

//    static int doSum(int a, int b, int c){
//        int sum = a+b+c;
//        return sum;
//    }

    //display a msg
    static void displaySomething(){
        System.out.println("Hey i am printing something");
        //displaySomething();
    }


}
