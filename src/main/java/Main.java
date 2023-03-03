import java.util.Scanner;

public class Main {
    /*
    * make a functional library app using oop
    * run the main program in Main.java and code the oop part in other classes
    * don't forget to add at least 1 librarian to the library to make it functionable.
    * *  *** don't limit yourself to our template ***
     */

    public static void main(String[] args) {
        System.out.println("Welcome to our library");
        System.out.println("please choose one of User/Librarian for log in, then enter you're username and password:");
        Scanner input = new Scanner(System.in);
        String username =  input.next();
        String password =  input.next();
        runMenu(input.next(),username,password);

        User user1 = new User(username,password);
        Library library = new Library();
        library.addUser(username,password);

        System.out.println("Now what you wanna do?" +
                "1. rent book" +
                "2. return book" +
                "3. see your favorite book is exist or not?" +
                "4. see how many of your favorie book has left ?" +
                "5.log out");
        int number = input.nextInt();

        if(number == 1) {
            //rent process
        }
        else if (number == 2){
            //return process
        }
        else if (number == 3) {
            //book doese exit?
        }
        else if (number == 4){
            //count of book
        }
        else {
            System.out.println("bye bye! see you later!");
        }

    }


    public static void runMenu(String userOrLibrarian, String username,String password ){
        User user1 = new User(username,password);
        Library library = new Library();
        if(userOrLibrarian == "user")
        {
            if(library.usersList.contains(username))
            {
                if (library.usersList.get(username) == password){
                    System.out.println("You loged in as user successfully!");
                }
                else {
                    System.out.println("Wrong password");
                }
            }
            else {
                System.out.println("Hi! You are new here.But don't worry! We made an account for you with these username and password");
            }
        }
        else {
            if(library.librariansList.contains(username))
            {
                if (library.librariansList.get(username) == password){
                    System.out.println("You loged in as librarian successfully!");
                }
                else {
                    System.out.println("Wrong password");
                }
            }
            else {
                System.out.println("Hi! You are new here.But don't worry! We made an account for you with these username and password");
            }
        }
    }

    //public static void rentBook(String)
}
