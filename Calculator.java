import java.util.Scanner;
public class Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the smaller number (n): ");
            int n = scanner.nextInt();
            System.out.println("Enter the larger number (m): ");
            int m = scanner.nextInt();

            int result = calculate(n, m);
            System.out.println("Sum of multiples of 3 and 5 between " + n + " and " + m + " is: " + result);
        }

        public static int calculate(int n, int m) {
            int sum = 0;
            for (int i = n; i <= m; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    sum += i;
                }
            }
            return sum;
        }
    }


