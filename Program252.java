import java.util.*;

class Numbers
{
    public void EvenNumberDisplay(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= (iNo); iCnt++)
        {
            if((iCnt % 2) == 0) 
            {
                System.out.println("Even number is : "+iCnt);
            }
        }

    }
}

class Program252
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter number : ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        nobj.EvenFactorsDisplay(iNo);
    }
}