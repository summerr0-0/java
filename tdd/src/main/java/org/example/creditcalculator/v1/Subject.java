package org.example.creditcalculator.v1;

public class Subject {
    private String name;
    private Point point;
    private Score score;

    public Subject(String name, int point) {
        this.name = name;
        this.point = new Point(point);
    }

    public void setScore(int score) {
        this.score = new Score(score);
    }

    public int getPoint() {
        return point.toInt();
    }

    public int getScore() {
        return score.toInt();
    }
}
