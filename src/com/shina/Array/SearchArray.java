package com.shina.Array;

public class SearchArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int el = 3;
        int pos = -1;
        for (int i =0; i< arr.length; i++)
        {
            if (arr[i] == el)
            {
                pos = i;
                break;

            }
        }
        if (pos == -1)
        {
            System.out.println("element not found");
        }
        else
        {
            System.out.println("element found"+ pos);
        }
    }
}
