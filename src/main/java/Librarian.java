import java.util.ArrayList;
import java.util.Hashtable;

public class Librarian extends Book {
    private String username;
    private String password;

    private ArrayList<String> librarians = new ArrayList<>(10);
    private boolean searchResultForUser;

    private boolean searchResultForLibrarians;
    private boolean searchResultForBook;

    public Librarian(String username, String password) {
        this.username = username;
        this.password = password;
        librarians.add(0,username);
    }

   /* public boolean SearchForUser(String user)
    {
        if(users.contains(user))
        {
            searchResultForUser = true;
        }
        else {
            searchResultForUser = false;
        }
        return searchResultForUser;
    }*/
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



    public void addLibrarian(String librarain)
    {
        librarians.add(librarain);
    }
    public void removeLibrarian(String librarian){
        librarians.remove(librarian);
    }
    public void updateLibrarian(String username, String password){
        this.username = username;
        this.password = password;
    }



}
