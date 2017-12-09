package com.shina.LinkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Display {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5};
        LinkedList<Integer> ls = new LinkedList(Arrays.asList(arr));
       /* for (int i:ls)
        {
            System.out.println(i);
        }*/

       // System.out.println(ls.getFirst());
        //System.out.println(ls.getLast());
        //System.out.println(ls.offer(6));
       // System.out.println(ls.offerFirst(0));
        //System.out.println(ls.offerLast(7));
       // System.out.println(ls.pop());
        ls.push(99);
ls.add(98);
        System.out.println(ls.pop());
      for (int i : ls)
      {

          System.out.println(i + "  "+ ls.indexOf(i));
           }
        ls.peek();
        for (int i : ls) {

            System.out.println(i + "  " + ls.indexOf(i));
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<ls.size(); i++)
        {
            stringBuilder.append(ls.get(i));
           if( i != arr.length  -1 )
           {
               stringBuilder.append(",");
           }
        }
        System.out.println(stringBuilder.toString());
    }
}
