package config;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected static String TOKEN;

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
    }
}