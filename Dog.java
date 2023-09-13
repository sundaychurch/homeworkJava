import java.lang.*;
public class Dog {
    private String name;
    private int age;
    public Dog()
    {
        name = "Ghost";
        age = 5;
    }
    public Dog(String n)
    {
        name = n;
        age = 0;
    }
    public Dog(int n)
    {
        name = "None";
        age = n;
    }
    public void setData(String n, int a)
    {
        this.name = n;
        this.age = a;
    }
    public void printData()
    {
        System.out.println("Name - " + name + "\n Age - " + age);
    }
}