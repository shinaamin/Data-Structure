package com.shina.sortingAlgorithms;

public class InsertionSortRecursive {
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        int leng = arr.length;
        for (int j = 0; j < leng - 1; j++) {
            while (j>0 && arr[j-1]>arr[j])
            {
                int temp =arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public void reursive()
    {

    }
}
