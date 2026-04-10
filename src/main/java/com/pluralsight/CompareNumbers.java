package com.pluralsight;

public class CompareNumbers
{
    public static void main(String[] args)
    {
        System.out.println(isEven(31));
        System.out.println(isPositive(31));
    }

    public static boolean isEven(int number)
    {
        return number % 2 == 0;
    }

    public static boolean isPositive(double number)
    {
        return number > 0;
    }

}
