package com.dev.apitest;

import io.restassured.internal.support.FileReader;

import java.io.File;
//import jdk.nashorn.internal.parser.JSONParser;
//import jdk.nashorn.internal.parser.JSONParser;

public class jsonReader {
    public static void main(String[] args) {
//        Object obj = new JSONParser().parse(new FileReader("jsonresponse.json"));
        File jsonFile =new File((System.getProperty("user.dir"))+"\\src\\main\\java\\com\\dev\\apitest\\jsonresponse.json");
//        File jsonFile =new File("jsonresponse.json");
        String strFromFile =io.restassured.internal.support.FileReader.readToString(jsonFile, "UTF-8");
        System.out.println(strFromFile);
    }
}
