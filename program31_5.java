/*Write a java program which accept string from user and Displai in it in reverse order.
Input:  "Marvellous "
Output:     suollevraM........ */

import java.util.*;
class StringDemo
{
    public int CountCapital(String s)
    {
        String nstr = "";
        for(int i = s.length()-1; i >= 0; i--)
        {
            nstr = nstr + s.charAt(i);
            System.out.println("Reverse of enter string is :"+nstr);
        }
    

    }
}
class program31_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please string : ");
        String str = sobj.nextLine();
        StringDemo obj = new StringDemo();
        obj.CountCapital(str);
        //System.out.println("Number of capital case letters are : "+iRet);

       
    }
}