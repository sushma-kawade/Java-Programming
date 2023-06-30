/*write a java program which accept number from rows and columns from user and display the below pattern
Input   :   Hello

Output  :   H   *   *   *   *  
            H   e   *   *   *
            H   e   l   *   *
            H   e   l   l   *........*/
            
import java.util.*;
class Pattern
{
    public void Display(String str)
    {
    
        for(int i = 1;i < str.length();i++)
        {
            for(int j = 0;j < str.length();j++)
            {
                if(i>j)
                {
                    System.out.print(str.charAt(j)+"\t");
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
class Program39_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String s = sobj.nextLine();

        Pattern pobj = new Pattern();

        pobj.Display(s);
    }
}