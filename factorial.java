import java.util.*;
class Factorial
{
    static int result=1;
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a given no");
        int value=s.nextInt();
        while(value!=0)
        {
         result=result*value;
         --value;
        }
        System.out.println(result);
    }
}