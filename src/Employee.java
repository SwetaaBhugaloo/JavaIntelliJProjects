public class Employee {
    String firstName;
    String lastName;
    int salary;

    String company;
    int a=10;

    // write a method which returns a string -> firstname is working

    //default constructor
    /*
    * looks like a method but is not a method
    * does not have a return type
    * it has exact same name as the class name:
    * -> constructor constructs/create the object
    * */

    //default constructor-> it is optional-> if we do not write it compiler writes default constructor.
    //at least one constructor exist in all classes.
    //what constructor does is it initializes memory

    //this refers to object with which you have called method keyword
    Employee(String firstName, String lastName, int salary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }

    Employee(String firstName, String lastName, int salary, String company){
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
        this.company= company;
    }

    Employee(String firstName){
        this.firstName=firstName;


    }

    Employee(String firstName, String lastName){
        this(firstName, lastName, 0);
        this.company="pragra";
    }
    String work(){
        int a =5;//local variable
        System.out.println(this.a);
        return firstName+ " is working";

    }
}
