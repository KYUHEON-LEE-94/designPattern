package org.example.structuralPattern.adapter;

/**
 * packageName    : org.example.structuralPattern.adapter
 * fileName       : TurkeyAdapter
 * author         : heon
 * date           : 2024-02-28
 * description    : Adapter
 * Target Interface를 상속하고 있기 때문에 클라이언트에서 호환 가능하다.
 * Adaptee를 구성하여 Target Interface의 기능을 Adaptee의 기능으로 구현한다.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-28           heon               최초 생성
 */
public class TurkeyAdapter implements Duck{

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
