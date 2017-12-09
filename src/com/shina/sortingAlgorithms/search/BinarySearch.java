package com.shina.sortingAlgorithms.search;

public class BinarySearch
{
    static int el =50;
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40, 50, 60, 70 };

        int n = arr.length;
        System.out.println(find(arr,0, n));
    }

    public static int find(int[] arr, int first, int last) {
        int index = -1;
        int middleIndex = findIndex(first, last);
        if (el > arr[middleIndex])
        {
         index =   find(arr, middleIndex+1, last);
        }
        else if (el < arr[middleIndex])
        {
         index =   find(arr, first, middleIndex-1);
        }
        else
        {
            index = middleIndex;
        }
        return index;
    }

    private static  int findIndex(int first, int last)
    {
        return  (last+first)/2;
    }
}
