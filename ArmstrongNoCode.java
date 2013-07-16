import java.util.*;
public class ArmstrongNoCode{
    public static void main(String args[]) {
        long no, d, b, c = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        no = keyboard.nextInt();
        d = no;
        while (no > 0) {
            b = no % 10;
            no = no / 10;
            c = c + (b * b * b);
        }
        if (d == c) {
            System.out.println(d + " is armstrong no");
        } else {
            System.out.println(d + " is not armstrong no");
        }
    }
}