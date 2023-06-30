/*write a java program which accept number from rows and columns from user and display the below pattern
Input   :   iRow = 4        iCol = 4
Output  :   *   #   *   #
            *   #   *   #
            *   #   *   #
            *   #   *   #........*/
            
import java.util.*;
class Number
{
    public void Display(int iRow, int iCol)
    {
    
        for(int i = 1;i<= iRow;i++)
        {
            for(int j = 1;j <= iCol;j++)
            {
                if((j % 2) == 0)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("*\t");
                }

            }
            System.out.println("");

        }

    }
}
class Program37_4
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