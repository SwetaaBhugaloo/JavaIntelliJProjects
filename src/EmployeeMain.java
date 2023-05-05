public class EmployeeMain {
    public static void main(String[] args) {

        // all users who create the object with firstname and lastname should have company as pragra
        Employee emp1= new Employee("swetaa");
        Employee emp2 = new Employee("swetaa", "bhugaloo");
        Employee emp3 = new Employee("swetaa", "bhugaloo", 100000, "Amazon");

        System.out.println(emp1.firstName+ " "+ emp1.lastName+ " is earning " + emp1.salary+ " at " + emp1.company);
        System.out.println(emp2.firstName+ " "+ emp2.lastName+ " is earning " + emp2.salary+ " at " + emp2.company);
        System.out.println(emp3.firstName+ " "+ emp3.lastName+ " is earning " + emp3.salary+ " at " + emp3.company);


        System.out.println(emp1.work());

    }
}
