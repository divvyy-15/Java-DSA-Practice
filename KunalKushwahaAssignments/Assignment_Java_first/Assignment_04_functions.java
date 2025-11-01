package com.practice;

public class Assignment_04_functions {

    public static void main(String[] args) {

//1. Define two methods to print the maximum and the minimum number respectively among the three numbers
// entered by the user
        System.out.println("The largest number amongst the entered three is: "+findMax(19,15,12));
        System.out.println("The smallest number amongst the entered three is: "+findMin(15,11,89));

//2. Define a program to find out whether a given number is even or odd
        System.out.println(isEvenOrOdd(123));

//3. A person is eligible to vote if his/her age is greater than or equal to 18.Define a method to find out
//if he/she is eligible to vote
        System.out.println(isEligibleToVote(25));

//4. Write a program to print the sum of two numbers entered by user by defining your own method
        System.out.println("The sum of entered two numbers is: "+findSum(15,11));

//5. Define a method that returns the product of two numbers entered by user
        System.out.println("The product of the entered two numbers is: "+findProduct(15,11));

//6. Write a program to print the circumference and area of a circle of radius entered by the user

//7. Define a method to find out if a number is prime or not

//8. Write a program that will ask the user to enter his/er marks out of 100.Define a method that will display
// grades according to the marks entered as below:
      /*  Marks        Grade
        91-100         AA
        81-90          AB
        71-80          BB
        61-70          BC
        51-60          CD
        41-50          DD
        <=40          Fail*/

//9. Write a program to print the factorial of a number by defining a method named 'Factorial'
// 1! = 1 & 0! = 1

//10. Write a function to check if a given triplet is a pythagorean triplet or not
// (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the
// third number)

//11. Write a function that returns all prime numbers between two given numbers

    }

    public static int findMax(int a,int b,int c)
    {
        int largest = Integer.MIN_VALUE;
        if(a>=b && a>=c)
        {
            largest = a;
        } else if (b>=a && b>=c) {
            largest = b;
        }
        else
        {
            largest = c;
        }
        return largest;
    }

    public static int findMin(int a,int b,int c)
    {
        int smallest = Integer.MAX_VALUE;
        if(a<=b && a<=c)
        {
            smallest = a;
        } else if (b<=c) {
            smallest = b;
        }
        else
        {
            smallest = c;
        }
        return smallest;
    }

    public static String isEvenOrOdd(int num)
    {
        if(num%2==0)
            return "Yes! The number is even";
        else
            return "No! The number is odd";
    }

    public static String isEligibleToVote(int age)
    {
        if(age>=18)
            return "Yes, the person is eligible to vote!";
        else
            return "No, the person is not eligible to vote!";
    }

    public static int findSum(int a,int b)
    {
        return a+b;
    }

    public static int findProduct(int a,int b)
    {
        return a*b;
    }
}
