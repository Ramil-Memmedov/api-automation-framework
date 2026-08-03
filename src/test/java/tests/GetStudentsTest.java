package tests;

import config.BaseTest;
import endpoints.StudentsEndPoints;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetStudentsTest extends BaseTest {
    @Test
    public void getStudentsTest(){

        request
                .log().all()
                .when()
                .get(StudentsEndPoints.GET_STUDENTS)
                .then()
                .log().all()
                .statusCode(200);
    }
}
