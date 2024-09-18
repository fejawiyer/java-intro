package org.example;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        System.out.print("is adwda Palindrome? ");
        System.out.println(isPalindrome("adwda"));
        System.out.print("Series sum = ");
        System.out.println(seriesSum());
        System.out.println("Quadratic eq with a=4, b=5, c=1 roots:\n" + quadraticEq(4,5,1));
        System.out.println("make install reverse = " + strReverse("make install"));
        int n = 500;
        List<String> result = sequence(n);
        System.out.println(result);
    }
    public static boolean isPalindrome(String str) {
        String strNew = str.toLowerCase().replaceAll(" ", "");
        int length = strNew.length();
        for (int i = 0; i < (length / 2); i++)
        {
            if (strNew.charAt(i) != strNew.charAt(length-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public static double seriesSum()
    {
        double sum = 0;
        for(int n = 2;true;n++)
        {
            double seriesMember = (double)1/(n*n+n-2);
            sum += seriesMember;
            if (seriesMember < pow(10, -6))
            {
                break;
            }
        }
        return sum;
    }
    public static String quadraticEq(double a, double b, double c)
    {
        double D = b*b-4*a*c;
        if (D < 0)
        {
            return "There are no real roots";
        }
        else
        {
            double x1 = (-b+sqrt(D))/2*a;
            double x2 = (-b-sqrt(D))/2*a;
            return "Roots: x1=" + x1 + " x2=" + x2;
        }
    }
    public static String strReverse(String str)
    {
        String strNew = "";
        for (int i = str.length(); i>0; i--)
        {
            strNew += str.charAt(i-1);
        }
        return strNew;
    }
    public static List<String> sequence(int n)
    {
        if (n<=0)
        {
            return null;
        }
        List<String> sequence = new ArrayList<>();
        for (int i = 1; i <= n; i++)
        {
            if (i % 5 == 0)
            {
                if (i % 7 == 0)
                {
                    sequence.add("fizzbuzz");
                }
                else
                {
                    sequence.add("fizz");
                }
            }
            else if (i % 7 == 0)
            {
                sequence.add("buzz");
            } else
                sequence.add(String.valueOf(i));
        }
        return sequence;
    }
}