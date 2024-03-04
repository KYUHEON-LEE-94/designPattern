package org.example.constructorPattern.composite;

/**
 * packageName    : org.example.constructorPattern.composite
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
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
