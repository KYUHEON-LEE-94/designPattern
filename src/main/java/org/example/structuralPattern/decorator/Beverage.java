package org.example.structuralPattern.decorator;

/**
 * packageName    : org.example.structuralPattern.DecoratorPattern
 * fileName       : Beverage
 * author         : heon
 * date           : 2024-02-21
 * description    : 추상 구성요소
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-21           heon               최초 생성
 */
public abstract class Beverage {
    String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
