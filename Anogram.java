import java.util.Arrays;
import java.util.Scanner;
public class Anogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = scanner.nextLine().toLowerCase();
        System.out.println("Enter second string:");
        String str2 = scanner.nextLine().toLowerCase();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
