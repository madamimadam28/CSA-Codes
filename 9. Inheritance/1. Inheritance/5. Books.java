/* For this activity, you are going to refactor the Book superclass and the Encyclopedia and Mystery subclasses.

Right now, the Book class is empty and the Encyclopedia and Mystery classes have instance variables and getter and setter methods. Your task is to move common attributes and methods to the Book superclass and remove them from the subclasses.

Note: You do not need a constructor in any class. */

public class Book
{
    private int pages;
    private String title;
    
    public int getPages() {
        return pages;
    }
    
    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
}

public class Encyclopedia extends Book
{
    private int articles;
    private String startLetter;
    private String endLetter;

    
    public int getArticles(){
        return articles;
    }
    
    public void setArticles(int numArticles){
        articles = numArticles;
    }
    
    public String getStartLetter(){
        return startLetter;
    }
    
    public void setStartLetter(String startLetter){
        this.startLetter = startLetter;
    }
    
    public String getEndLetter(){
        return endLetter;
    }
    
    public void setEndLetter(String endLetter){
        this.endLetter = endLetter;
    }
    
}

public class Mystery extends Book
{
    private String subgenre;
    private String author;
    
    
    public String getSubgenre() {
        return subgenre;
    }
    
    public void setSubgenre(String subgenre) {
        this.subgenre = subgenre;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
}

public class BookTester
{
    public static void main(String[] args)
    {
        Mystery oneIsLying = new Mystery();
        
        oneIsLying.setPages(374);
        oneIsLying.setTitle("One of Us Is Lying");
        oneIsLying.setAuthor("Karen M. McManu");
        oneIsLying.setSubgenre("Crime Mystery");
        
        
        Encyclopedia britannica = new Encyclopedia();
        britannica.setPages(1009);
        britannica.setTitle("Original Encyclopedia Britannica, Vol. 3");
        britannica.setArticles(30);
        britannica.setStartLetter("C");
        britannica.setEndLetter("L");
        
        
        System.out.println(oneIsLying.getTitle());
        System.out.println(britannica.getTitle());
    }
}