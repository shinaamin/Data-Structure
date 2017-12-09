package com.shina.sortingAlgorithms;

import java.util.Arrays;
import java.util.stream.Stream;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 2, 7, 5, 2};
        TestCountingSort sort = new TestCountingSort();
        int max = sort.findMax(arr);
        int[] countArr = new int[max+1];
        Arrays.stream(arr).forEach(x ->
        {
            if(countArr[x] == 0)

                countArr[x] = countArr[x]+1;

        });
        System.out.println(Arrays.toString(countArr));

        int count = 0;
        for (int i=0; i< countArr.length; i++)
        {
            count = count+countArr[i];
            countArr[i] = count;
        }

        System.out.println(Arrays.toString(countArr));

        int[] resArr = new int[arr.length];
        for (int i =0; i< arr.length; i++)
        {
            int val = countArr[arr[i]];
            resArr[val-1] = arr[i];
            countArr[arr[i]]--;

        }
        System.out.println(Arrays.toString(resArr));
    }
}


class TestCountingSort
{

    public int findMax(int[] arr)  {
          return Arrays.stream(arr).max().getAsInt();

    }
}