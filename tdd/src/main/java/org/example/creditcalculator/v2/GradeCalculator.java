package org.example.creditcalculator.v2;


import java.util.List;

public class GradeCalculator {
    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public double calculateGrade() {
        double sum = courses.totalMultipliedCreditAndCourseGrade();
        int totalCourse = courses.totalCompletedCredit();
        return sum / totalCourse;
    }
}
