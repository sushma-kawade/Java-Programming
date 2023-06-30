/*Write a program which accept N number from users and return diffrance between summation of odd and even number.
Input: 6
Elements:   85  66  3   80  93  88
Output:     53  (234-181).......*/

import java.util.*;

class ArrayDemo
{
    /*public int Arr[];
    public ArrayX(int iSize)
    {
        Arr = new int [iSize];
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("please enter the :" +Arr.length + "elemts");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println("Enter the elemts : "+(iCnt+1));
            Arr[iCnt] = sobj.nextInt();
        }
    }*/
    public int Diffrance(int Arr[])
    {
        int iEven = 0,iOdd = 0;
        
        System.out.println("Elements of array are : ");

        for(int iCnt =0; iCnt < Arr.length; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                iEven = iEven + iCnt;
            
            }
            else if((iCnt % 2) != 0)
            {
                iOdd = iOdd + iCnt;
            }
        }
        return iEven - iOdd;
    }
}
class program32_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array that we want to creat\n");
        int iSize = sobj.nextInt();

        ArrayDemo obj = new ArrayDemo();
        obj.Accept();
        int iRet = obj.Diffrance(iSize);
        System.out.println("the diffrance of odd and even number is"+iRet);
    }
}