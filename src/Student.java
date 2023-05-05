public class Student {
    //what is a class-> blue print, definition
    // properties ->variables
    //instance variables
    String firstName;
    String lastName;
    int age;
    int studentId;
    String school;

    // study ->behaviour or functionality of student -> methods

    void study(){
        System.out.println(firstName + " " + lastName + " is studying");
    }

    double calculateAverage(double math, double sci, double eng){
        study();
        return (math+sci+eng)/3;
    }

}
