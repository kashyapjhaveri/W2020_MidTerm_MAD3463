/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

import java.util.HashMap;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools 
{
    //1 - REVERSE STRING
    public static String reverse(String s)
    {

        return null;
    }
    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) 
    {

        return null;
    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s) 
    {
        char temp[]=s.toCharArray();

        HashMap<Character,Integer> frequentLetters = new HashMap<Character, Integer>();

        for (int i=0;i<s.length();i++)
        {
            if (frequentLetters.containsKey(temp[i]))
            {
                int tempValue= frequentLetters.get(temp[i]);
                tempValue++;
                frequentLetters.put(temp[i],tempValue);
            }
            else
            {
                frequentLetters.put(temp[i],1);
            }
        }

        for (int a:frequentLetters.values())
        {
            System.out.println(a);
        }
        return  null;
    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) 
    {
       return 0;
    }
     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {
        return null;
    }
}
