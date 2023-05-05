public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("My name is Swetaa");
        //numbers --> int type + - 0, full numbers
        //short int long
        //text or words --> string
        //deimal numbers -->float, double, bigdecimal
        //single character
        //boolean values--> stores 2 type of data --> false/true
        //declaration

        //within same scope u cannot redeclare a variable


        int marks;// 4 bytes
        String name;
        float averageMarks;// 4bytes
        char attend; //ASCII table 1 byte-> -127 to 127
        boolean isOnline;// 1 bit
        short id;// 2bytes
        long phneNum;// 8 bytes
        double largeDecimalValue;//8 bytes

        //usage of variables-->initialization
        //'=' -->assignment operator--> works from right to left

        marks = 50;
        name = "swetaa";
        phneNum =123456789;

        marks = marks + 5;
        System.out.println(marks);

        averageMarks = 25.55f;
        largeDecimalValue= 1234567.09976;
        attend='a';// ASCII table--> ascii 67 --> binary value 0101110101
        //attend = 67;
        System.out.println(attend + "pple");

        System.out.println(averageMarks);
        System.out.println(largeDecimalValue);
        System.out.println(name);
        System.out.println(phneNum);



    }
    /*
    multi line comments

     **/

    public static void method1() {
        int marks;

    }
}
