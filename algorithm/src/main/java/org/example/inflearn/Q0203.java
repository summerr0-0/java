package org.example.inflearn;

import java.util.ArrayList;
import java.util.List;

public class Q0203 {
    public List<String> solution(int[] userA, int[] userB) {
        List<String> winners = new ArrayList<>();
        for (int i = 0; i < userA.length; i++) {
            int a = userA[i];
            int b = userB[i];

            if (a == b) {
                winners.add("D");
                continue;
            }

            switch (a) {
                case 1:
                    if (b == 2) {
                        winners.add("B");
                        continue;
                    }
                    break;
                case 2:
                    if (b == 3) {
                        winners.add("B");
                        continue;
                    }
                    break;
                case 3:
                    if (b == 1) {
                        winners.add("B");
                        continue;
                    }
                    break;
            }
            winners.add("A");

        }
        return winners;

    }


}
