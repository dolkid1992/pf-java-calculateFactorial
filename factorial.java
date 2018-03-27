import java.util.Scanner;

public class factorial {
    public static long factorial(long N) {
        if (N <= 1) {
            return 1;
        }
        return N * factorial(N - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial calculation program");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to calculate factorial: ");
        long N = sc.nextInt();

        long fact = factorial(N);
        System.out.println("The factorial of N is: "+ fact);
    }
}
