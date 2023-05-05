public class ObjectOrientedSession {
    public static void main(String[] args) {
        //constructor of student class will determine how much memory to allocate towards each variable.
        //sam is an object and all objects are part of heap memory.
        Student sam = new Student();

        sam.firstName="sam";
        sam.lastName="smith";
        sam.age=24;
        sam.school="pragra";
        sam.studentId=007;

     //   sam.study();

//        System.out.println(sam.firstName);

        double avg= sam.calculateAverage(90, 80, 55);
        System.out.println(avg);
    }
}
