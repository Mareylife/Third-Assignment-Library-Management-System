import java.util.ArrayList;
import java.util.Hashtable;

public class Library{
    public Hashtable<Integer, Integer> booksList;
    public Hashtable<String, Integer> booksListWithNames;
    public Hashtable<String, String> usersList ;
    public Hashtable<String, String> librariansList;

    public Library(){
        booksList = new Hashtable<>(10);
        booksListWithNames = new Hashtable<>(100);
        usersList = new Hashtable<>(100);
        librariansList = new Hashtable<>(10);
        addBook("harryPotter", 1 , 10);
        //addbooks
        //

    }
    /*
    * The library should have a list of books.
    * The library should have a map of books ISBNs which is linked to the amount of book
    -> (for example: harry potter -> 4 means there are currently 4 harry potter books)
    * The library should have a list of users and a list of librarians.
     */

    //book related functions

    public void addBook (String name,int isbn, int countOfBooks){
        booksList.put(isbn,countOfBooks);
        booksListWithNames.put(name,isbn);
    }

    public void removeBook(String bookName){
        booksList.remove(bookName);
    }

    public boolean searchBook(String name, int isbn){
        if(booksList.get(isbn) != 0)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public void updateBook(){
        //TODO
    }

    public boolean doesBookExist(int  isbn){
        if(booksList.get(isbn) != 0)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public int getCountOfBooks(int isbn){
        return booksList.get(isbn);
    }
    public void increaseBook(int isbn, int increase){
        int count = getCountOfBooks(isbn) + increase;
        booksList.replace(isbn,count);
    }

    public void decreaseBook(int isbn, int decrease){
        int count = getCountOfBooks(isbn) + decrease;
        booksList.replace(isbn,count);
    }

    //user related functions

    public void addUser(String username,String password){
        usersList.put(username,password);
    }

    public void removeUser(String username){
        usersList.remove(username);
    }

    public void searchUser(String username ){
        /*if(usersList.contains(username))
        {
            System.out.println("User with username : " + username + "");
        }*/
    }

    public void updateUser(){
        //TODO
    }

    public void doesUserExist(){
        //TODO
    }

    //librarian related functions

    public void addLibrarian(){
        //TODO
    }

    public void removeLibrarian(){
        //TODO
    }

    public void searchLibrarian(){
        //TODO
    }

    public void updateLibrarian(){
        //TODO
    }

    public void doesLibrarianExist(){
        //TODO
    }

}
