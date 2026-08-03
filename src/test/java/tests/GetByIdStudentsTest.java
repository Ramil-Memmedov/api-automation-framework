package tests;

import config.BaseTest;
import endpoints.StudentsEndPoints;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetByIdStudentsTest extends BaseTest {

    @Test
    public void getbyidstudenttest(){

        int id = 2;

        given()
                .log().all()
                .header("Authorization", "Bearer " + TOKEN)
                .when()
                .get(StudentsEndPoints.GET_byID_STUDENTS, id)
                .then()
                .log().all()
                .statusCode(200);
    }
}