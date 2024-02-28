package org.example.structuralPattern.decorator;

/**
 * packageName    : org.example.structuralPattern.DecoratorPattern
 * fileName       : Mocha
 * author         : heon
 * date           : 2024-02-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-21           heon               최초 생성
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 우유";
    }

    public double cost() {
        return beverage.cost() + .25;
    }

}
