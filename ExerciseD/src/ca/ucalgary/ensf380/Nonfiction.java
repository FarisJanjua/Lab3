package ca.ucalgary.ensf380;

public class Nonfiction extends Paperback {
    private Category deweyClassification;

    public Nonfiction(String isbn,int pages) {
        super(isbn, pages);
    }


    public Category getDeweyClassification() {
        return deweyClassification;
    }

    public void setDeweyClassification(Category deweyClassification) {
        this.deweyClassification = deweyClassification;
    }

    public String topic() {
        return "Method topic called from Nonfiction";
    }
}
