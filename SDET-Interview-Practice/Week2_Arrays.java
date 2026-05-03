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

        //Que 7: Move all even numbers in the front
        int[] arr7 = {1, 2, 3, 4, 5, 6};
        System.out.println("After moving all even numbers: "+Arrays.toString(moveEven(arr7)));

        //Que 8: Check if array is sorted
        int[] arr8 = {1, 5, 10, 20};
        System.out.println("Is the Array sorted? "+isArraySorted(arr8));

        //Que 9: Sum of all elements in the array
        int[] arr9 = {-1, 2, 5};
        System.out.println("Sum of all elements in the array is: "+sumOfEleInArr(arr9));

        //Que 10: Modify the array so that each unique element appears only once at the beginning.
        // Return the length of the unique portion.
        int[] arr10 = {0, 0, 1, 1, 1, 2, 2, 3};
        System.out.println("Number of unique elements in the array: "+removeDuplicates(arr10));

        //Que 11: Find leaders in an array. An element is a leader if it is greater than all the elements to its right.
        // The rightmost element is always a leader.
        int[] arr11 = {16, 17, 4, 3, 5, 2};
        System.out.println("Leaders in the array: "+Arrays.toString(leadersOfArray(arr11)));

        //Que 12: Given a string and a number N, reverse only the words that have a length greater than N.
        String s2 = "Coding is fun";
        System.out.println("After reversing required words: "+reverseOnlyGreaterThan(s2,2));
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
        //2.Initialise a Stringbuilder
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

    public static int[] moveEven(int[] a)
    {
        //1.Check if the array is null or empty
        if(a==null || a.length==0)
        {
            throw  new IllegalArgumentException("Array passed is empty!");
        }
        //2.Initialize a pointer that tracks the position where even numbers would go
        int insertPos = 0;
        //3.Traverse the array entirely
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                int temp = a[insertPos];
                a[insertPos] = a[i];
                a[i] = temp;
                insertPos++;
            }
        }
        //4.Return the array
        return a;
    }

    public static boolean isArraySorted(int[] a)
    {
        //1.Check if array is null or empty
        if(a==null || a.length==0)
        {
            return false;
        }
        //2.In an ascending Sorted array, the previous element is always lesser than the next, use this for comparison
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            {
                return false;
            }
        }
        return true;
    }

    public static int sumOfEleInArr(int[] a)
    {
        //1.Check if array is null or empty
        if(a==null || a.length==0)
        {
            throw new IllegalArgumentException("Input array is empty!");
        }
        //2.Initialize a sum variable that will store the sum of elements
        int sum = 0;
        //3.Traverse entire array
        for(int i=0;i<a.length;i++)
        {
            sum = sum + a[i];
        }
        //4.Return the sum
        return sum;
    }

    public static int removeDuplicates(int[] a)
    {
        //1.Check if array is null or empty
        if(a==null || a.length==0)
        {
            throw new IllegalArgumentException("Input array is empty!");
        }
        //2.If input array has only one element then it is already unique
        if(a.length==1)
        {
            return 1;
        }
        //3.Initialize a variable that will track the position where unique number will be inserted i.e.INDEX of the last known unique element
        int insertPos = 0;
        //4.Traverse the entire array starting from index 1 as we don't want to compare a[0] with a[0]
        for(int i=1;i<a.length;i++)
        {
            if(a[insertPos] != a[i])
            {
                insertPos++; //Increment insertPos before the assignment as it ensures we don't overwrite the current unique element but instead "claim" the next empty slot for the new discovery.
                a[insertPos] = a[i];
            }
        }
        //5.Return the length of unique elements which will be index+1
        return insertPos+1;
    }

    public static int[] leadersOfArray(int[] a)
    {
        //1.Check if array is null or empty
        if(a==null || a.length==0)
        {
            throw new IllegalArgumentException("Input array is empty!");
        }
        //2.Create an empty integer array of length equal to length of original array to store the result
        int[] res = new int[a.length];
        //3.Initialize a variable that stores the max value so far, as last element is leader by default, initialize with this value
        int maxSoFar = a[a.length-1];
        //4.Initialize an index variable for resultant array
        int index = 0;
        //5.Update first value in the result array
        res[index] = maxSoFar;
        index++;
        //6.Traverse the array from end to the beginning or right-left
        for(int i=a.length-2;i>=0;i--)
        {
            //7.If the current value is greater than max we update the variable accordingly and add to the result as well
            if(a[i]>maxSoFar)
            {
                maxSoFar = a[i];
                res[index] = maxSoFar;
                index++;
            }
        }
        //8.Trim the trailing zeros in the resultant array and return it
        int[] result = Arrays.copyOf(res,index);
        //9.As we started backwards our results would be reversed, so reverse again to get actual values
        reverseRange(result,0,index-1);
        return result;
    }

    public static String reverseOnlyGreaterThan(String s,int c)
    {
        //1.Check is String is null or emtpy
        if(s==null || s.isEmpty())
        {
            throw new IllegalArgumentException("Input String is null or empty!");
        }
        //2.Split the string to create String array
        String[] words = s.split("\\s+");
        //3.Initialize a StringBuilder to store the resultant string
        StringBuilder sb = new StringBuilder();
        //4.Traverse the array
        for(int i=0;i<words.length;i++)
        {
            String currWord = words[i];
            if(currWord.length()>c)
            {
                for(int j = currWord.length()-1; j >=0; j--)
                {
                    char c1 = currWord.charAt(j);
                    sb.append(c1);
                }
            }
            else {
                sb.append(currWord);
            }
            if(i< words.length-1)
            {
                sb.append(" ");
            }
        }
        //6.Return the Stringbuilder
        return sb.toString();
    }
}
