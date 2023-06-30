/*Write the java program which accept the number from user and return the count of even digit
Input:  2395
output: 1

Input:  1018
output: 2

Input:  -1018
output: 2......... */

import java.util.*;

class Digit
{
     public int CountEven(int iNo)
    {
        int iEvenCnt = 0,iDigit = 0;
        if(iNo == 0)
        {
            return 1;
        }
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 != 0)
            {
                iEvenCnt++;
            }
            iNo = iNo / 10;
            
        }
        return iEvenCnt;
    }
    
}

class program33_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter number : ");
        int iNo = sobj.nextInt();

        Digit nobj = new Digit();

        int bRet = nobj.CountEven(iNo);

        System.out.println("the number is   :\n"+bRet);
    }
}