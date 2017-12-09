package com.shina.sortingAlgorithms.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 4, 6,4, 2, 1};
        int el = 4;
        int index = -1;
        for (int i=0; i<arr.length; i++)
        {
            if (arr[i] == el)
            {
                index = i;
            }
        }
        System.out.println(index);
    }
}
