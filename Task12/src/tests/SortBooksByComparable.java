package tests;

import books.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

/**
 * Created by user1 on 30.09.2016.
 */
public class SortBooksByComparable {
    @Test
    public void sorted6BooksByComparable_1_Returned1(){
        int expectedIsbn=1;
        TreeSet<Book> booksTreeSet=new TreeSet<Book>();
        for(int i=6;i>0;i--)
            booksTreeSet.add(new Book("Harry Potter","Joanne Rowling",60,i));
        Assert.assertEquals(expectedIsbn,booksTreeSet.first().getIsbn());
    }

    @Test
    public void sorted6BooksByComparable_6_Returned6(){
        int expectedIsbn=6;
        TreeSet<Book> booksTreeSet=new TreeSet<Book>();
        for(int i=6;i>0;i--)
            booksTreeSet.add(new Book("Harry Potter","Joanne Rowling",60,i));
        Assert.assertEquals(expectedIsbn,booksTreeSet.last().getIsbn());
    }
}
