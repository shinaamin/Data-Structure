package com.shina.programs;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PatternSearch {
    public static void main(String[] args) {
        String txt ="THIS IS A TEST TEST";
        String pat = "TEST";
        int occurences =0;
        for (int i = 0; i<txt.length() - pat.length()+1;i++)
        {
            if(txt.charAt(i)==pat.charAt(0))
            {
                boolean match = false;
                int k = i;
                for (int j =0; j<pat.length(); j++)
                {

                    if(txt.charAt(k)==pat.charAt(j))
                    {
                        match = true;
                        k++;
                    }
                    else
                    {
                        match = false;
                        break;
                    }
                }
                if (match)
                {
                    occurences++;
                    System.out.println("patern found at " + i);
                }
            }
        }
        System.out.println("occurences " + occurences);
    }
}
