package org.example.structuralPattern.adapter;

/**
 * packageName    : org.example.structuralPattern.adapter
 * fileName       : Duck
 * author         : heon
 * date           : 2024-02-28
 * description    : Target
 * 클라이언트에서 이미 사용하고 있던 인터페이스
 * 이 인터페이스와 호환시키기 위해 어댑터를 사용하여야 한다.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-28           heon               최초 생성
 */
public interface Duck {
    public void quack();
    public void fly();
}
