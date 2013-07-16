import java.util.*;
class PowerProgram
{
   static int firstNo;
   static int secondNo;
   static int result=1;
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a given two no");
        firstNo=s.nextInt();
        secondNo=s.nextInt();
        while(secondNo!=0)
        {
        result=result*firstNo;
         --secondNo;
        }
        System.out.println(result);

    }
}