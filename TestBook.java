import java.lang.*;
public class TestBook
{
    public static void main(String[] args)
    {
        Book b1 = new Book();
        Book b2 = new Book(280);
        Book b3 = new Book("Cloackwork orange");
        b1.printData();
        b1.setData("Steppenwolf", 320);
        b1.printData();
        b2.printData();
        b3.printData();
    }

}