package org.example.creditcalculator.v1;

public class GradeCalculator {
    public int calculate(Student student) {
        return student.getSubjects().stream()
            .mapToInt(a -> a.getScore() * a.getPoint())
            .sum()/student.subjectCount();
    }
}
