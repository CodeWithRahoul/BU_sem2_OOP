package org.example;

public class Course {

    private String courseName;
    private String courseCode;
    private String courseCreditHours;


    public Course(String courseCode,String courseName,String courseCreditHours) {
        this.courseCode = courseCode;
        this.courseName=courseName;
        this.courseCreditHours=courseCreditHours;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseCreditHours() {
        return courseCreditHours;
    }
}
