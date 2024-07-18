package ca.ucalgary.ensf380;

public class MyBook {
    public static void main(String[] args) {
        // Create authors
        Author author1 = new Author("Travis Scott", "123 Scott St", 33);
        Author author2 = new Author("Kanye West", "456 Ye St", 47);
        
        // Print authors
        System.out.println("Author 1: " + author1.getName() + ", Address: " + author1.getAddress() + ", Age: " + author1.getAge());
        System.out.println("Author 2: " + author2.getName() + ", Address: " + author2.getAddress() + ", Age: " + author2.getAge());

        // Create publisher
        Publisher publisher = new Publisher("123 Publishing Company", "123 Royal St");
        
        // Print publisher
        System.out.println("Publisher: " + publisher.getName() + ", Address: " + publisher.getAddress());

        // Create classic book
        Classic classicBook = new Classic("804023005", 1000);
        classicBook.setTheAuthor(author1);
        classicBook.setBookPublisher(publisher);
        
        // Print classic book details
        System.out.println("Classic Book ISBN: " + classicBook.getIsbn() + ", Pages: " + classicBook.getPages() + ", Author: " + classicBook.getTheAuthor().getName() + ", Publisher: " + classicBook.getBookPublisher().getName());

        // Create novel book
        Novel novelBook = new Novel("123456789", 550);
        novelBook.setTheAuthors(new Author[]{author2});
        novelBook.setMySeries(new Series());

        // Print novel book details
        System.out.println("Novel Book ISBN: " + novelBook.getIsbn() + ", Pages: " + novelBook.getPages() + ", Author: " + novelBook.getTheAuthors()[0].getName());

        // Create contract
        Contract contract = new Contract("07/01/2024", publisher, new Author[]{author1, author2});
        
        // Print contract details
        System.out.println("Contract Date: " + contract.getDate() + ", Publisher: " + contract.getPublisherInfo().getName() + ", Authors: " + contract.getAuthorInfo()[0].getName() + " and " + contract.getAuthorInfo()[1].getName());
        
        // Print interactions
        System.out.println(classicBook.createNotes());
        System.out.println(novelBook.coverArt());
        System.out.println(contract.printContract());
    }
}

