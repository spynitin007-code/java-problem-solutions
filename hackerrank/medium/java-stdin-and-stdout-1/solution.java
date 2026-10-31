import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println(n);
        }

        scanner.close();
    }
}
