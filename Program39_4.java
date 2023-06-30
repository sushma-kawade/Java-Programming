/*write a java program which accept number from rows and columns from user and display the below pattern
Input   :   Hello

            H            
            H   e      
            H   e   l
            H   e   l   l
Output  :   H   e   l   l   o
            H   e   l   l     
            H   e   l   
            H   e      
            H           .......*/
            
import java.util.*;
class Pattern
{
    public void Display(int iRow,int iCol)
    {
        int i = 0, j = 0;

        for(i = iRow; i > 1; i--)
        {
            for(j = 0; j <= iCol; j++)
            {
                if(i>j)
                {
                    System.out.print("\t*");
                }

            }
            System.out.println();
        }
        for(i = iRow; i >= 1; i--)
        {
            for(j = 0; j <= iCol; j++)
            {
                if(i<j)
                {
                    System.out.print("\t");
                }
                else
                {
                    System.out.print("\t*");
                }

            }
            System.out.println();
        }      
    }
}

class Program39_4
{
    public static void main(String a[])
    {
        Pattern pobj = new Pattern();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter no row : ");
        int iNo1 = sobj.nextInt();
        
        System.out.println("Enter no col : ");
        int iNo2 = sobj.nextInt();
        pobj.Display(iNo1,iNo2);
    }
}
