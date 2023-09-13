import java.lang.*;
public class TestAuthor
{
    public static void main(String[] args)
    {
        Author a = new Author("Hermann Hesse", "hesse1@deuch.com", 'm');
        System.out.println(a.getName() +" "+ a.getEmail() +" "+ a.getgender());
        String s = a.toString();
        System.out.println(s);
    }
}