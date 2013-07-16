public class SeriesCoading{
    public static void main(String args[]) {
        double n, sum = 0, i;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = keyboard.nextDouble();
        for (i = 1; i <= n; i++) {
            sum = sum + (1 / ((i * 2) - 1));
        }
        System.out.println("THE SUM OF THIS SERIES IS " + sum);
    }
}
