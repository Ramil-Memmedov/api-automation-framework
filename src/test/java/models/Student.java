package models;

public class Student {


    private String email;
    private String first_name;
    private String last_name;
    private int student_id;

    public Student() {
    }

    public Student(String email, String first_name, String last_name, int student_id) {
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.student_id = student_id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
}