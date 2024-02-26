package org.example.structuralPattern.Decorator;

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
public class Mocha extends CondimentDecorator {

    // 인스턴스 변수를 감싸고자 하는 객체를 받음
    public Mocha(Beverage beverage) {
        // 감싸고자 하는 음료를 저장하는 인스턴스 변수
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    public double cost() {
        return beverage.cost() + .20;
    }

}
