package org.example.foodorder;

public class Customer {
    public Cook order(String choice, Menu menu, Cooking cooking) {

        MenuItem choose = menu.choose(choice);

        return cooking.makeCook(choose);
    }
}
