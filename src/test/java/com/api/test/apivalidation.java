package com.api.test;

import com.beust.jcommander.Parameter;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.io.FileUtils;
import org.testng.ITestContext;
import org.testng.annotations.Parameters;
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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Properties;

public class apivalidation {

    final static String URL = "http://dummy.restapiexample.com/api/v1/employees";
    validator v = new validator();



    @Test
    @Parameters({"Method","baseURL"})
    public void restExecute(ITestContext itc, String Method, String baseURL) throws IOException {
//        String method = itc.getCurrentXmlTest().getSuite().getParameter("Method");
        FileReader reader=new FileReader("src/main/resources/apiConfig.properties");

        Properties p=new Properties();
        p.load(reader);

        String serverURL = p.getProperty("ServerURL");
        String endpoint = serverURL + baseURL;
        System.out.println("endpoint is ---> " + endpoint);

        String method = Method;
        System.out.println("HTTP method is ---> " + method);
        switch (method) {
            case "Get":
                executeGet(endpoint);
                break;
            case "Post":
                executePost(endpoint);
                break;
        }
    }


    public void executeGet(String URL){

        Response response = get(URL);
        System.out.println("Response from restapi is -----> " + response.asString());
        v.validateResponse(response, 200);
    }

    public void executePost(String URL) throws IOException {
        RequestSpecification request = RestAssured.given();
        String file = "src\\main\\resources\\Request Payloads\\Post_posts_Request.json";
        String requestPayload = readFromFile(file);
        System.out.println("Request Payload is --> " + requestPayload);
        System.out.println("Submitting POST request");
        Response response = request.body(requestPayload).post(URL);
        v.validateResponse(response, 201);

    }

    public String readFromFile(String filepath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filepath)));
    }



//    public static void main(String args[]){
//        getBody();
//    }
}

