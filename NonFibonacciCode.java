import java.util.Scanner;
public class NonFibonacciCode{

    public static void main(String args[]) {
        int n, a, b, c, d, x;
        a = 0;
        b = 1;
        c = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = keyboard.nextInt();
        while (c <= n) {
            c = a + b;
            a = b;
            b = c;
            d = a + b;
            for (x = c + 1; x < d; x++) {
                if (x <= n) {
                    System.out.println(x);
                } else {
                    break;
                }
            }
        }
    }
}
