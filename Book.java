import java.lang.*;
public class Book {
    private String name;
    private int pageNum;
    public Book()
    {
        name = "Drei komeraden";
        pageNum = 486;
    }
    public Book(String n)
    {
        name = n;
        pageNum = 0;
    }
    public Book(int n)
    {
        name = "None";
        pageNum = n;
    }
    public void setData(String n, int p)
    {
        this.name = n;
        this.pageNum = p;
    }
    public void printData()
    {
        System.out.println("Name - " + name + "\n Page num - " + pageNum);
    }
}