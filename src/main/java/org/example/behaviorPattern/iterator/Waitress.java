package org.example.behaviorPattern.iterator;

import java.util.Iterator;

/**
 * packageName    : org.example.behaviorPattern.iterator
 * fileName       : Waitress
 * author         : heon
 * date           : 2024-03-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-04           heon               최초 생성
 */
public class Waitress {
    Menu dinnerMenu;

    public Waitress(Menu dinnerMenu) {
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        printMenu(dinnerMenu.createIterator());
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName());
        }
    }
}
