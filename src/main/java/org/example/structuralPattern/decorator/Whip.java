package org.example.structuralPattern.decorator;

/**
 * packageName    : org.example.structuralPattern.DecoratorPattern
 * fileName       : Mocha
 * author         : heon
 * date           : 2024-02-21
 * description    : CondimentDecorator 구현(추상 데코레이터)
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-21           heon               최초 생성
 */
public class Whip extends CondimentDecorator {

    // 인스턴스 변수를 감싸고자 하는 객체를 받음
    public Whip(Beverage beverage) {
        // 감싸고자 하는 음료를 저장하는 인스턴스 변수
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }

    public double cost() {
        return beverage.cost() + .09;
    }

}
