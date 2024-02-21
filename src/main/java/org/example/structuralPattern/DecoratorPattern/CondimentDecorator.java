package org.example.structuralPattern.DecoratorPattern;

/**
 * packageName    : org.example.structuralPattern.DecoratorPattern
 * fileName       : CondimentDecorator
 * author         : heon
 * date           : 2024-02-21
 * description    : CondimentDecorator 구현(추상 데코레이터)
 *  Beverage 객체를 감쌀 수 있도록 Beverage 클래스를 확장
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-21           heon               최초 생성
 */
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
