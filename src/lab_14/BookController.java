package lab_14;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class BookController {

    public static void createMenu() {
        System.out.println("========== Book Management Program (CRUD) ==========");
        System.out.println("1. New book");
        System.out.println("2. Find a book (by ISBN)");
        System.out.println("3. Update a book");
        System.out.println("4. Delete a book");
        System.out.println("5. Print the book list");
        System.out.println("0. Exit");
    }

    public static int getUserNumber() {

        int userNumber = 0;
        boolean isContinue = true;
        while (isContinue){
            try {
                isContinue = false;
                userNumber = new Scanner(System.in).nextInt();
            } catch (Exception e) {
                createMenu();
                System.out.print("Please input a number from 0 to 5: ");
                isContinue = true;
            }
        }

        return userNumber;
    }

    public static String getUserInput() {
        return new Scanner(System.in).next();
    }

    public static void addBook(HashMap<String, Book> bookList) {

        System.out.print("Please input ISBN: ");
        String ISBN = getUserInput();
        boolean isSaved = true;

        //Check if ISBN was used
        while (isSaved) {
            isSaved = false;
            for (Book book : bookList.values()) {
                String savedISBN = book.getISBN();
                if (ISBN.equals(savedISBN)) {
                    isSaved = true;
                }
            }
            if (isSaved) {
                System.out.print("Please choose another ISBN: ");
                ISBN = getUserInput();
            }
        }
        
        System.out.print("Please input title: ");
        String title = getUserInput();
        System.out.print("Please input author: ");
        String author = getUserInput();
        System.out.print("Please input year: ");
        String year = getUserInput();

        Book book = new Book(ISBN, title, author, year);
        bookList.put(book.getISBN(), book);
        for (Book book1 : bookList.values()) {
            System.out.println(book1);
        }
    }

    public static HashMap readBookData(String filePath) {
        HashMap<String, Book> bookList = new HashMap<>();

        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {
                String[] bookData = dataLine.split(";");
                String ISBN = bookData[0];
                String title = bookData[1];
                String author = bookData[2];
                String year = bookData[3];
                Book book = new Book(ISBN, title, author, year);
                bookList.put(ISBN, book);
                dataLine = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bookList;
    }

    public static void saveBookData(HashMap<String, Book> bookList, String filePath) {
        if (bookList == null || filePath == null) {
            throw new IllegalArgumentException("Book list and file path cannot be null.");
        }

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {
            for (Book book : bookList.values()) {
                String ISBN = book.getISBN();
                String title = book.getTitle();
                String author = book.getAuthor();
                String year = book.getYear();

                String dataLine = ISBN + ";" + title + ";" + author + ";" + String.valueOf(year);

                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void findBook(HashMap<String, Book> bookList) {
        //Find a book by ISBN
        //If the book found -> print the Book {ISBN, title, author, year}
        //If the book is not found -> Book with ISBN <1234> is not found


        System.out.print("Please input ISBN of the book you want to find: ");
        String findISBN = getUserInput();
        boolean isSaved = true;

        isSaved = false;
        for (Book book : bookList.values()) {
            String savedISBN = book.getISBN();
            if (findISBN.equals(savedISBN)) {
                isSaved = true;
            }
        }
        if (isSaved) {
            System.out.println(bookList.get(findISBN));
        } else {
            System.out.printf("Book with ISBN <%s> is not found. \n", findISBN);
        }
    }

    public static void updateBook(HashMap<String, Book> bookList) {

        System.out.print("Please input ISBN of the book you want to update: ");
        String ISBN = getUserInput();
        boolean isSaved = true;

        //Check ISBN
        while (isSaved) {
            isSaved = false;
            for (Book book : bookList.values()) {
                String savedISBN = book.getISBN();
                if (ISBN.equals(savedISBN)) {
                    isSaved = true;
                    break;
                }
            }
            if (isSaved) {
                break;
            } else {
                System.out.print("Please choose another ISBN: ");
                ISBN = getUserInput();
            }
        }
        
        System.out.print("Please input title: ");
        String title = getUserInput();
        System.out.print("Please input author: ");
        String author = getUserInput();
        System.out.print("Please input year: ");
        String year = getUserInput();

        Book book = new Book(ISBN, title, author, year);
        bookList.replace(book.getISBN(), book);
        for (Book book1 : bookList.values()) {
            System.out.println(book1);
        }
    }

    public static void printBookList(HashMap<String, Book> bookList) {
        for (Book book1 : bookList.values()) {
            System.out.println(book1);
        }
    }

    public static void deleteBook(HashMap<String, Book> bookList) {
        System.out.print("Please input ISBN of the book you want to delete: ");
        String ISBN = getUserInput();
        boolean isSaved = true;

        //Check ISBN
        while (isSaved) {
            isSaved = false;
            for (Book book : bookList.values()) {
                String savedISBN = book.getISBN();
                if (ISBN.equals(savedISBN)) {
                    isSaved = true;
                    break;
                }
            }
            if (isSaved) {
                break;
            } else {
                System.out.print("Please choose another ISBN: ");
                ISBN = getUserInput();
            }
        }

        bookList.remove(ISBN);
        for (Book book1 : bookList.values()) {
            System.out.println(book1);
        }

    }

    public static void exitProgram() {

    }

}
