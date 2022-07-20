package lab_14;

import java.io.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import static lab_14.BookController.*;

public class Lab_14_BookManagement {

    public static void main(String[] args) {

        int userOption = 1;
        boolean isContinueToPlay = true;
        String dataFileRelativePath = "/src/lab_14/BookList.txt";
        String dataFileAbsolutePath = System.getProperty("user.dir").concat(dataFileRelativePath);
        HashMap<String, Book> bookList;

        while (isContinueToPlay) {

            //Create menu program
            createMenu();
            System.out.print("Please choose an option: ");
            userOption = getUserNumber();

            switch (userOption) {

                case 1: //Add a new book - The book is saved into DB wit info: Book {ISBN, title, author, year}
                    //Get the old book list -> add new -> save again!
                    //Check if the ISBN, book title have been saved.

                    //Get current book list
                    bookList = readBookData(dataFileAbsolutePath);

                    //Add new book
                    addBook(bookList);

                    //Save book list
                    saveBookData(bookList, dataFileAbsolutePath);
                    break;

                case 2: //Find a book by ISBN
                    //If the book found -> print the Book {ISBN, title, author, year}
                    //If the book is not found -> Book with ISBN <1234> is not found

                    //Get current book list
                    bookList = readBookData(dataFileAbsolutePath);
                    findBook(bookList);
                    break;

                case 3: //Update a book - (control if the book is not existing...)
                    // The book is now updated with new content: Book {ISBN, title, author, year}
                    //Get the book list -> find -> Update that book object -> save again!

                    //Get current book list and update a book
                    bookList = readBookData(dataFileAbsolutePath);
                    updateBook(bookList);

                    //Save book list
                    saveBookData(bookList, dataFileAbsolutePath);
                    break;

                case 4: //Delete a book - (control if the book is not existing...)
                    //Get the book list -> find -> Delete that book object -> save again!

                    bookList = readBookData(dataFileAbsolutePath);
                    deleteBook(bookList);

                    //Save book list
                    saveBookData(bookList, dataFileAbsolutePath);
                    break;

                case 5: //Print the book list

                    bookList = readBookData(dataFileAbsolutePath);
                    printBookList(bookList);
                    break;

                case 0: //Exit

                    isContinueToPlay = false;
                    System.out.println("See you again!");
                    break;

                default:
                    System.out.println("Please choose again!");
            }
        }
    }
}