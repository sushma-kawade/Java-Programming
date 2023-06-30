/*write a java program which accept number from rows and columns from user and display the below pattern
Input   :   Hello

            H   e   l   l   o
            H   e   l   l
            H   e   l
            H   e
Output  :   H    
            H   e         
            H   e   l   
            H   e   l   l
            H   e   l   l   o   .......*/
            
import java.util.*;
class Pattern
{
    public void Display(String str)
    {
        int i = 0, j = 0;

        for(i = str.length(); i > 1; i--)
        {
            for(j = 0; j < str.length(); j++)
            {
                if(i>j)
                {
                    System.out.print(str.charAt(j)+"\t");
                }

            }
            System.out.println();
        }
        for(i = 1; i <= str.length(); i++)
        {
            for(j = 0; j <= str.length(); j++)
            {
                if(i>j)
                {
                    System.out.print(str.charAt(j)+"\t");
                }

            }
            System.out.println();
        }      
    }
}

class Program38_5
{
    public static void main(String a[])
    {
        Pattern pobj = new Pattern();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String s = sobj.nextLine();
        
        pobj.Display(s);
    }
}