import java.util.Scanner;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            BigInteger n = sc.nextBigInteger();

            System.out.println(n + (canFit(n) ? " can be fitted in:" : " can't be fitted anywhere."));

            if (canFit(n)) {
                if (n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 &&
                    n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                    System.out.println("* byte");
                }

                if (n.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 &&
                    n.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                    System.out.println("* short");
                }

                if (n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                    n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                    System.out.println("* int");
                }

                if (n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
                    n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                    System.out.println("* long");
                }
            }
        }

        sc.close();
    }

    static boolean canFit(BigInteger n) {
        return n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
               n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0;
    }
}
