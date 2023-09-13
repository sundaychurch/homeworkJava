import java.lang.*;
public class TestBall
{
    public static void main(String[] args)
    {
        Ball b1 = new Ball();
        Ball b2 = new Ball("Grey","Small");
        b1.printData();
        b1.setData("Red", "Big");
        b1.printData();
        b2.printData();
    }

}