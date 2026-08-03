package tests;

import config.BaseTest;
import endpoints.StudentsEndPoints;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteStudentsTest extends BaseTest {
    @Test
    public void deletestudentstest(){
        int id=6;
        //given().log().all().header("Authorization","Bearer "+TOKEN)
                given().log().all().when().delete(StudentsEndPoints.DELETE_STUDENTS,id)
                .then().log().all().statusCode(200);
    }
}
