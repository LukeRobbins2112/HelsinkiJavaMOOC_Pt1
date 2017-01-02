import java.util.ArrayList;

public class Library {
    
    private ArrayList<Book> books;
    
    public Library(){
        this.books  = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook){
        this.books.add(newBook);
    }
    
    public void printBooks(){
        for (Book eachBook : this.books){
            System.out.println(eachBook);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for (Book eachBook : this.books){
            if (StringUtils.included(eachBook.toString(), title)){
                found.add(eachBook);
            }
        }
        
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for (Book eachBook : this.books){
            if (StringUtils.included(eachBook.toString(), publisher)){
                found.add(eachBook);
            }
        }
        
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for (Book eachBook : this.books){
            if (eachBook.year() == year){
                found.add(eachBook);
            }
        }
        
        return found;
    }
}
