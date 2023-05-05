public class ObjectOrientedPrincipals {
    //oops-> if it follows these four principals// 4 pillars
    //encapsulation, inheritance, abstraction, polymorphism

    // encapsulation
    //your data should not be visible outside of class/ data should be controlled
    //access modifiers-> public, private, protected, default
    public static void main(String[] args) {
        // i do not want to change the values of an object after it is created
        StudentOop s1 = new StudentOop("Peter", "Parker", 1234, 001);



        //=s1.setFirstname("Peter");
        System.out.println("First name is " + s1.getFirstname());

    }
}
