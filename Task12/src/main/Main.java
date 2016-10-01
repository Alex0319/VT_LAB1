package main;

import books.Book;
import books.ProgrammerBook;

/**
 * Created by user1 on 30.09.2016.
 */
public class Main {
    public static void main(String[] args){
        Book firstBook=new Book("Harry Potter","Joanne Rowling",50,1);
        Book newBook=new Book("Harry Potter","Joanne Rowling",50,1);
        Book secondBook=new ProgrammerBook("Thinking in Java","Bruce Eckel",100,5,"Java",3);
        System.out.println(firstBook.equals(newBook));
        System.out.println(firstBook.toString());
        System.out.println(secondBook.toString());
    }
}
