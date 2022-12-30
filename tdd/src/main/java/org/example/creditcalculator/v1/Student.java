package org.example.creditcalculator.v1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;


    private List<Subject> subjects;

    public Student(String name) {
        this.name = name;
        subjects = new ArrayList<>();
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public int subjectCount() {
        return subjects.size();
    }

}
