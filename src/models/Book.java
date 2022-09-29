package models;

public class Book {
    private String name;
    private Author author;
    private int yearPublisher;

    public Book(String name, Author author, int yearPublisher) {
        this.name = name;
        this.author = author;
        this.yearPublisher = yearPublisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYearPublisher() {
        return yearPublisher;
    }

    public void setYearPublisher(int yearPublisher) {
        this.yearPublisher = yearPublisher;
    }

    @Override
    public String toString() {
        return "Book: "+name+" by "+author;
    }
    @Override
    public boolean equals(Object book){
        if(book.getClass()==this.getClass()){
            Book el=(Book) book;
            if(el.getName().equals(this.name) && el.getAuthor().equals(this.name)){
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hashCode(name+author);
    }
}