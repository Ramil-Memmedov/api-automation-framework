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

        String email = "ramil"
                + System.currentTimeMillis()
                + "@gmail.com";

        Student student = new Student(
                email,
                "Ramil",
                "Memmedov",
                id
        );

        request
                .log().all()
                .body(student)

                .when()
                .post(StudentsEndPoints.CREATE_STUDENTS)

                .then()
                .log().all()
                .statusCode(201);
    }
    }
