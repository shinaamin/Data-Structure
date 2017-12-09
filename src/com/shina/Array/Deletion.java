package com.shina.Array;

public class Deletion {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int pos = 3;
       /* while (array.length>pos)
        {
            System.out.println("pos "+pos);
            array[pos-1] = array[pos];
            pos++;
        }*/
        for (int i = pos; i<array.length; i++)
        {
             array[pos-1] = array[pos];
            pos++;
        }
        for (int i : array)
        {
            System.out.println(i);
        }
    }
}
