package org.example.constructorPattern.composite;

/**
 * packageName    : org.example.constructorPattern.composite
 * fileName       : Quackologist
 * author         : heon
 * date           : 2024-03-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-11           heon               최초 생성
 */
public class Quackologist implements Observer{
    @Override
    public void update(QuackObservable duck) {
        System.out.println("꽥꽥 학자: "+ duck + "이 방금 소리를 쳤다.");
    }
}