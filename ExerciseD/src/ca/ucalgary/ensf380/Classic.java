package ca.ucalgary.ensf380;

public class Classic extends Book {
    private Author theAuthor;
    private Publisher bookPublisher;
    private int origPubYear = 1860;

    public Classic(String isbn, int pages) {
        super(isbn, pages);
    }

    public Author getTheAuthor() {
        return theAuthor;
    }

    public void setTheAuthor(Author theAuthor) {
        this.theAuthor = theAuthor;
    }

    public Publisher getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(Publisher bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public int getOrigPubYear() {
        return origPubYear;
    }

    public void setOrigPubYear(int origPubYear) {
        this.origPubYear = origPubYear;
    }

    public String createNotes() {
        return "Method createNotes called from Classic";
    }
}
