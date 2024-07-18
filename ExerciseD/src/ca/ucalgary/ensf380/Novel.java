package ca.ucalgary.ensf380;

public class Novel extends Fiction {
    private Author[] theAuthors;
    private Series mySeries;

    public Novel(String isbn, int pages) {
        super(isbn, pages);
    }

    public Author[] getTheAuthors() {
        return theAuthors;
    }

    public void setTheAuthors(Author[] theAuthors) {
        this.theAuthors = theAuthors;
    }

    public Series getMySeries() {
        return mySeries;
    }

    public void setMySeries(Series mySeries) {
        this.mySeries = mySeries;
    }

    public String coverArt() {
        return "Method coverArt called from Novel";
    }
}
