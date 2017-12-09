package com.shina.sortingAlgorithms.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringSort {
    public static void main(String[] args) {
        String s = "shina";
        String[] st = s.split("");
        //java8
        String res1 = Stream.of(s).sorted().collect(Collectors.joining());
        String res = Stream.of(s.split("")).sorted().collect(Collectors.joining());
        System.out.println(res);//ahins
        System.out.println(res1);//shina
        //
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
       for (int i = 0; i<arr.length; i++)
       {
          for (int j=0; j<arr.length-i-1; j++)
          {
              if (arr[j]>arr[j+1])
              {
                  char temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
              }
               
           }
       }
        System.out.println(Arrays.toString(arr));
    }
}
