package org.example.creditcalculator.v1;

import org.example.creditcalculator.v1.GradeCalculator;
import org.example.creditcalculator.v1.Student;
import org.example.creditcalculator.v1.Subject;
import org.junit.jupiter.api.Test;

//    (학점수*교과목 평점) 의 합계 / 수강신청 총 학점수

class GradeCalculatorTest {

    @Test
    void calculate() {
        Student student = new Student("테스트");
        Subject subject1 = new Subject("수학",3);
        Subject subject2 = new Subject("언어",3);
        Subject subject3 = new Subject("개론",2);
        student.addSubject(subject1);
        student.addSubject(subject2);
        student.addSubject(subject3);

        subject1.setScore(4);
        subject2.setScore(3);
        subject2.setScore(4);
        GradeCalculator sut = new GradeCalculator();

        int result = sut.calculate(student);
    }
}