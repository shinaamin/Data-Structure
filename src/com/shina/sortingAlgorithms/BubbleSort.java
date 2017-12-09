package com.shina.sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int arr[] = {5, 4, 6,4, 2, 1};

        //It is optimized by stopping the algorithm if inner loop didn’t cause any  swapped;
        boolean swapped;
        for(int j =0; j< arr.length; j++) {
            swapped = false;
            // arr.length-j-1 because last element will be sorted after first passs, last 2 elements will be sorted after 2nd pass and so on...
            for (int i = 0; i < arr.length-j-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
            {
              break;
            }
        }

        for (int i : arr)
        {
            System.out.println(i);
        }
    }
}
