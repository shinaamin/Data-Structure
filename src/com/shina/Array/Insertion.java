package com.shina.Array;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args){
        int array[] = {1,2,4,5,6};
        int position = 2;
        int element = 3;
        int length = array.length;
        int newArray[] = new int[6];
        System.arraycopy(array, 0, newArray, 0, 5);
        System.out.println("len " + newArray.length);
        while(length>position-1)
        {
            newArray[length] = array[length-1];
            length --;
        }
        newArray[2] = element;
        for (int i : newArray)
        {
            System.out.println(i);
        }
    }
}
