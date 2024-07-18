package ca.ucalgary.ensf380;

public class University {
    public static void main(String[] args) {
      
        Address professor1Address = new Address("123 University St", "T2N 1N4", "Alberta", "Canada");
        Address professor2Address = new Address("456 University St", "T2N 1N8", "Alberta", "Canada");
        Address student1Address = new Address("789 College Ave", "T2N 2N4", "Alberta", "Canada");
        Address student2Address = new Address("810 Campus Dr", "T2N 2N8", "Alberta", "Canada");

        Professor professor1 = new Professor("Travis", "555-5555", "travis@university.ca", professor1Address, 1, "P001", 200000.0);
        Professor professor2 = new Professor("Drake", "555-1234", "drake@university.ca", professor2Address, 2, "P002", 176000.0);

      
        Student student1 = new Student("Kanye", "555-9101", "kanye@university.ca", student1Address, 3, "S001", professor1, 64.0);
        Student student2 = new Student("Kendrick", "555-1122", "kendrick@university.ca", student2Address, 4, "S002", professor2, 93.0);

        System.out.println("Student 1: " + student1.getName() + ", Address: " + student1.getAddress().getStreet() + ", Grade: " + student1.getAverageMark());
        System.out.println("Student 2: " + student2.getName() + ", Address: " + student2.getAddress().getStreet() + ", Grade: " + student2.getAverageMark());
       
        System.out.println("Professor 1: " + professor1.getName() + ", Address: " + professor1.getAddress().getStreet() + ", Salary: " + professor1.getSalary());
        System.out.println("Professor 2: " + professor2.getName() + ", Address: " + professor2.getAddress().getStreet() + ", Salary: " + professor2.getSalary());

        
        System.out.println("Booking a meeting with Professor Travis.");
        System.out.println("Booking a meeting with Professor Drake.");
    }
}

