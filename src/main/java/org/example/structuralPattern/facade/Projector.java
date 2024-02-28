package org.example.structuralPattern.facade;

/**
 * packageName    : org.example.structuralPattern.facade
 * fileName       : Projector
 * author         : heon
 * date           : 2024-02-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-28           heon               최초 생성
 */
public class Projector {
    public void on() {
        System.out.println("Projector on");
    }

    public void wideScreenMode() {
        System.out.println("Projector wideScreenMode");
    }

    public void off() {
        System.out.println("Projector off");
    }
}
