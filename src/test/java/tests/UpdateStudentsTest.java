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

        Student student = new Student(
                "ramil518@test.com",
                "Ramil",
                "Memmedov",
                5
        );

        given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + TOKEN)
                .body(student)

                .when()
                .put(StudentsEndPoints.UPDATE_STUDENTS)

                .then()
                .statusCode(200)
                .log().all();
    }
}