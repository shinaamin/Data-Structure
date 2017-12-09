package com.shina.sortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6,5,0,8,7,1,6,3};
        recursive(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void recursive(int[] arr, int left, int right) {
        if(left < right)
        {
            int pivotIndex = partition(arr, left, right);
            recursive(arr, left, pivotIndex-1);
            recursive(arr, pivotIndex+1, right);
        }

    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int pivotIndex = right;
        int i = left-1;
        for (int j = left; j<right; j++)
        {
            if(arr[j] <= pivot)
            {
             i++;
             int temp = arr[j];
             arr[j] = arr[i];
             arr[i] = temp;

            }
        }
   int temp = arr[i+1];

        arr[i+1] = pivot;
        arr[pivotIndex] = temp;
        return i+1;
    }
    public static  void swap()
    {

    }
}
