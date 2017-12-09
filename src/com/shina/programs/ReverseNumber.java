package com.shina.programs;

public class ReverseNumber {

    public static void main(String args[])
    {
        int num=123456789;
        int reversenum =0;
        while( num != 0 )
        {
            int lastDigit = num %10;
            reversenum =  reversenum *10 + lastDigit;
            num = num/10;
        }

        System.out.println("Reverse of specified number is: "+reversenum);
    }
}
