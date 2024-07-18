package ca.ucalgary.ensf380;

public class Professor extends Person {

    private String teacherNumber;
    private Double salary;

    
    public Professor(String name, String phoneNumber, String emailAddress, Address address, int lastPersonalNumber,
                     String teacherNumber, Double salary) {
        super(name, phoneNumber, emailAddress, address, lastPersonalNumber);
        this.teacherNumber = teacherNumber;
        this.salary = salary;
    }

   
    public Professor(String name, String phoneNumber, String emailAddress, String teacherNumber, Double salary) {
        super(name, phoneNumber, emailAddress, null, 0); 
        this.teacherNumber = teacherNumber;
        this.salary = salary;
    }

   
    public String getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(String teacherNumber) {
        this.teacherNumber = teacherNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
