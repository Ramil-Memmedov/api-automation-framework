package config;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.given;

public class BaseTest {

    protected static String TOKEN;
    protected static RequestSpecification request;

    @BeforeClass
    public void setup() {

        RestAssured.baseURI =
                "https://swagger-api-testing-qa.vercel.app";

        TOKEN = System.getenv("API_TOKEN");

        if (TOKEN == null || TOKEN.isBlank()) {
            throw new IllegalStateException(
                    "API_TOKEN environment variable is not configured"
            );
        }

        request = given()
                .header("Authorization", "Bearer " + TOKEN)
                .contentType("application/json");
    }
}