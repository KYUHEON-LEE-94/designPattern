package org.example.structuralPattern.facade;

/**
 * packageName    : org.example.structuralPattern.facade
 * fileName       : TheaterLights
 * author         : heon
 * date           : 2024-02-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-28           heon               최초 생성
 */
public class TheaterLights {
    public void dim(int i) {
        System.out.println("Lights dim is : " + i);
    }

    public void on() {
        System.out.println("Lights on ");
    }
}
