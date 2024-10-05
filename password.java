import java.util.Scanner;
public class password {
    public static int checkpass(String str, int n) {
        if (n < 4)
            return 0;
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9')
            return 0;
        int num = 0, cap = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == '/')
                return 0;
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                cap++;
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
                num++;
        }
        if (cap > 0 && num > 0)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the password: ");
        String password = scanner.nextLine();

        int n = password.length();
        int result = checkpass(password, n);

        if (result == 1) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

        scanner.close();
    }
}
