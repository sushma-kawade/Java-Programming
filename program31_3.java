/*Write a java program which accept string from user and return diffrance between fequency of small character and frequency of capital characters.
Input:  "MarvellouS"
Output:     6   (8-2)........ */

import java.util.*;

class StringDemo
{
    public int CountDiff(String s)
    {
        int iCnt1 = 0,iCnt2 = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z'))
            {
                iCnt1++;
            }
            
        }
        for(int i = 0; i < s.length(); i++)
        {
            if((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z'))
            {
                iCnt2++;
            }
            
        }
        return iCnt2 - iCnt1;

    }
}
class program31_3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();
        int iRet = obj.CountDiff(str);

        System.out.println("The diffrance between frequency of capital and small number:"+iRet);
    }
}
