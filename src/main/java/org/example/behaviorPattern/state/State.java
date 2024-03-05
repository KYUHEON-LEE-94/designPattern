package org.example.behaviorPattern.state;

/**
 * packageName    : org.example.behaviorPattern.state
 * fileName       : State
 * author         : heon
 * date           : 2024-03-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-05           heon               최초 생성
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

    void refill();
}
