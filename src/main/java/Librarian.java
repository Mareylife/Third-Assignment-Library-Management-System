import java.util.ArrayList;

public class Librarian {
    private String username;
    private String password;
    private ArrayList<String> users;
    private ArrayList <String> books;

    private ArrayList<String> librarians;
    private boolean searchResultForUser;

    private boolean searchResultForLibrarians;
    private boolean searchResultForBook;

    public boolean SearchForUser(String user)
    {
        if(users.contains(user))
        {
            searchResultForUser = true;
        }
        else {
            searchResultForUser = false;
        }
        return searchResultForUser;
    }
    public boolean SearchForBook(String book)
    {
        if(books.contains(book))
        {
            searchResultForBook = true;
        }
        else {
            searchResultForBook = false;
        }
        return searchResultForBook;
    }
    public boolean SearchForLibrarian(String librarian)
    {
        if(librarians.contains(librarian))
        {
            searchResultForLibrarians = true;
        }
        else {
            searchResultForLibrarians = false;
        }
        return searchResultForLibrarians;
    }

    public void addBook(String book)
    {
        books.add(book);
    }
    public void removeBook(String book){
        books.remove(book);
    }
    public void updateBook(String book){

    }

    public void addUser(String user)
    {
        users.add(user);
    }
    public void removeUser(String user){
        users.remove(user);
    }
    public void updateUser(String user){
    }

    public void addLibrarian(String librarain)
    {
        librarians.add(librarain);
    }
    public void removeLibrarian(String librarian){
        librarians.remove(librarian);
    }
    public void updateLibrarian(String librarian){
    }
    /*
    * The librarian should have a username and a password
    * The librarian should be able to search users, librarians and books
    * The librarian should be able to add\remove\update user add\remove\update_
    _ librarian and add\remove\update book
     */


}
