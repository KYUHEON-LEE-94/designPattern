package org.example.constructorPattern.composite;

/**
 * packageName    : org.example.constructorPattern.composite
 * fileName       : MenuTestDrive
 * author         : heon
 * date           : 2024-03-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-04           heon               최초 생성
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu =
                new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu =
                new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu =
                new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu =
                new Menu("DESSERT MENU", "Dessert of course!");
        MenuComponent coffeeMenu = new Menu("COFFEE MENU", "Stuff to go with your afternoon coffee");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined"); // 루트 복합 객체

        allMenus.add(pancakeHouseMenu); // 복합 객체
        allMenus.add(dinerMenu); // 복합 객체
        allMenus.add(cafeMenu); // 복합 객체

        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with marinara sauce, and a slice of sourdough bread",
                true,
                3.89));

        dinerMenu.add(dessertMenu); // 복합 객체

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59)); // desserMenu에 더해지는 객체는 Leaf 객체, MenuItem은 Leaf 객체다.

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
