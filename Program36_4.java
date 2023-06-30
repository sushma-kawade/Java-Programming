/*write a java program which accept number from rows and columns from user and display the below pattern
Input   :   iRow = 4        iCol = 5
Output  :   4   4   4   4   4      
            3   3   3   3   3
            2   2   2   2   2
            1   1   1   1   1 ....... */

import java.util.*;
class Pattern
{
    public void Display(int iRow, int iCol)
    {
        for(int i = iRow; i >= 1; i--)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print("\t" +i);
            }
            System.out.println("");
        }
    }
}
class Program36_4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of Rows :");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the number of column :");
        int iNo2 = sobj.nextInt(); 

        Pattern pobj = new Pattern();
        pobj.Display(iNo1,iNo2);
    }
}