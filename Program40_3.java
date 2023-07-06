        /*write a java program which accept number from rows and columns from user and display the below pattern
Input   :   iRow = 6        iCol = 6
Output  :   *   *   *   *   *   *
            *               *   *
            *           *       *
            *       *           *
            *   *               *
            *   *   *   *   *   * ....... */

import java.util.*;
class Pattern
{
    public void Display(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = iCol; j >= 1; j--)
            {
                if((i == 1) || (i == iRow) || (j == 1) || (j == iCol))
                {
                    System.out.print("\t*");
                }
                else if((i<=j) && (i>=j))
                {
                    System.out.print("\t*");
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
class Program40_3
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
