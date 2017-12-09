package com.shina.sortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* Similar to playing cards*/
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {6,5,8,6,4,1,9};
        int length = arr.length;
         for (int i =0; i<length-1; i++)
        {
             int j = i;
            while (j>0 && arr[j-1]>arr[j])
            {
                int temp =arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                 j--;
            }


        }
        System.out.println(Arrays.toString(arr));
    }

}
