import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Fibonacci numbers to generate: ");
        int n = scanner.nextInt();

        int num1 = 0;
        int num2 = 1;

        System.out.println("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

        scanner.close();
    }
}

    

