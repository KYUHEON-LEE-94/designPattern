package org.example.behaviorPattern.command;

/**
 * packageName    : org.example.behaviorPattern.command
 * fileName       : Light
 * author         : heon
 * date           : 2024-02-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-27           heon               최초 생성
 */
public class Light {
    private String place;
    public Light(String place) {
        this.place = place;
    }

    public void on(){
        System.out.println(place+" 불 켜짐");
    }

    public void off(){
        System.out.println(place+" 불 꺼짐");
    }
}
