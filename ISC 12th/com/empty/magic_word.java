package com.empty;

import java.io.*;
class magic_word
{
    static void magic()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word: ");
        String s=br.readLine();
        int counter=0;
        for(int i=0;i<s.length()-1;i++)
        {
            char a=s.charAt(i);
            char b=s.charAt(i+1);
            int x=(int)a;
            int y=(int)b;
            if(y==x+1)
            {
                System.out.println("Magic word!");
                counter++;
                break;
            }
        }
        if(counter==0)
        {
            System.out.println("Not a Magic word");
        }
    }
    public static void main(String[] args) throws IOException {
        magic();
    }
}