import java.lang.*;
public class Ball {
    private String color;
    private String size;
    public Ball()
    {
        color = "Blue";
        size = "Average";
    }
    public Ball(String c, String s)
    {
        color = c;
        size = s;
    }
    public void setData(String c, String s)
    {
        this.color = c;
        this.size = s;
    }
    public void printData()
    {
        System.out.println("Color - " + color + "\n Size - " + size);
    }
}