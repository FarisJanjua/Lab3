package ca.ucalgary.ensf380;

public class Story {
    private Author[] theAuthors;

    
    public Author[] getTheAuthors() {
        return theAuthors;
    }

    public void setTheAuthors(Author[] theAuthors) {
        this.theAuthors = theAuthors;
    }

    public String plot() {
        return "Method plot called from Story";
    }
}
