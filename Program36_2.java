/*write a java program which accept number from rows and columns from user and display the below pattern
Input   :   iRow = 4        iCol = 3
Output  :   A   B   C   D
            a   b   c   d   
            A   B   C   D
            a   b   c   d   ....... */

import java.util.*;
class Pattern
{
    public void Display(int iRow, int iCol)
    {
        char ch1 = 'A';
        char ch2 = 'a';
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(i % 2 == 0)
                {
                    System.out.print("\t"+(char)(ch1-i));
                    ch1++;
                }
                else
                {
                    System.out.print("\t"+(char)(ch2+j));
                }
            }

            System.out.println("");
        }
    }
}
class Program36_2
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