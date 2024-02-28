package org.example.structuralPattern.decorator;

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
public class Espresso extends Beverage {

    public Espresso() {
        description = "에스프레소";
    }

    public double cost() {
        return 1.99;
    }

}
