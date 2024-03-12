package org.example.constructorPattern.composite;

/**
 * packageName    : org.example.constructorPattern.composite2
 * fileName       : MallardDuck
 * author         : heon
 * date           : 2024-03-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-11           heon               최초 생성
 */
public class RedheadDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println("Redhat 꽥꽥");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
