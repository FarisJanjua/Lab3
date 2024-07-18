package ca.ucalgary.ensf380;

public abstract class Fiction extends Paperback {
    private String genre;

    public Fiction(String isbn, int pages) {
        super(isbn, pages);
    }

  
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String genre() {
        return "Method genre called from Fiction";
    }
}
