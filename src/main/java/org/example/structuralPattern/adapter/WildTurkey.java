package org.example.structuralPattern.adapter;

/**
 * packageName    : org.example.structuralPattern.adapter
 * fileName       : WildTurkey
 * author         : heon
 * date           : 2024-02-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-28           heon               최초 생성
 */
public class WildTurkey implements  Turkey{
    @Override
    public void gobble() {
        System.out.println("WildTurkey gobble");
    }

    @Override
    public void fly() {
        System.out.println("WildTurkey fly");
    }
}
