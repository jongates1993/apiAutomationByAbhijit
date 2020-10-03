package com.dev.apitest;

import io.restassured.response.Response;
import org.testng.Assert;

public class validator {

    public void validateResponse(Response res){
        System.out.println("----------------Validating Response-----------------");
        verifyStatusCode(res);
    }

    public void verifyStatusCode(Response res){
        int statusCode = res.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
}
