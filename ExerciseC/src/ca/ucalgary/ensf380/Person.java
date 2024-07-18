package ca.ucalgary.ensf380;

abstract class Person {
    
    protected String name;
    protected String phoneNumber;
    protected String emailAddress;
    protected Address address;
    private static int lastPersonalNumber;
    
    public Person(String name, String phoneNumber, String emailAddress, Address address, int lastPersonalNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
        Person.lastPersonalNumber = lastPersonalNumber; 
    }
    
    protected static String nextPersonalNumber(short type) {
        return "Number is Updated!";
    }

    // Method to check if the address is valid
    public boolean hasValidAddress() {
        return this.address != null && this.address.validate();
    }
    
    int getLastPersonalNumber() {
        return Person.lastPersonalNumber;
    }
    
    void setLastPersonalNumber(int lastPersonalNumber) {
        Person.lastPersonalNumber = lastPersonalNumber;
    }
    
    String getName() {
        return name;
    }
    
    void setName(String name) {
        this.name = name;
    }
    
    String getPhoneNumber() {
        return phoneNumber;
    }
    
    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    String getEmailAddress() {
        return emailAddress;
    }
    
    void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    Address getAddress() {
        return address;
    }
    
    void setAddress(Address address) {
        this.address = address;
    }
}

	
	

	
	
