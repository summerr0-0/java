package org.example.foodorder;

import java.util.List;

public class Menu {

    private final List<MenuItem> menuItems;

    public Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem choose(String menu) {
        return menuItems.stream().
            filter(a -> a.matches(menu))
            .findFirst()
            .map(a -> new MenuItem(a.getName(), a.getPrice()))
            .orElseThrow(()->new IllegalArgumentException("메뉴 잘못 선택"));
    }
}
