package com.api.test;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

import io.restassured.path.json.JsonPath;
import io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.path.json.JsonPath.given;
import static org.hamcrest.Matchers.hasItems;
import com.dev.apitest.validator;

public class apivalidation {

    final static String URL = "http://dummy.restapiexample.com/api/v1/employees";
    validator v = new validator();

    @Test
    public void getBody(){

        Response response = get(URL);
        System.out.println("Response from restapi is -----> " + response.asString());
        v.validateResponse(response);
//        response.then().body("employee_name", hasItems("imam", "50909"));
    }

//    public static void main(String args[]){
//        getBody();
//    }
}
