package org.example.creditcalculator.v2;

import java.util.List;

//일급컬렉션을 이용하면 연산ㅁ 좀더 쉬워진다
public class Courses {
    List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public int totalCompletedCredit() {
        return this.courses.stream().mapToInt(Course::getCredit).sum();
    }

    public double totalMultipliedCreditAndCourseGrade() {
        return courses.stream()
            .mapToDouble(Course::multipliedCreditAndCourseGrade)
            .sum();
    }
}
