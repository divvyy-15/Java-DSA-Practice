package com.practice;

public class Assignment_03_conditionals_loops {

    public static void main(String[] args) {

//1. Print all 4 digit armstrong number
        /*for(int i=1000;i<10000;i++)
        {
            if(isArmstrongNum(i))
            {
                System.out.print(i + " ");
            }
        }*/

//2. Given an integer number n, return the difference between the product of its digits and the sum of its
// digits
        System.out.println("Difference between the product and sum of the digits of the given number is: " +prodAndSumDiff(1511)); //3

//3. Input a number and print all the factors of that number (use loops).
        factorsOfANumber(48);

//4. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

//5. Take integer inputs till the user enters 0 and print the largest number from all.

//6. Factorial Program In Java

//7. Calculate Average Of N Numbers

//8. Sum Of N Numbers

//9. Reverse A String In Java

//10. Find if a number is palindrome or not

//11. Perfect Number In Java

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
}