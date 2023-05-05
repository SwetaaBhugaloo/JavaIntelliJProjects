public class Classwork {
    //any variable that has class scope = instance variable
    public static void main(String[] args) {
        // any variable declared inside a method is a local variable

        String c= doSum(2,5);
        System.out.println(c);

    }

    static String doSum(int a, int b){
        int sum = a+b;
        if ((sum % 2 )== 0){
            String s = "sum of values are:" + sum + " and is even";
            return s;
        }else {
            String s = "sum of values are:" + sum + " and is odd";
            return s;
        }
    }
}
