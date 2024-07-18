package ca.ucalgary.ensf380;

class Address {
    private String street;
    private String postalCode;
    private String state;
    private String country;

    // Constructor
    public Address(String street, String postalCode, String state, String country) {
        this.street = street;
        this.postalCode = postalCode;
        this.state = state;
        this.country = country;
    }

    // Methods
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Validate method
    public boolean validate() {
        return street != null && !street.trim().isEmpty() &&
               postalCode != null && !postalCode.trim().isEmpty() &&
               state != null && !state.trim().isEmpty() &&
               country != null && !country.trim().isEmpty();
    }
}
