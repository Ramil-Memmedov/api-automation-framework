package tests;

import config.BaseTest;
import endpoints.StudentsEndPoints;
import models.Student;
import org.testng.annotations.Test;

import java.util.concurrent.ThreadLocalRandom;

import static io.restassured.RestAssured.given;

public class CreateStudentsTest extends BaseTest {

    @Test
    public void createStudentsTest(){

        int id = ThreadLocalRandom.current().nextInt(1500,4556);

        Student student = new Student(
                "ramilsecond@gmail.com",
                "Ramil",
                "Memmedov",
                id
        );

        given()
                .log().all()
                .header("Authorization", "Bearer " + TOKEN)
                .contentType("application/json")
                .body(student)
                .when()
                .post(StudentsEndPoints.CREATE_STUDENTS)
                .then()
                .log().all()
                .statusCode(201);
    }
}