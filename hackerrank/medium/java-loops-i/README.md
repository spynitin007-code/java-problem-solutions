# Java Loops I

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

**Objective**	
In this challenge, we're going to use loops to help us do some simple math.

**Task**	
Given an integer, $N$, print its first $10$ multiples. Each multiple $N \times i$ (where $1 \le i \le 10$) should be printed on a new line in the form: `N x i = result`.

**Input Format**

A single integer, $N$.

**Constraints**

- $2 \le N \le 20$

**Output Format**

Print $10$ lines of output; each line $i$ (where $1 \le i \le 10$) contains the $result$ of $N \times i$ in the form: 	
`N x i = result`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T14:01:36.414Z  

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }

        sc.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-loops-i/problem)