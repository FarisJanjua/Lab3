package ca.ucalgary.ensf380;

public class Anthology extends Fiction {
    private Story[] stories;
    private String storyOrder;

    public Anthology(String isbn, int pages) {
        super(isbn, pages);
    }

   
    public Story[] getStories() {
        return stories;
    }

    public void setStories(Story[] stories) {
        this.stories = stories;
    }

    public String getStoryOrder() {
        return storyOrder;
    }

    public void setStoryOrder(String storyOrder) {
        this.storyOrder = storyOrder;
    }

    public String coverArt() {
        return "Method coverArt called from Anthology";
    }
}
