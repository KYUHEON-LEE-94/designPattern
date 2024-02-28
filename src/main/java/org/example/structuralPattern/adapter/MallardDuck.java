package org.example.structuralPattern.adapter;

/**
 * packageName    : org.example.structuralPattern.adapter
 * fileName       : MallardDuck
 * author         : heon
 * date           : 2024-02-28
 * description    : Duck 인터페이스를 구현한 class
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-28           heon               최초 생성
 */
public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("MallardDuck quack");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck fly");
    }
}
