import java.lang.*;
public class Author
{
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName()
    {
        return this.name;
    }
    public String getEmail()
    {
        return this.email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public char getgender()
    {
        return gender;
    }
    @Override
    public String toString()
    {
      return "Author (" + this.name + ", " + this.email + ", " + this.gender +").";
    }
}