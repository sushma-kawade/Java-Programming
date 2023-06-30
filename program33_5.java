/*Write the java program which accept the number from user and return the difrance between summetion of even and odd digit.
Input:  2395
output: -15 (2-17)

Input:  1018
output: 6   (8-2)

Input:  8440
output: 16  (16-0)......... */

import java.util.*;

class Digit
{
    public int CountDiff(int iNo)
    {
        int iEvenCnt = 0,iDigit = 0,iOddCnt = 0,iSum = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 == 0)
            {
                iEvenCnt = iEvenCnt + iDigit;
            }
            else if(iDigit % 2 != 0)
            {
                iOddCnt = iOddCnt + iDigit;
            }
            iNo = iNo / 10;
        }
        return iEvenCnt - iOddCnt;
    }
}

class program33_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter number : ");
        int iNo = sobj.nextInt();

        Digit nobj = new Digit();

        int bRet = nobj.CountDiff(iNo);

        System.out.println("the number is   :\n"+bRet);
    }
}