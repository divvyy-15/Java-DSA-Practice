package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Fundamentals_1D_2D {

    public static void main(String[] args) {
//1. Create array of 10 numbers and print all elements
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        //printArray(arr1);

//2. Take array input from user (using Scanner)
        //takeArrayInpFromUserAndPrint(4);

//3. Print array in reverse order
        //printInRevOrder(arr1);

//4. Find max and min element in array
        int[] arr3 = {2,33,66,6,15};
        //System.out.println("The max element in the array is: "+findMaxInArray(arr3));
        //System.out.println("The min element in the array is: "+findMinInArray(arr3));

//5. Calculate sum and average of array elements
        //findSumAndAvgOfEleInArray(arr3);

//6. Print all even numbers from array
        int[] arr4 = {2,22,13,11,15,66,19,96};
        //printEvenNumsFromArray(arr4);

//7. Print all odd numbers
        //printOddNumsFromArray(arr4);

//8. Count how many positive vs negative numbers
        int[] arr5 = {-1,15,-15,2,3,-100,56,67,78,-98,-99};
        //findCountOfPosNegInArray(arr5);

//9. Find if specific element exists
        int findEle = 5;
        //System.out.println(findEle + " exists in the array? "+doesEleExistInArray(arr5,findEle));

//10.Print elements at even indices only
        //printEvenIndicesEle(arr5);

//11.Print elements at odd indices only
        //printOddIndicesEle(arr5);

//12.Print only numbers greater than 10
        int[] arr6 = {6,2,5,12,13,15,1};
        //printNumsGreaterThan(arr6,10);

//13.Find second largest element
        //System.out.println("Second largest number in the array is: "+ findSecLargestFromArray(arr6));

//14.Count how many numbers are divisible by 3
        //System.out.println("There are "+countNumsDivBy(arr6,3)+ " numbers in the array that are divisible by 3!");

//15.Print all elements except the first and last
        //printExcludingPositions(arr6,0,arr6.length-1);

//16.Find the sum of all negative numbers
        //System.out.println("Sum of all the negative numbers in the array: "+sumOfNegNums(arr5));

//17.Write function to insert element at beginning
        int[] arr7 = {1,2,3,4,5,0,0,0,0,0};
        int currentSizeOfArray = insertEleAtBeginning(arr7,5,6);

//18.Write function to insert element at end
        int currentSizeOfArray1 = insertEleAtEnd(arr7,currentSizeOfArray,10);

//19.Write function to insert element at any position
        int[] arr8 = {22,3,11,8,1,2,0,0,0,0,0};
        int updatedSize = insertEleAtAnyPosition(arr8,6,3,15);
        //System.out.println(Arrays.toString(arr8));
        //System.out.println(updatedSize);

//20.Write function to delete element from beginning
        //int updatedSize1 = deleteEleAtBeginning(arr8,updatedSize);
        //System.out.println(Arrays.toString(arr8));
        //System.out.println(updatedSize1);

//21.Write function to delete element from end
        int[] arr9 = {1,3,7,11,10,2,0,0};
        //int updatedSize2 = deleteEleAtTheEnd(arr9,6);
        //System.out.println(Arrays.toString(arr9));
        //System.out.println(updatedSize2);

//22.Write function to delete element from any position
        int[] arr10 = {3,33,4,1,6,0,0,0};
        //int updatedSize3 = deleteEleAtAnyPosition(arr10,5,3);
        //System.out.println(Arrays.toString(arr10));
        //System.out.println(updatedSize3);

//23.Delete all occurrences of a number
        /*int[] arr11 = {1,2,2,3,2,4};
        System.out.println("The new size of the array is: "+deleteOccurencesOfNum(arr11,6,2));
        System.out.println("New size: " + size);  // Should print 3
        // Print only valid elements (first 'size' elements)
         System.out.print("Valid elements: ");
    for(int i = 0; i < size; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    // If you print entire array:
    System.out.println("Full array: " + Arrays.toString(arr));
    System.out.println(Arrays.toString(arr11));*/

//24.Find element and return index(-1 if not found)
        int[] arr12 = {15, 23, 8, 42, 19, 7, 33};
        //System.out.println("Index of the element in the array is: "+linearSearch(arr12,19));
        //System.out.println("Index of the element in the array is: "+linearSearch(arr12,99));

//25.Find first occurrence of an element in the array
        int[] arr13 = {5, 12, 5, 8, 5, 3};
        //System.out.print("Index of the first occurence of the target element is: "+findFirstOcc(arr13,5));

//26.Find last occurence of an element in the array
        //System.out.println("The index of the last occurence of the element is: "+findLastOcc(arr13,5));

//27.Count occurrences of element
        //System.out.println("The element occured "+countOcc(arr13,5)+ " times in the array");

//28.Find all occurrences of element (return array of indices)
        //System.out.println("The indices where the target element is found: "+Arrays.toString(allOcc(arr13,5)));

//29.Search for element only between start and end indices
        int[] arr14 = {10,20,30,40,50,60,70};
        //System.out.println("The index of the element is: "+searchInRange(arr14,50,2,5));
        //System.out.println("The index of the element is: "+searchInRange(arr14,10,2,5));

//30.Binary Search
        int[] arr15 = {2, 5, 8, 12, 16, 23, 38, 45, 56, 67, 78};
        System.out.println("The index of the element is: "+binarySearch(arr15,23));
        System.out.println("The index of the element is: "+binarySearch(arr15,45));
        System.out.println("The index of the element is: "+binarySearch(arr15,99));

//31.Search in 2D-array
        int[][] arr16 = {{1,3,5,7},
                         {10,11,16,20},
                         {23,30,34,50}};
        System.out.println("The indices in the 2D array for the element is: "+Arrays.toString(searchIn2DArray(arr16,16)));

//32.Find the missing number in a sequence from 1 to n
        int[] arr17 = {1,2,3,4,6,7,8};
        System.out.println("The missing number is: "+findMissingNum(arr17));

    }

    public static void printArray(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }

    public static void takeArrayInpFromUserAndPrint(int size)
    {
        int[] arr = new int[size];
        Scanner inp = new Scanner(System.in);
        for(int i = 0; i< arr.length; i++)
        {
            System.out.println("Enter a number for the array: ");
            arr[i] = inp.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void printInRevOrder(int[] a)
    {
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i] + " ");
        }
    }

    public static int findMaxInArray(int[] a)
    {
        int maxVal = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>maxVal)
            {
                maxVal = a[i];
            }
        }
        return maxVal;
    }

    public static int findMinInArray(int[] a)
    {
        int minVal = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<minVal)
            {
                minVal = a[i];
            }
        }
        return minVal;
    }

    public static void findSumAndAvgOfEleInArray(int[] a)
    {
        int sum = 0;
        double avg = 0.0;
        for(int i=0;i< a.length;i++)
        {
            sum = sum + a[i];
        }
        avg = (double) sum/a.length;
        System.out.println("Sum of all the elements in the array: "+sum);
        System.out.println("Average of all the elements in the array: "+avg);
    }

    public static void printEvenNumsFromArray(int[] a)
    {
        System.out.print("Even numbers in the array are: ");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void printOddNumsFromArray(int[] a)
    {
        System.out.print("Odd numbers in the array are: ");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void findCountOfPosNegInArray(int[] a)
    {
        int posCount = 0;
        int negCount = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<0)
            {
                negCount++;
            }
            else {
                posCount++;
            }
        }
        System.out.println("Count of negative numbers in the array: "+ negCount);
        System.out.println("Count of positive numbers in the array: "+posCount);
    }

    public static boolean doesEleExistInArray(int[] a,int ele)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==ele)
            {
                return true;
            }
        }
        return false;
    }

    public static void printEvenIndicesEle(int[] a)
    {
        System.out.println("Elements at the even indices in the array are: ");
        for(int i=0;i<a.length;i++)
        {
            if(i%2==0)
            {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void printOddIndicesEle(int[] a)
    {
        System.out.println("Elements at the odd indices in the array are: ");
        for(int i=0;i<a.length;i++)
        {
            if(i%2!=0)
            {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void printNumsGreaterThan(int[] a,int check)
    {
        System.out.print("Numbers greater than " +check+ " in the given array are:");
        for(int i:a)
        {
            if(i>check)
            {
                System.out.print(i + " ");
            }
        }
    }

    public static int findSecLargestFromArray(int[] a)
    {
        int lar = Integer.MIN_VALUE;
        int secLar = Integer.MIN_VALUE;
        for(int i:a)
        {
            if(i>lar)
            {
                secLar = lar;
                lar = i;
            }
        }
        return secLar;
    }

    public static int countNumsDivBy(int[] a,int divisor)
    {
        int countDiv = 0;
        for(int i:a)
        {
            if(i%divisor==0)
            {
                countDiv++;
            }
        }
        return countDiv;
    }

    public static void printExcludingPositions(int[] a, int pos1, int pos2)
    {
        for(int i=0;i<a.length;i++)
        {
            if(i!=pos1 && i!=pos2)
            {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static int sumOfNegNums(int[] a)
    {
        int sumNegNums = 0;
        for(int i:a)
        {
            if(i<0)
            {
                sumNegNums = sumNegNums+i;
            }
        }
        return sumNegNums;
    }

    public static int insertEleAtBeginning(int[] a,int currentSize,int eleToInsert)
    {
        //logic to shift elements - if space is available
        for(int i=currentSize-1;i>=0;i--)
        {
            a[i+1]=a[i]; //shift elements to the right to create space on the front
        }
        //finally assign the element
        a[0] = eleToInsert;
        return currentSize + 1;
    }

    public static int insertEleAtEnd(int[] a,int currentSize,int eleToInsert)
    {
        if(currentSize==a.length)
        {
            System.out.println("Cannot insert element as the array is already full!");
            return currentSize;
        }
        else
        {
            a[currentSize] = eleToInsert;
            return currentSize+1;
        }
    }

    public static int insertEleAtAnyPosition(int[] a,int currentSize,int pos,int eleToInsert)
    {
        if(currentSize==a.length)
        {
            System.out.println("Cannot insert any element as the array is already full!");
            return currentSize;
        }
        else {
            for(int i=currentSize-1;i>=pos;i--)
            {
                a[i+1] = a[i];
            }
            a[pos] = eleToInsert;
            return currentSize+1;
        }
    }

    public static int deleteEleAtBeginning(int[] a,int currentSize)
    {
        for(int i=0;i<currentSize;i++)
        {
            a[i]=a[i+1];
        }
        return currentSize-1;
    }

    public static int deleteEleAtTheEnd(int[] a,int currentSize)
    {
        a[currentSize-1] = 0;
        return currentSize -1;
    }

    public static int deleteEleAtAnyPosition(int[] a,int currentSize,int pos)
    {
        for(int i=currentSize-1;i>pos;i--)
        {
            a[i-1]=a[i];
        }
        a[currentSize-1] = 0;
        return currentSize-1;
    }

    public static int deleteOccurencesOfNum(int[] a,int currSize,int delOccOf)
    {
        int writeIndex = 0;
        for(int i=0;i<currSize;i++)
        {
            if(a[i] != delOccOf)
            {
                a[writeIndex] = a[i];
                writeIndex++;
            }
        }
        return writeIndex; //this is the new size
    }

    public static int linearSearch(int[] a,int targetEle)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i] == targetEle)
            {
                return i;
            }
        }
        return -1;
    }

    public static int findFirstOcc(int[] a,int targetEle)
    {
        for(int i=0;i< a.length;i++)
        {
            if(a[i]==targetEle)
            {
                return i;
            }
        }
        return -1;
    }

    public static int findLastOcc(int[] a,int targetEle)
    {
        int lastIndex = -1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==targetEle)
            {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static int countOcc(int[] a,int targetEle)
    {
        int count = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==targetEle)
            {
                count++;
            }
        }
        return count;
    }

    public static int[] allOcc(int[] a,int targetEle)
    {
        int countOcc = countOcc(a,targetEle);
        int[] occArr = new int[countOcc];
        int resultIndex = 0;
        for(int i=0;i<a.length;i++)
        {
                if(a[i]==targetEle)
                {
                    occArr[resultIndex] = i;
                    resultIndex++;
                }
            }
        return occArr;
    }

    public static int searchInRange(int[] a,int targetEle,int startInd,int endInd)
    {
        if(startInd<0 || endInd>=a.length || startInd>endInd)
        {
            return -1;
        }
        for(int i=startInd;i<=endInd;i++)
        {
            if(a[i]==targetEle)
            {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] a,int targetEle)
    {
        int left = 0;
        int right = a.length-1;

        while(left<=right)
        {
            int mid = left+(right-left)/2;
            if(a[mid]==targetEle)
                return mid;
            else if (a[mid]<targetEle) {
                left = mid+1;//search in right half
            } else {
                right = mid-1;//search in left half
            }
        }
        return -1;
    }

    public static int[] searchIn2DArray(int[][] matrix,int targetEle)
    {
        for(int i=0;i<matrix.length;i++)  //rows
        {
            for(int j=0;j<matrix[i].length;j++)     //column
            {
                if(matrix[i][j]==targetEle)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static int findMissingNum(int[] a)
    {
        int n = a.length+1; //should have n numbers
        int expSum = n*(n+1)/2;
        int actualSum = 0;
        for(int i=0;i<a.length;i++)
        {
            actualSum = actualSum+a[i];
        }
        return expSum-actualSum;
    }
}

