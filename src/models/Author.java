package models;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Author: "+firstName+" "+lastName;
    }

    @Override
    public boolean equals(Object author) {
        if(author!=null && author.getClass()==this.getClass()){
            if(((Author)author).getFirstName().equals(this.firstName) && ((Author)author).getLastName().equals(this.lastName)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hashCode(firstName+lastName);
    }
}
