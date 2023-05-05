public class StudentOop {
    private String firstname;
    private String lastname;
    private int phoneNum;
    private int studentID;

    //getter setters
    public StudentOop(String firstname, String lastname, int phoneNum, int studentID){
        this.firstname=firstname;
        this.lastname=lastname;
        this.phoneNum=phoneNum;
        this.studentID=studentID;
    }

    public String getFirstname() {
        return firstname;
    }

    void study(){
        System.out.println( firstname + " is studying");
    }

}
