import java.util.ArrayList;

public class User {
    //User should have a list of books
    //User should have a username and a password
    private String username;
    private String password;

    public ArrayList<String> books = new ArrayList<>(10);

    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    public void rentBook(String book){
        books.add(book);
    }
    public void returnBook(String book){
        books.remove(book);
    }
}
