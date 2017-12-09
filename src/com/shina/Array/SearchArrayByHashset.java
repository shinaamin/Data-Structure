package com.shina.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SearchArrayByHashset {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5};
        int el = 3;
        HashSet<Integer> al = new HashSet<>(Arrays.asList(arr));
        for (int i : al)
        {
            System.out.println(i);
        }
        if (al.contains(el))
        {
            System.out.println("element found");
        }
    }
}
