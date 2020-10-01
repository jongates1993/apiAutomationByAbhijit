package com.dev.apitest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class practice {

    int nothing = 0;
    int something = 0;

    public void pattern(int n){
        int cnt = 0;
        for (int k=n; k>0; k--) {
            for (int i = n; i > 0; i--) {
                for (int j = k; j > 0; j--) {
                    System.out.print(i);
                }
            }
            System.out.print("\n");
        }
    }

    public void armstrong_number(int n){
        int[] a = new int[3];
        int m = n;
        for (int i =0; i<3; i++){
            a[i]= n%10;
            n=n/10;
        }
        int product = a[0]*a[0]*a[0] + a[1]*a[1]*a[1] + a[2]*a[2]*a[2];
        System.out.println(product);
        if(product==m)
            System.out.println(m + " is armstrong number");
        else
            System.out.println(m + " is not armstrong number");
    }

    public void binaryToDecimal(long n){
        int cnt = 0;
        double decimal = 0;
        while(n!=0){
            long i = n%10;
            decimal = decimal + i*(Math.pow(2,cnt));
            cnt++;
            n = n/10;
        }
        System.out.println("decimal number is " + decimal);
    }

    public static void main(String[] args){
//        practice p = new practice();
//        practice s = new practice();
//        practice q = s;
//
//        s.nothing = 100;
//        System.out.println(q.nothing);
//        System.out.println(p.nothing);
////        p.pattern(7);
////        p.armstrong_number(321);
//        p.binaryToDecimal(1000);

        HashMap<String, String> student = new HashMap<String, String>();
        student.put("Abhijit", "Surve");
        student.put("Nikita", "Surve");
        student.put("Siddhesh", "Surve");

//        Map.Entry<String, String> studentEntry = (Map.Entry<String, String>) student.entrySet();
        for(Map.Entry<String, String> stringEntry : student.entrySet()){
            System.out.println("Name of the Student is : =" + stringEntry.getKey());
            System.out.print("Surname of the Student is : =" + stringEntry.getValue());
        }



//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String number = null;
//        String str = null;
//        try {
//            number = br.readLine();
//            str = br.readLine();
//        }
//         catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(Integer.parseInt(number)*2);
//        System.out.println(str);

        String str1 = "Abhi123";
        String numbers = "1234567890";
        for (int i = 0; i<str1.length(); i++){
            if(numbers.contains(str1.substring(i, i+1))){
                System.out.println(str1.substring(i, i+1));
            }
        }

        String z = "arrb6???4xxbl5???eee5";
        String digits = z.replaceAll("[^0-9^/?]", "");
        System.out.println(digits);
        System.out.println(Character.isDigit(digits.charAt(0)));

        String sen = "fun&!! time";
        String words = sen.replaceAll("[^a-zA-Z]"," ");

        String[] words1 = words.split(" ");

        String line = "aaab";
        String pattern = "[a+e+d+]";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(line);
        if(m.find()){
            System.out.println("found!!");
        }else{
            System.out.println("not found!!");
        }

        ArrayList<String> q = new ArrayList<String>();
        q.add("Abhi");
        q.add("Surve");
        System.out.println(q.get(1).length());

        String anagram1 = "binary";
        String anagram2 = "brainy";
        char[] anagramArray1 = anagram1.toCharArray();
        char[] anagramArray2 = anagram2.toCharArray();
        Arrays.sort(anagramArray1);
        Arrays.sort(anagramArray2);
        for (char c : anagramArray1){
            System.out.print(c);
        }
        System.out.println("\n");
        for (char c : anagramArray2){
            System.out.print(c);
        }






    }
}
