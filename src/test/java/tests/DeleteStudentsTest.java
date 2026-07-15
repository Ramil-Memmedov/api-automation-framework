package tests;

import config.BaseTest;
import endpoints.StudentsEndPoints;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteStudentsTest extends BaseTest {
    @Test
    public void deletestudentstest(){
        given().log().all().header("Authorization","Bearer "+TOKEN)
                .when().delete(StudentsEndPoints.DELETE_STUDENTS)
                .then().log().all().statusCode(200);
    }
}
