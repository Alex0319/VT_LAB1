package books;

import java.util.Comparator;

/**
 * Created by user1 on 30.09.2016.
 */
public class Book implements Comparable,Cloneable{
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;

    public Book(String title,String author,int price,int isbn){
        this.author=author;
        this.title=title;
        this.price=price;
        this.isbn=isbn;
    }

    public void setIsnb(int isbn){
        this.isbn=isbn;
    }

    public int getIsbn(){
        return isbn;
    }

    public void setBookTitle(String title){
        this.title=title;
    }

    public String getBookTitle(){
        return title;
    }

    public void setBookAuthor(String author){
        this.author=title;
    }

    public String getBookAuthor(){
        return author;
    }

    public void setBookPrice(int price){
        this.price=price;
    }

    public int getBookPrice(){
        return price;
    }

    public void setBookEdition(int edition){
        Book.edition=edition;
    }

    public int getBookEdition(){
        return Book.edition;
    }


    @Override
    public boolean equals(Object object){
        if(object==null)
            return false;
        if(this==object)
            return true;
        if(getClass()!=object.getClass())
            return false;
        Book book=(Book)object;
        if(this.getBookPrice()!=book.getBookPrice())
            return false;
        if(this.getBookTitle()!=null) {
            if (this.getBookTitle().compareTo(book.getBookTitle()) != 0)
                return false;
        }
        else
            if(book.getBookTitle()!=null)
                return false;
        return this.getBookAuthor()!=null ? this.getBookAuthor().compareTo(book.getBookAuthor())==0 : book.getBookAuthor()==null;
    }

    @Override
    public int hashCode() {
        final int PRIME=37;
        int result=0;
        result=PRIME*result+this.getBookPrice();
        if(this.getBookAuthor()!=null)
            result+=this.getBookAuthor().hashCode();
        if(this.getBookTitle()!=null)
            result+=this.getBookTitle().hashCode();
        return result;
    }

    @Override
    public String toString(){
        return "Class:Book, Parent:Object, title = '"+title+'\''+", author = '"+
                author+'\''+", price = '"+price+'\''+", edition = '"+edition+'\'';
    }

    @Override
    public  Book clone() throws CloneNotSupportedException{
        Book cloneObj=(Book)super.clone();
        return cloneObj;
    }

    @Override
    public int compareTo(Object object) {
        int result=1;
        if(object==null)
            return result;
        Book book=(Book)object;
        if((result=this.getIsbn()-book.getIsbn()) != 0)
            return result / Math.abs(result);
        return result;
    }

    public static class SortedByTitle implements  Comparator<Book>{

        @Override
        public int compare(Book object1, Book object2) {
            if(object1==null && object2!=null)
                return -1;
            if(object1!=null && object2==null)
                return 1;
            return object1.getBookTitle().compareTo(object2.getBookTitle());
        }
    }

    public static class SortedByTitleAndAuthor implements  Comparator<Book>{

        @Override
        public int compare(Book object1, Book object2) {
            if(object1==null && object2!=null)
                return -1;
            if(object1!=null && object2==null)
                return 1;
            int compareResult=object1.getBookTitle().compareTo(object2.getBookTitle());
            if(compareResult==0)
                compareResult=object1.getBookAuthor().compareTo(object2.getBookAuthor());
            return compareResult;
        }
    }

    public static class SortedByAuthorAndTitle implements  Comparator<Book>{

        @Override
        public int compare(Book object1, Book object2) {
            if(object1==null && object2!=null)
                return -1;
            if(object1!=null && object2==null)
                return 1;
            int compareResult=object1.getBookAuthor().compareTo(object2.getBookAuthor());
            if(compareResult==0)
                compareResult=object1.getBookTitle().compareTo(object2.getBookTitle());
            return compareResult;
        }
    }

    public static class SortedByAuthorAndTitleAndPrice implements  Comparator<Book>{

        @Override
        public int compare(Book object1, Book object2) {
            if(object1==null && object2!=null)
                return -1;
            if(object1!=null && object2==null)
                return 1;
            int compareResult=object1.getBookAuthor().compareTo(object2.getBookAuthor());
            if(compareResult==0)
                compareResult=object1.getBookTitle().compareTo(object2.getBookTitle());
            if(compareResult==0)
                if(object1.getBookPrice()>object2.getBookPrice())
                    return 1;
                else if(object1.getBookPrice()<object2.getBookPrice())
                    return -1;
            return compareResult;
        }
    }
}
