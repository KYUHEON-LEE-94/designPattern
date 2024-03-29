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
public class MallardDuck implements Quackable{
    Observable observable;

    public MallardDuck() {
        this.observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("꽥꽥");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
