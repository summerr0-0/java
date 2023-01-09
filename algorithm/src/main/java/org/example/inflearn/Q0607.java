package org.example.inflearn;

import java.util.*;

public class Q0607 {
    public String solution(List<int[]> arr) {
        List<Coordinate> coordinates = new ArrayList<>();

        for (int[] coordinate : arr) {
            coordinates.add(new Coordinate(coordinate[0], coordinate[1]));
        }

        Collections.sort(coordinates);

        StringBuilder sb = new StringBuilder();

        for (Coordinate c :
            coordinates) {
            sb.append(c.x).append(" ").append(c.y).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static class Coordinate implements Comparable<Coordinate> {

        private int x;
        private int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Coordinate o) {
            if (this.x > o.x) return 1;
            else if (this.x == o.x) {
                if (this.y > o.y) return 1;
            }
            return -1;
        }
    }
}
