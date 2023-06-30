        /*write a java program which accept number from rows and columns from user and display the below pattern
Input   :   iRow = 5        iCol = 5
Output  :   1   2   3   4   5
            1   2           5   
            1       3       5   
            1           4   5   
            1   2   3   4   5    ....... */

import java.util.*;
class Pattern
{
    public void Display(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if((i == 1) || (i == iRow) || (j == 1) || (j == iCol))
                {
                    System.out.print("\t"+j);
                }
                else if((i<=j) && (i>=j))
                {
                    System.out.print("\t"+j);

                }
                else
                {
                    System.out.print("\t");
                }
            }

            System.out.println("");
        }
    }
}
class Program40_5
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
