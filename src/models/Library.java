package models;

public class Library {
    private Book[] books;

    public Library(int size) {
        books = new Book[size];
    }

    public void addBook(String name, Author author, int yearPublisher) {
        Book book = new Book(name, author, yearPublisher);
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
    }
    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
    }

    public void updateYearPublished(String name, int yearPublished) {
        Book book = findBookByName(name);
        if (book != null) {
            book.setYearPublisher(yearPublished);
        }
    }

    public void printAllInfoOfBooks() {
        for (Book book :
                books) {
            if (book != null) {
                System.out.println(book.getAuthor().getLastName() + " " + book.getAuthor().getFirstName() + ": " + book.getName() + ": " + book.getYearPublisher());
            }
        }
    }

    public void printInfoOfBook(String name) {
        Book book = findBookByName(name);
        if (book != null) {
            System.out.println(book.getName() + " by " + book.getAuthor().getLastName() + " " + book.getAuthor().getFirstName() + " was published in " + book.getYearPublisher());
        }
    }

    private Book findBookByName(String name) {
        for (Book book :
                books) {
            if (book != null && book.getName().equals(name)) {
                return book;
            }
        }
        return null;
    }
    @Override
    public String toString(){
        StringBuffer result=new StringBuffer();
        for (Book book:
             books) {
            result.append(book.toString());
            result.append("\n");
        }
        return result.toString();
    }
}