package org.example.constructorPattern.composite;



/**
 * packageName    : org.example.constructorPattern.composite
 * fileName       : QuackObservable
 * author         : heon
 * date           : 2024-03-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-11           heon               최초 생성
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
