# Java Datatypes

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Java has 8 primitive data types; *char, boolean, byte, short, int, long, float, and double*. For this exercise, we'll work with the primitives used to hold integer values (*byte, short, int,* and *long*):

* A *byte* is an 8-bit signed integer.
* A *short* is a 16-bit signed integer.
* An *int* is a 32-bit signed integer.
* A *long* is a 64-bit signed integer.

Given an input integer, you must determine which primitive data types are capable of properly storing that input.

To get you started, a portion of the solution is provided for you in the editor.

**Reference:** https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

**Input Format**

The first line contains an integer, $T$, denoting the number of test cases.		
Each test case, $T$, is comprised of a single line with an integer, $n$, which can be arbitrarily large or small.

**Output Format**

For each input variable $n$ and appropriate primitive $dataType$, you must determine if the given primitives are capable of storing it. If yes, then print: 

	n can be fitted in:
    * dataType
    
If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: $byte < short < int < long$).

If the number cannot be stored in one of the four aforementioned primitives, print the line:

	n can't be fitted anywhere.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T14:06:08.581Z  

```java
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

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-datatypes/problem)