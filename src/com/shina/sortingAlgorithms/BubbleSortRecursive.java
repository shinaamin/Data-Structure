package com.shina.sortingAlgorithms;

import java.util.Arrays;

public class BubbleSortRecursive {
    public static void main(String[] args) {
        int[] arr= {5,4,6,3,2,1};
        int length = arr.length;
        sort(arr, length);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int length)
    {
        if (length ==1)
        {
            return;
        }
        for (int i =0; i<length-1; i++)
        {
            if (arr[i]> arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        sort(arr,length -1);

    }
}
