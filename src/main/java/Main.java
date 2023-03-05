import java.util.Scanner;

public class Main {
    /*
    * make a functional library app using oop
    * run the main program in Main.java and code the oop part in other classes
    * don't forget to add at least 1 librarian to the library to make it functionable.
    * *  *** don't limit yourself to our template ***
     */

    public static void main(String[] args) {
        System.out.println("<< Welcome to our library! >>");
        System.out.println("please choose one of User/Librarian for log in, then enter you're username and password:");
        Scanner input = new Scanner(System.in);
        String userOrLibrarian  = input.next();
        String username =  input.next();
        String password =  input.next();
        runMenu(userOrLibrarian,username,password);

        User user1 = new User(username,password);
        Library library = new Library();
        library.addUser(username,password);


        if(userOrLibrarian.equals("user"))
        {
            int number;
            do {
                System.out.println("Now what you wanna do?" + "\n" +
                        "1. rent book" + "\n" +
                        "2. return book" + "\n"+
                        "3. see your favorite book is exist or not" + "\n" +
                        "4. see how many of your favorie book has left" + "\n" +
                        "5. see your borrowed books" +"\n" +
                        "6. show your username and password" + "\n" +
                        "7.update your username and password" + "\n" +
                        "8. log out");

                number = input.nextInt();
                if(number == 1) { //rent book
                    System.out.println("please enter the book's name");
                    String name = input.next();
                    //int isbn = input.nextInt();
                    int isbn = library.booksListWithNames.get(name);
                    if(library.searchBook(name,isbn))
                    {
                        user1.rentBook(name);
                        library.decreaseBook(isbn,1);
                        System.out.println("You added this book to your list successfully");
                    }
                    else{
                        System.out.println("This book is out of stock");
                    }
                }
                else if (number == 2){ //return book
                    System.out.println("please enter the book's name");
                    String name = input.next();
                    if(user1.books.contains(name)){
                        user1.returnBook(name);
                        System.out.println("Thank you for returning this book :)");
                    }
                    else {
                        System.out.println("You have nothing to return!");
                    }
                }
                else if (number == 3) {
                    System.out.println("please enter the book's name");
                    String name = input.next();
                    if(library.booksListWithNames.contains(name))
                    {
                        System.out.println("Yes!");
                    }
                    else {
                        System.out.println("No!");
                    }

                }
                else if (number == 4){
                    System.out.println("please enter the book's name");
                    String name = input.next();
                    System.out.println(library.getCountOfBooks(library.booksList.get(name))); //?
                }
                else if(number == 5)
                {
                    for (int i = 0; i < user1.books.size(); i++) {
                         if(user1.books.get(i) != null)
                         {
                             System.out.print(user1.books.get(i));
                         }
                    }
                    System.out.println();
                } else if (number == 6) {
                    System.out.println("your username is:" + user1.getUsername() + " and your password is:" + user1.getPassword());

                } else if (number == 7) {
                    System.out.print("enter your new username:");
                    String usernameNew = input.next();
                    user1.setUsername(usernameNew);
                    System.out.print("enter your new password");
                    String passwordNew = input.next();
                    user1.setPassword(passwordNew);
                    System.out.println("Done!");
                } else {
                    System.out.println("bye bye! see you later!");
                }
            }while (number != 8);
        }
        else { //librarian

        }


    }


    public static void runMenu(String userOrLibrarian, String username,String password ){
        User user1 = new User(username,password);
        Library library = new Library();
        if(userOrLibrarian == "user")
        {
            if(library.usersList.get(username) != null)
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
        /*else {
            if(library.librariansList.get(username) != null)
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
        }*/
    }

    //public static void rentBook(String)
}
