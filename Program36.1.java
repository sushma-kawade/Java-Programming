import java.util.*;
class Pattern
{
    public void Display(int iNo)
    {

    }
}
class Program36.1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Rows and Columns:");
        int iNo = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iNo);
    }
}