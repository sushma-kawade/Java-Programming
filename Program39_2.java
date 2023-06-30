/*write a java program which accept number from rows and columns from user and display the below pattern
Input   :   Hello

Output  :   H   e   l   l   o  
            H   e   l   l   *
            H   e   l   *   *
            H   e   *   *   *
            H   *   *   *   *........*/
            
import java.util.*;
class Pattern
{
    public void Display(String str)
    {
    
        for(int i = str.length();i > 0;i--)
        {
            for(int j = 0;j < str.length();j++)
            {
                
                if((i < j) && (i > j))
                {
                    System.out.print(str.charAt(j)+"\t");
                }
                else if(i>j)
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
class Program39_2
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