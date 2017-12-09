package com.shina.programs;

import java.util.Arrays;
//http://www.geeksforgeeks.org/reverse-a-string-in-java-5-different-ways/
public class ReveseString {
    public static void main(String args[])
    {
        String s = "shina";
        char[] c = s.toCharArray();
        /*String s2="";
        for (int i=c.length-1; i>=0; i--)
        {
            s2 = s2.concat( String.valueOf(c[i]));
        }
        System.out.println(s2);*/
        int left=0;
        int right = s.length()-1;

        for (left=0; left < right ; left++ ,right--)
        {
           char temp = c[left];
           c[left] = c[right];
           c[right] = temp;

        }
        System.out.println(Arrays.toString(c));
    }
}
