package books;

/**
 * Created by user1 on 30.09.2016.
 */
public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title,String author,int price,int isbn,String language,int level){
        super(title,author,price,isbn);
        this.language=language;
        this.level=level;
    }

    public String getLanguage(){
        return language;
    }

    public void setLanguage(String language){
        this.language=language;
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int level){
        this.level=level;
    }

    @Override
    public boolean equals(Object object){
        if(object==null)
            return false;
        if(this==object)
            return true;
        if(getClass()!=object.getClass())
            return false;
        if(!super.equals(object))
            return false;
       ProgrammerBook book=(ProgrammerBook)object;
        if(this.getLevel()!=book.getLevel())
            return false;
        return this.getLanguage()!=null ? this.getLanguage().compareTo(book.getLanguage())==0 : book.getLanguage()==null;
    }

    @Override
    public int hashCode() {
        int result=super.hashCode()+this.getLevel();
        if(this.getLanguage()!=null)
            result+=this.getLanguage().hashCode();
        return result;
    }

    @Override
    public String toString(){
        return "Class:ProgrammerBook, Parent:Book, language = '"+language+'\''+", level = '"+level+'\'';
    }
}
