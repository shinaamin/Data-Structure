package com.shina.sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        int leng = arr.length;
        for (int j = 0; j < leng - 1; j++) {
            int min = arr[j];
            int index = j;
            for (int i = j; i < leng - 1; i++) {
                if (min > arr[i + 1]) {
                    min = arr[i + 1];
                    index = i + 1;
                }
            }
            int temp = arr[j];
            arr[j] = arr[index];
            arr[index] = temp;

        }

        System.out.println(Arrays.toString(arr));
    }
}

