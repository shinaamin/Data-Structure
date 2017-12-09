package com.shina.sortingAlgorithms.search;

public class JumpSearch {
   static int el = 610;
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};

        int size = arr.length;
        int block = 3;
        int i = 0;
        while (i > -1)
        {
            if(el>=arr[i] )
            {
                if(i+block<=size-1 && el<=arr[i+block]) {
                    linearSearch(arr, i, i + block);
                    break;
                }
                else if (i+block > size -1)
                {
                    linearSearch(arr, i,size-1);
                    break;
                }

            }
            i = i+block;
        }
    }

    public static void linearSearch(int[] arr, int first, int last) {
        int index = -1;
        for (int i=first; i<=last; i++)
        {
            if (arr[i] == el)
            {
                index = i;
            }
        }
        System.out.println(index);
    }
}
