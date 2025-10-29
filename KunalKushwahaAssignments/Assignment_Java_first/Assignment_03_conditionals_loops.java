package com.practice;

import java.util.Scanner;

public class Assignment_03_conditionals_loops {

    public static void main(String[] args) {

//1. Print all 4 digit armstrong number
        for(int i=1000;i<10000;i++)
        {
            if(isArmstrongNum(i))
            {
                System.out.print(i + " ");
            }
        }

//2. Given an integer number n, return the difference between the product of its digits and the sum of its
// digits
        System.out.println("Difference between the product and sum of the digits of the given number is: " +prodAndSumDiff(1511)); //3

//3. Input a number and print all the factors of that number (use loops).
        factorsOfANumber(48);

//4. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        System.out.println("The total sum of all entered numbers is: "+keepPrintingSumOfEnteredNumbers());

//5. Take integer inputs till the user enters 0 and print the largest number from all.
        System.out.println("The largest number from all entered numbers is: "+largestOfAllEnteredNumbers());

//6. Factorial Program In Java
        int n = 10;
        //System.out.println("Factorial of "+ n + " is: "+factorialOfANumber(n));

//7. Calculate Average Of N Numbers
        System.out.println("Average of all the entered numbers is: "+avgOfEnteredNums());

//8. Sum Of N Numbers
        System.out.println("sum of all the numbers entered is: "+sumOfAllEnteredNumbers());

//9. Reverse A String In Java
        System.out.println("The reverse of the entered String is: "+reverseEnteredString("Euphoria"));

//10. Find if a number is palindrome or not
        System.out.println("Is the given number a Palindrome? "+isPalindrome(1212));

//11. Perfect Number In Java
//A perfect number is a positive integer that is equal to the sum of its proper positive divisors
// (the divisors excluding the number itself)

//12. Check Leap Year Or Not

//13. Sum Of A Digits Of Number

//14. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August

//15. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero

    }


    public static boolean isArmstrongNum(int n)
    {
        int original = n;
        int sum = 0;
        while(n>0)
        {
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem*rem;
        }
        return sum==original;

    }

    public static int prodAndSumDiff(int n)
    {
        int sum = 0;
        int prod = 1;
        while(n>0)
        {
            int rem = n%10;
            prod = prod * rem;
            sum = sum + rem;
            n = n/10;
        }
        return sum - prod;
    }

    public static void factorsOfANumber(int n)
    {
        System.out.print("Factors of "+ n + " are: ");
        System.out.print(1);  //universal factor
        for(int i=2;i<=n/2;i++)  //as largest integer that can divide any number is n/2!
        {
            if(n%i==0)
            {
                System.out.print(", " + i);
            }
        }
        //number itself is also a factor
        if(n>1)
        {
            System.out.print(", "+ n);
        }
    }

    public static int keepPrintingSumOfEnteredNumbers()
    {
        int sum = 0;
        Scanner inp = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter any number(when 0 is entered program stops): ");
            int n = inp.nextInt();
            if(n==0)
            {
                break;
            }
            else
            {
                sum = sum + n;
            }
        }
        return sum;
    }

    public static int largestOfAllEnteredNumbers()
    {
        int largest = Integer.MIN_VALUE;
        Scanner inp = new Scanner(System.in);
        while(true){
            System.out.println("Enter any number(when 0 is entered program stops): ");
            int n = inp.nextInt();
            if(n==0)
            {
                break;
            }
            else
            {
                if(n>largest)
                {
                    largest = n;
                }
            }
        }
        return largest;
    }

    public static int factorialOfANumber(int num)
    {
        int fact = 1;          //long or BigInteger for greater numbers say n>12
        for(int i=1;i<=num;i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static double avgOfEnteredNums()
    {
        Scanner inp = new Scanner(System.in);
        int sum = 0;
        int count=0;
        double avg = 0.0;//avg=sum/total
        while(true)
        {
            System.out.println("Enter any number(when 0 is entered program stops): ");
            int num = inp.nextInt();
            if(num==0)
            {
                avg = 0.0;
                break;
            }
            else {
                sum = sum + num;
                count++;
            }
        }
        if(count>0)
        {
            avg = (double) sum/count;
        }
        return avg;
    }

    public static int sumOfAllEnteredNumbers()
    {
        int sum = 0;
        Scanner inp = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter any number(when 0 is entered program stops): ");
            int num = inp.nextInt();
            if(num==0)
            {
                break;
            }
            else {
                sum = sum + num;
            }
        }
        return sum;
    }

    public static String reverseEnteredString(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i =s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }
        return sb.toString().toLowerCase();
    }

    public static String isPalindrome(int num)
    {
        int original = num;
        int rev = 0;
        while(num>0)
        {
            int rem = num%10;
            rev = rev *10 + rem;
            num = num/10;
        }
        if(original== rev)
        {
            return "Yes!";
        }
        else {
            return "No!";
        }
    }
}