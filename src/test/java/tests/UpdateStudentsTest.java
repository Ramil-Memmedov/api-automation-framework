package tests;

import config.BaseTest;
import endpoints.StudentsEndPoints;
import io.restassured.http.ContentType;
import models.Student;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UpdateStudentsTest extends BaseTest {

    @Test
    public void updateStudentTest() {
int id =4;
        Student student = new Student(
                "ramil508@test.com",
                "Ramil",
                "Memmedov",
                id
        );

        given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + TOKEN)
                .body(student)

                .when()
                .patch(StudentsEndPoints.UPDATE_STUDENTS,id)

                .then()
                .statusCode(200)
                .log().all();
    }
}