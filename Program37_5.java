/*write a java program which accept number from rows and columns from user and display the below pattern
Input   :   iRow = 3        iCol = 4
Output  :   1   1   1   1
            2   2   2   2
            3   3   3   3
            4   4   4   4 ........*/
            
import java.util.*;
class Number
{
    public void Display(int iRow, int iCol)
    {
    
        for(int i = 1;i<= iRow;i++)
        {
            for(int j = 1;j <= iCol;j++)
            {
                    System.out.print("\t"+i);

            }
            System.out.println("");

        }

    }
}
class Program37_5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the iRow");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the number of coloumns");
        int iNo2 = sobj.nextInt();

        Number nobj = new Number();

        nobj.Display(iNo1,iNo2);
    }
}