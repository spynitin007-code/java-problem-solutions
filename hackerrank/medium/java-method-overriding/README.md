# Java Currency Formatter

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

When a subclass inherits from a superclass, it also inherits its methods; however, it can also *override* the superclass methods (as well as declare and implement new ones). Consider the following *Sports* class:

```java
class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
```

Next, we create a *Soccer* class that inherits from the *Sports* class. We can override the *getName* method and return a different, subclass-specific string:

```java
class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
}
```

**Note:** When overriding a method, you should precede it with the `@Override` annotation. The parameter(s) and return type of an overridden method must be exactly the same as those of the method inherited from the supertype. 

----

**Task**	
Complete the code in your editor by writing an overridden *getNumberOfTeamMembers* method that prints the same statement as the superclass' *getNumberOfTeamMembers* method, except that it replaces $n$ with $11$ (the number of players on a Soccer team). 

**Input Format**

 

**Constraints**

 

**Output Format**

When executed, your completed code should print the following:

    Generic Sports
    Each team has n players in Generic Sports
    Soccer Class
    Each team has 11 players in Soccer Class

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T16:53:17.279Z  

```java
import java.util.*;
import java.text.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double payment = scanner.nextDouble();

        // US Currency
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);

        // Indian Currency
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);

        // Chinese Currency
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);

        // French Currency
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        // Format currency
        String usPayment = us.format(payment);
        String indiaPayment = india.format(payment);
        String chinaPayment = china.format(payment);
        String francePayment = france.format(payment);

        // Print output
        System.out.println("US: " + usPayment);
        System.out.println("India: " + indiaPayment);
        System.out.println("China: " + chinaPayment);
        System.out.println("France: " + francePayment);

        scanner.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-method-overriding/problem)