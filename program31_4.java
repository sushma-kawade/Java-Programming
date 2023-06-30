/*Write a java program which accept string from user and check whetre it contain vowel in it or not.
Input:  "marvellous"
Output:     True

Input:  "Demo"
Output:     True

Input:   "xyz"
Output:     False........ */

import java.util.*;
class StringDemo
{
    public boolean ChkVowel(String s)
    {
        for(int i = 0; i < s.length();i++)
        {
            if((s.charAt(i) == 'a' )|| (s.charAt(i) == 'e')||(s.charAt(i) == 'i') ||(s.charAt(i) == 'o')||(s.charAt(i) == 'u'))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        

    }
}
class program31_4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sobj.nextLine();
        StringDemo obj = new StringDemo();
        boolean bRet = obj.ChkVowel(str);
        if(bRet == true)
        {
            System.out.println("The string is vowel\n");
        }
        else
        {
            System.out.println("The string is not vowel\n");
        }

    }
}

