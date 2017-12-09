package com.shina.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchArrayByConvertingToArayList {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5};
        int el = 3;
        List<Integer> al = new ArrayList<>();
      //  al.addAll(Arrays.asList(arr));
        al = Arrays.asList(arr);
        for (int i : al)
        {
            System.out.println(i);
        }
        if (al.contains(el))
        {
            System.out.println("element found"+ al.indexOf(el));
        }
           }
}
