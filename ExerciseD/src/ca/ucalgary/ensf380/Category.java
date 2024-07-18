package ca.ucalgary.ensf380;

public class Category {
    private String category;
    private Category subCategory;
    private Category superCategory;

    public Category(String category) {
        this.category = category;
    }

  
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Category getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(Category subCategory) {
        this.subCategory = subCategory;
    }

    public Category getSuperCategory() {
        return superCategory;
    }

    public void setSuperCategory(Category superCategory) {
        this.superCategory = superCategory;
    }
}
