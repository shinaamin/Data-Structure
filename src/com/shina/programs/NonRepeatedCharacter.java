package com.shina.programs;

import java.util.*;

public class NonRepeatedCharacter {
    public static void main(String[] args)
    {
        String s = "abcabcabcd";
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i=0; i<s.length(); i++)
        {
            Character c = s.charAt(i);
            if(hashMap.containsKey(c))
            {
             int value = hashMap.get(c);
             hashMap.replace(c, value+1);
            }
            else
            {
                hashMap.put(c,1);
            }
        }
        for (int i = 0; i<s.length(); i++ )
        {
            if(hashMap.get(s.charAt(i)) == 1)
            {
                System.out.println("First non repeated "+ s.charAt(i));
            }
        }
    }
}
