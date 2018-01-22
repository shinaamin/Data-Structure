package com.shina.programs;
//Counting number of lines, words, characters and paragraphs in a text file using Java
//https://www.geeksforgeeks.org/counting-number-lines-words-characters-paragraphs-text-file-using-java/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountLinesWord {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\shina\\Desktop\\Coding Program sites.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        int charCount =0;
        int lineCount =0;
        int wordCount =0;
        while (line != null)
        {
            lineCount++;
            charCount = line.length()+ charCount;
            char[] s = line.toCharArray();
            for(int i= 0; i<s.length; i++)
            {
                if(s[i]==' ' || s[i]=='.')
                {
                    wordCount++;
                }
            }
            line = br.readLine();

        }
        System.out.println("number of lines "+ lineCount);
        System.out.println("charCount "+ charCount);
        System.out.println("wordCount "+ wordCount);

    }
}
