/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools 
{
    public static String[] splitTheStringIntoArray(String s)
    {
        return s.split("\\s+");
    }


    //1 - REVERSE STRING
    public static String reverse(String s)
    {
        if (s==null)
        {
            return null;
        }
        else {



            /*char temp[] = s.toCharArray();
            int len = s.length();

            for (int i = 0, j = len - 1; j > 0; i++, j--) {
                char t = temp[j];
                temp[j] = temp[i];
                temp[i] = t;
            }
            return new String(temp);*/

            String splittedArray[]= splitTheStringIntoArray(s);
            String temp=" ";
            for (int i=splittedArray.length-1;i>0;i--)
            {
                temp=temp+splittedArray[i]+" ";
            }
            return temp;
        }
    }
    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) 
    {
        String splittedArrayString[] = splitTheStringIntoArray(s);
        /*String ini="";
        for (String word:splittedArray)
        {
            char temp[]=word.toCharArray();
            ini=ini.concat(temp[0]);
        }*/

        if (s==null)
        {
            return null;
        }
        else {
            char splittedArray[] = s.toCharArray();
            String temp = "";
            ArrayList<Character> ini = new ArrayList<Character>();

            ini.add(splittedArray[0]);
            ini.add('.');

            for (int i = 0; i < splittedArray.length; i++) {
                if (splittedArray[i] == ' ') {
                    ini.add(splittedArray[i + 1]);
                    ini.add('.');
                }
            }

            for (int i = 0; i < ini.size() - 2; i++) {
                temp = temp + ini.get(i);
            }
            temp = temp + splittedArrayString[splittedArrayString.length - 1];
            return temp;
        }
    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s) 
    {
        if (s==null)
        {
            return null;
        }
        else {
            char temp[] = s.toCharArray();

            HashMap<Character, Integer> frequentLetters = new HashMap<Character, Integer>();

            for (int i = 0; i < s.length(); i++) {
                if (frequentLetters.containsKey(temp[i])) {
                    int tempValue = frequentLetters.get(temp[i]);
                    tempValue++;
                    frequentLetters.put(temp[i], tempValue);
                } else {
                    frequentLetters.put(temp[i], 1);
                }
            }
            return null;
        }


        /*for (int a:frequentLetters.values())
        {
            System.out.println(a);
        }*/
    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) 
    {




        return 0;
    }
     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {
        if (originalString==null || findString==null || newString==null)
        {
            return null;
        }
        else {
            String stringInWords[] = splitTheStringIntoArray(originalString);
            String temp = " ";
            for (int i = 0; i < stringInWords.length; i++) {

                if (stringInWords[i].compareToIgnoreCase(findString) == 0) {
                    stringInWords[i] = newString;
                }
            }

            for (String t : stringInWords) {

                temp = temp + t + " ";
            }

            return temp;
        }
    }
}
