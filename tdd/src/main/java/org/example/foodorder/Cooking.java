package org.example.foodorder;

import java.util.Objects;

public class Cooking {
    public Cook makeCook(MenuItem menuItem) {

        return new Cook(menuItem);
    }

}
