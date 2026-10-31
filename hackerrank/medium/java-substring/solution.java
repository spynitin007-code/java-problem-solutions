import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        int start = sc.nextInt();
        int end = sc.nextInt();

        String result = S.substring(start, end);

        System.out.println(result);

        sc.close();
    }
}
