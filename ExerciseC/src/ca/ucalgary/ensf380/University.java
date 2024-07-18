package ca.ucalgary.ensf380;

import java.util.Scanner;

public class University {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Address instances
        Address professor1Address = new Address("123 University St", "T2N 1N4", "Alberta", "Canada");
        Address professor2Address = new Address("456 University St", "T2N 1N8", "Alberta", "Canada");
        Address student1Address = new Address("789 College Ave", "T2N 2N4", "Alberta", "Canada");
        Address student2Address = new Address("810 Campus Dr", "T2N 2N8", "Alberta", "Canada");

        // Create Professor instances
        Professor professor1 = new Professor("Travis", "555-5555", "travis@university.ca", professor1Address, 1, "P001", 200000.0);
        Professor professor2 = new Professor("Drake", "555-1234", "drake@university.ca", professor2Address, 2, "P002", 176000.0);

        // Create Student instances
        Student student1 = new Student("Kanye", "555-9101", "kanye@university.ca", student1Address, 3, "S001", professor1, 85.0);
        Student student2 = new Student("Kendrick", "555-1122", "kendrick@university.ca", student2Address, 4, "S002", professor2, 90.0);

        // Interactive menu
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Book meeting with Professor Travis");
            System.out.println("2. Book meeting with Professor Drake");
            System.out.println("3. Print student details");
            System.out.println("4. Print professor details");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Meeting booked with Professor Travis.");
                    break;
                case 2:
                    System.out.println("Meeting booked with Professor Drake.");
                    break;
                case 3:
                    System.out.println("Student 1: " + student1.getName() + ", Address: " + student1.getAddress().getStreet());
                    System.out.println("Student 2: " + student2.getName() + ", Address: " + student2.getAddress().getStreet());
                    break;
                case 4:
                    System.out.println("Professor 1: " + professor1.getName() + ", Address: " + professor1.getAddress().getStreet());
                    System.out.println("Professor 2: " + professor2.getName() + ", Address: " + professor2.getAddress().getStreet());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
