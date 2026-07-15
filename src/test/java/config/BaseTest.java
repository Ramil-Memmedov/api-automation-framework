package config;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected static final String TOKEN ="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InRqeXVoc3BxdmZ1bHJnY3hmanJmIiwicm9sZSI6ImFub24iLCJpYXQiOjE3Njc1MTk2NTgsImV4cCI6MjA4MzA5NTY1OH0.MRvroc_i-pfudJ_jIfMu_XBDd86r_ZblAg1vqhpBN7g";
    @BeforeClass
    public void setup(){
       RestAssured.baseURI = "https://swagger-api-testing-qa.vercel.app/";
    }

}
