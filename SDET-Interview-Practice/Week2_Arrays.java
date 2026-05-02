package com.SDET_Interview_Prep;

import java.util.Arrays;

public class Week2_Arrays {
    public static void main(String[] args) {
        //Que 1: Find Second-largest number in an Array
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        System.out.println("Second largest number in the array is: "+secLargestInArray(arr1));

        //Que 2: Reverse words in a sentence
        String s1 = "Java is fun";
        System.out.println("After reversing the words: "+revWordsInSentence(s1));

        //Que 3: Move zeroes to the end
        int[] arr2 = {0 ,1, 0, 3, 12};
        System.out.println("After moving zeroes to the end: "+Arrays.toString(moveZeroesToEnd(arr2)));

        //Que 4: Move negatives to start
        int[] arr3 = {-1, 12, -7, 3, -2};
        System.out.println("After moving negatives to start: "+Arrays.toString(moveNegativesToStart(arr3)));

        //Que 5: Rotate the array by k
        int[] arr4 = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println("After rotation of array: "+Arrays.toString(rotateArray(arr4,k)));

        //Que 6: Merge two sorted arrays
        int[] arr5 = {1, 3, 5};
        int[] arr6 = {2, 4, 6};
        System.out.println("After merging the two sorted arrays: "+Arrays.toString(mergeArrays(arr5,arr6)));
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

    public static int[] moveZeroesToEnd(int[] a)
    {
        //1.Check if array is null or empty
        if(a==null || a.length==0)
        {
            throw new IllegalArgumentException("The array passed is empty!");
        }
        //2.Initialize the variable that tracks where the position for non-zero element should be
        int insertPos = 0;
        //3.Traverse the entire array
        for(int i=0;i<a.length;i++)
        {
            //4.Check the condition for non-zero element
            if(a[i]!=0)
            {
                int temp = a[i];
                a[i] = a[insertPos];
                a[insertPos] = temp;
                insertPos++;
            }
        }
        return a;
    }

    public static int[] moveNegativesToStart(int[] a)
    {
        //1.Check if the array is null or empty
        if(a==null || a.length==0)
        {
            throw new IllegalArgumentException("Array is empty!");
        }
        //2.Initialize the variable that will track the position of negative numbers
        int insertPos = 0;
        //3.Traverse the entire array
        for(int i=0;i<a.length;i++)
        {
            //4.Check condition for negative number
            if(a[i]<0)
            {
                int temp = a[i];
                a[i] = a[insertPos];
                a[insertPos] = temp;
                insertPos++;
            }
        }
        //5.Return the array
        return a;
    }

    public static void reverseRange(int[] a,int start,int end){
        while(start<end)
        {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] rotateArray(int[] a,int k)
    {
        //1.Check if array is null or empty
        if(a==null || a.length==0)
        {
            throw new IllegalArgumentException("Array is null or Empty!!");
        }
        //2.Reverse the entire array
        reverseRange(a,0,a.length-1);
        //3.Reverse first k elements
        reverseRange(a,0,k-1);
        //4.Reverse elements at positions k+1 till end of the array
        reverseRange(a,k,a.length-1);
        //5.Return the array
        return a;
    }

    public static int[] mergeArrays(int[] a,int[] b)
    {
        //1.Initialize a resultant array of combined length of both arrays
        int[] result = new int[a.length+b.length];
        //2.Initialize pointers that tracks the position in resultant array
        int i = 0;
        int j = 0;
        int k = 0;
        //3.Compare elements in both arrays to put into resultant array
        while(i<a.length && j<b.length)
        {
            if(a[i]<b[j])
            {
                result[k] = a[i];
                k++;
                i++;
            }
            else {
                result[k] = b[j];
                k++;
                j++;
            }
        }
        //4.If Array A has some leftover elements
        while(i<a.length)
        {
            result[k] = a[i];
            k++;
            i++;
        }//5.If Array B has some leftover elements
        while(j<b.length)
        {
            result[k] = b[j];
            k++;
            j++;
        }
        //6.Return array
        return result;
    }
}
