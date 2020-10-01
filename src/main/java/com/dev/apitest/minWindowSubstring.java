//Min Window Substring
//        Have the function MinWindowSubstring(strArr) take the array of strings stored in strArr, which will contain
//        only two strings, the first parameter being the string N and the second parameter being a string K of some
//        characters, and your goal is to determine the smallest substring of N that contains all the characters in K.
//        For example: if strArr is ["aaabaaddae", "aed"] then the smallest substring of N that contains the characters
//        a, e, and d is "dae" located at the end of the string. So for this example your program should return the
//        string dae.
//
//        Another example: if strArr is ["aabdccdbcacd", "aad"] then the smallest substring of N that contains all of
//        the characters in K is "aabd" which is located at the beginning of the string. Both parameters will be strings
//        ranging in length from 1 to 50 characters and all of K's characters will exist somewhere in the string N.
//        Both strings will only contains lowercase alphabetic characters.

//Examples
//        Input: new String[] {"ahffaksfajeeubsne", "jefaa"}
//        Output: aksfaje
//        Input: new String[] {"aaffhkksemckelloe", "fhea"}
//        Output: affhkkse


package com.dev.apitest;

import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class minWindowSubstring {

    public static String MinWindowSubstring(String[] strArr) {
        // code goes here
        int n = strArr[0].length();
        int m = strArr[1].length();
        String pattern = "";
        ArrayList<String> substrings = new ArrayList<String>();

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        char[] charArray = strArr[1].toCharArray();
        for (char c : charArray){
            if(hm.containsKey(c))
                hm.put(c, hm.get(c)+1);
            else
                hm.put(c, 1);
        }

        for(Map.Entry entry : hm.entrySet()){
            pattern = pattern + "(?=.*(" + String.valueOf(entry.getKey()) + ".*){" + String.valueOf(entry.getValue()) + "})" ;
        }

        pattern = pattern + ".*$";

        for(int i=0; i<n; i++){
            for(int j=i+m; j<n; j++){
                String S1 = strArr[0].substring(i, j);
                Pattern p = Pattern.compile(pattern);
                Matcher mc = p.matcher(S1);
                if(mc.find()){
                    substrings.add(S1);
                }
            }
        }

        int min = substrings.size();
        int index = 0;
        for(int a=0; a<substrings.size() ; a++){
            if(substrings.get(a).length()<min){
                min = substrings.get(a).length();
                index = a;
            }
        }

        return substrings.get(index);
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
//        System.out.print(MinWindowSubstring(s.nextLine()));
    }

}
