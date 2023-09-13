import java.lang.*;
public class TestDog
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog();
        Dog d2 = new Dog(6);
        Dog d3 = new Dog("Phil");
        d1.printData();
        d1.setData("Shev", 12);
        d1.printData();
        d2.printData();
        d3.printData();
    }

}