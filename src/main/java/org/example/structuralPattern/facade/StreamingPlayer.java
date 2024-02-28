package org.example.structuralPattern.facade;

/**
 * packageName    : org.example.structuralPattern.facade
 * fileName       : StreamingPlayer
 * author         : heon
 * date           : 2024-02-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-28           heon               최초 생성
 */
public class StreamingPlayer {
    public void on() {
        System.out.println("StreamingPlayer on");
    }

    public void play(String movie) {
        System.out.println("StreamingPlayer play" + movie);
    }

    public void stop() {
        System.out.println("StreamingPlayer stop");
    }

    public void off() {
        System.out.println("StreamingPlayer off");
    }
}
