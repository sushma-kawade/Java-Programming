/*write a java program which accept number from rows and columns from user and display the below pattern
Input   :   iRow = 3        iCol = 5
Output  :   A   A   A   A   A
            B   B   B   B   B
            C   C   C   C   C   ....... */

import java.util.*;
class Pattern
{
    public void Display(int iRow, int iCol)
    {
        char ch = 'A';
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print("\t"+(char)(ch+i));
            }
            System.out.println("");
        }
    }
}
class Program36_3
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