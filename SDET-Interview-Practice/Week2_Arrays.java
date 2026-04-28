package com.SDET_Interview_Prep;

public class Week2_Arrays {
    public static void main(String[] args) {
        //Que 1: Find Second-largest number in an Array
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        System.out.println("Second largest number in the array is: "+secLargestInArray(arr1));

        //Que 2: Reverse words in a sentence
        String s1 = "Java is fun";
        System.out.println("After reversing the words: "+revWordsInSentence(s1));
    }

    public static int secLargestInArray(int[] a)
    {
        //1.Check if the array is empty or has all numbers same?
        if(a==null || a.length<2)
        {
            throw new IllegalArgumentException("Array must have at least two elements!");
        }
        //2.Declare variables to store largest and second largest in the array
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        //3.Traverse entire array and as per conditions store the values in largest and second largest
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>largest)
            {
                secLargest = largest;
                largest = a[i];
            }
            else if(a[i]<largest && a[i]>secLargest)
            {
                secLargest = a[i];
            }
        }
        //4.Return the second largest
        return secLargest;
    }

    public static String revWordsInSentence(String s)
    {
        //1.Check if string is null or empty
        if(s==null || s.isEmpty())
        {
            return "String is null or Empty!";
        }
        //2.Initialise a Stirngbuilder
        StringBuilder sb = new StringBuilder();
        //3.Create a String array of the string
        String[] words = s.split("\\s+");
        //4.Declare two pointers at the start and end of the length of array and exchange the words present at them
        int i = 0;
        int j = words.length - 1;
        while(i<j)
        {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }
        //5.Build and Return the reversed String
        for(int k = 0; k <words.length; k++)
        {
            sb.append(words[k]);
            if(k < words.length-1)
            {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
