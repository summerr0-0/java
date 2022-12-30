package org.example.creditcalculator.v2;

public class Course {


    private final String subject;
    private final int credit;
    private final String grade;

    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public int getCredit() {
        return credit;
    }

    private double getGradeToNumber() {
        if (grade.equals("A+")) return 4.5;
        if (grade.equals("A")) return 4;
        if (grade.equals("A-")) return 3.5;
        if (grade.equals("B+")) return 3;
        if (grade.equals("B")) return 2.5;
        if (grade.equals("B-")) return 2;
        if (grade.equals("C+")) return 1.5;
        if (grade.equals("C")) return 1;
        if (grade.equals("C-")) return 0.5;

        return 0;
    }

    //계산 로직이 바뀐다면 그 여러곳을 다 수정해야 한다.
    //응집도가 낮다..
    //get을 사용하는 계산로직 보단 위임하도록 하자
    public double multipliedCreditAndCourseGrade() {
        return this.credit * this.getGradeToNumber();
    }
}
