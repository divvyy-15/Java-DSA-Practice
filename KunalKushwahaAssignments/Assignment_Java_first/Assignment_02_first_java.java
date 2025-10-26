package com.practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Assignment_02_first_java {

    public static void main(String[] args) {
//1. Write a program to print whether a number is even or odd, also take input from the user.
        //System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        //int num = input.nextInt();
        //isEvenOrOdd(num);

//2. Take name as input and print a greeting message for that particular name.
        //System.out.println("Enter your name:");
        //String name = input.next();
        //greetPerson(name);

//3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest
        /*System.out.println("Enter the principal amount:");
        int p = input.nextInt();
        System.out.println("Enter the time in years: ");
        int t = input.nextInt();
        System.out.println("Enter the rate of interest");
        float r = input.nextFloat();
        float simpInt = calculateSimpleInterest(p,r,t);
        System.out.println("The simple interest on the principal amount at given ROI for the time period is: "+simpInt);*/

//4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        /*System.out.println("Enter two numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Enter an operator out of +,-,*,/ : ");
        String op = input.next();
        int result = valueCalc(a,b,op);
        System.out.println(result);*/

//5. Take 2 numbers as input and print the largest number.
        /*System.out.println("Enter two numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int result = largestOfTheTwo(a,b);
        System.out.println("The largest number between the two entered numbers is: "+result);*/

//6. Input currency in rupees and output in USD
        /*System.out.println("Enter the amount in Rupees:");
        double amt = input.nextDouble();
        double result = rupeeToDollars(amt);
        System.out.println("The equivalent USD amount is: "+result);*/

//7. To calculate Fibonacci Series up to n numbers
        /*System.out.println("Enter the value upto which fibonacci series is to be printed: ");
        int n = input.nextInt();
        printFibonacciSeries(n);*/

//8. To find out whether the given String is Palindrome or not
        /*System.out.println("Enter a string:");
        String s = input.next();
        isStringPalindrome(s);*/

//9. To find Armstrong Number between two given number
        System.out.println("Enter two numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        printArmstrongNumberInTheGivenRange(a,b);
    }

    public static void isEvenOrOdd(int num)
    {
        if(num%2==0) {
            System.out.println(num + " is an even number");
        }
        else {
            System.out.println(num +" is an odd number");
        }
    }

    public static void greetPerson(String name)
    {
        System.out.println("Hi "+ name + "! Greetings of the day :) ");
    }

    public static float calculateSimpleInterest(int p, float r, int t) {
        return (p*r*t)/100;
    }

    public static int valueCalc(int num1,int num2,String operator)
    {
        if(operator.equals("+"))
        {
            return num1 + num2;
        } else if (operator.equals("-")) {
            return num1 - num2;
        } else if (operator.equals("*")) {
            return num1 * num2;
        } else if (operator.equals("/")) {
            return num1/num2;
        }
        else
        {
            return 0;
        }
    }

    public static int largestOfTheTwo(int a, int b) {
        if(a>b)
        {
            return a;
        }
        else
            return b;
    }

    public static double rupeeToDollars(double amount)
    {
        return amount * 0.011;
    }

    public static void printFibonacciSeries(int n)
    {
        System.out.print("First "+n+ " terms of the Fibonacci series:");
        int first = 0;
        int sec = 1;
        System.out.print(first+" "+sec);
        for(int i=3;i<=n;i++)
        {
            int next = first+sec;
            System.out.print(" "+next);
            first = sec;
            sec = next;
        }
    }

    public static void isStringPalindrome(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }
        if(sb.toString().equals(s))
        {
            System.out.println("Entered String is a Palindrome!");
        }
        else
        {
            System.out.println("Entered String is not a Palindrome!!");
        }
    }

    public static void printArmstrongNumberInTheGivenRange(int a,int b)
    {
        int rem = 0;
        double sum = 0;
        for(int i=a;i<=b;i++)
        {
            while(i>0)
            {
                rem = i%10; //101%10 -- 1
                sum = sum + Math.pow(rem,3);
                i = i/10;
                if(sum==i)
                {
                    System.out.print(i);
                }
            }

        }
    }
}
