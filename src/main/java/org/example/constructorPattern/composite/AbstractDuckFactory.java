package org.example.constructorPattern.composite;

/**
 * packageName    : org.example.constructorPattern.composite2
 * fileName       : AbstractDuckFactory
 * author         : heon
 * date           : 2024-03-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-11           heon               최초 생성
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
}
