package com.practice;

public class Assignment_04_functions {

    public static void main(String[] args) {

//1. Define two methods to print the maximum and the minimum number respectively among the three numbers
// entered by the user
        //System.out.println("The largest number amongst the entered three is: "+findMax(19,15,12));
        //System.out.println("The smallest number amongst the entered three is: "+findMin(15,11,89));

//2. Define a program to find out whether a given number is even or odd
        //System.out.println(isEvenOrOdd(123));

//3. A person is eligible to vote if his/her age is greater than or equal to 18.Define a method to find out
//if he/she is eligible to vote
        //System.out.println(isEligibleToVote(25));

//4. Write a program to print the sum of two numbers entered by user by defining your own method
        //System.out.println("The sum of entered two numbers is: "+findSum(15,11));

//5. Define a method that returns the product of two numbers entered by user
        //System.out.println("The product of the entered two numbers is: "+findProduct(15,11));

//6. Write a program to print the circumference and area of a circle of radius entered by the user
        //System.out.println("Circumference of the circle with given radius is: "+circumferenceOfCircle(15));
        //System.out.println("Area of the circle with given radius is: "+areaOfCircle(15));

//7. Define a method to find out if a number is prime or not
        //System.out.println("Entered number is Prime: "+isPrime(22));

//8. Write a program that will ask the user to enter his/her marks out of 100.Define a method that will display
// grades according to the marks entered as below:
      /*  Marks        Grade
        91-100         AA
        81-90          AB
        71-80          BB
        61-70          BC
        51-60          CD
        41-50          DD
        <=40          Fail*/
        //System.out.println("Based on your entered marks, your grade is: "+gradeBasedOnMarks(97));

//9. Write a program to print the factorial of a number by defining a method named 'Factorial'
// 1! = 1 & 0! = 1
        //System.out.println("Factorial of the entered number is: "+Factorial(1));

//10. Write a function to check if a given triplet is a pythagorean triplet or not
// (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the
// third number)
        //System.out.println("Do the three entered numbers make a pythagorean triplet? "+" : "+isPythagoreanTriplet(3,4,5));

//11. Write a function that returns all prime numbers between two given numbers
        primeNumsInARange(10,60);
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

    public static double circumferenceOfCircle(int radius)
    {
        return 2*Math.PI*radius;
    }

    public static double areaOfCircle(int radius)
    {
        return Math.PI*radius*radius;
    }

    public static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        int i = 2;
        while (i*i<=num)
        {
            if(num%i==0)
            {
                return false;
            }
            i++;
        }
        return i*i > num;
    }

    public static String gradeBasedOnMarks(int marks)
    {
        if(marks<=100 && marks>=91)
        {
            return "AA";
        } else if (marks<=90 && marks>=81) {
            return "AB";
        } else if (marks<=80 && marks>=71) {
            return "BB";
        } else if (marks<=70 && marks>=61) {
            return "BC";
        } else if (marks<=60 && marks>=51) {
            return "CD";
        } else if (marks<=50 && marks>=41) {
            return "DD";
        }
        else
        {
            return "Fail";
        }
    }

    public static int Factorial(int num)
    {
        int sum = 1;
        if(num==0 || num==1)
        {
            return sum;
        }
        for(int i=2;i<=num;i++)
        {
            sum = sum * i;
        }
        return sum;
    }

    public static String isPythagoreanTriplet(int a,int b,int c)
    {
        if(a<0 || b<0 || c<0)
        {
            return "Enter valid input!";
        }
        if((a*a+b*b==c*c) || (b*b+c*c==a*a) || (c*c+a*a==b*b))
        {
            return "Yes!";
        }
        else {
            return "No!";
        }
    }

    public static void primeNumsInARange(int a, int b)
    {
        System.out.print("Prime numbers in the given range are: ");
        boolean result;
        for(int i=a;i<=b;i++)
        {
            result = isPrime(i);
            if(result)
            {
                System.out.print(i +","+ " ");
            }
        }
    }
}
