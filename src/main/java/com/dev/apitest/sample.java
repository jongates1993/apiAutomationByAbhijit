package com.dev.apitest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class sample extends Thread {
    String A;
    int i = 0;
    sample(){

    }

    sample(String value){
        A = value;
    }

    public void run(){
        while( i<20){
            System.out.println(Thread.currentThread().getName() + " having i -> " + i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }

    public static void main(String[] args) {
        sample s1 = new sample("Abhijit");
        sample s2 = new sample();

        s1.start();
//        try {
//            s1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        s2.start();

//        sample s2 = new sample();
////        System.out.println(s2.A);
//        String s = "Abhijit";
//        char str[] = s.toCharArray();
//        System.out.println(str.length);
//
//        try{
//            int a[]=new int[7];
//            a[6]=30/0;
//            System.out.println("First print statement in try block");
//        }
////        catch(ArithmeticException e){
////            System.out.println("Warning: ArithmeticException");
////        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Warning: ArrayIndexOutOfBoundsException");
//        }
//        catch(Exception e){
//            System.out.println("Warning: Some Other exception");
//
//
//        }

//        String p = "$[Template Name]";
//        System.out.println(p.indexOf("$["));
//
//        System.out.println(p.substring(p.indexOf('[')+1, p.indexOf(']')));
//        System.out.println(p.replace('a', '@'));
//        System.out.println("args = [" + args + "]");
//        System.out.println("args = " + args);
//
//
//
//        String A;
//        A = "";
//        if(A.equals(null))
//            System.out.println("inside if");
//        else
//            System.out.println("inside else");
//
//        HashMap<String, String> hm = new HashMap<String, String>();
//        hm.put("A1", "Abhijit");
//        hm.put("A2", "Gaurav");
////        Map.Entry<String, String> me = (Map.Entry<String, String>) hm.entrySet();
////        Set<Map.Entry<String, String>> me =  hm.entrySet();
//        for(Map.Entry<String, String> me :  hm.entrySet()){



        }



    }
