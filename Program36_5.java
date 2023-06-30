/*write a java program which accept number from rows and columns from user and display the below pattern
Input   :   iRow = 3        iCol = 4
Output  :   1   2   3   4
            5   6   7   8
            9   10  11  12.......*/

import java.util.*;
class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int num = 1;
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print("\t" +num);
                num++;
            }
            System.out.println("");
        }
    }
}
class Program36_5
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