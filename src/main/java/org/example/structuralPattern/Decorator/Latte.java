package org.example.structuralPattern.Decorator;

/**
 * packageName    : org.example.structuralPattern.DecoratorPattern
 * fileName       : Espresso
 * author         : heon
 * date           : 2024-02-21
 * description    : Espresso 구현(구상 구성요소)
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-21           heon               최초 생성
 */
public class Latte extends Beverage {

    public Latte() {
        description = "라떼";
    }

    public double cost() {
        return 2.99;
    }

}
