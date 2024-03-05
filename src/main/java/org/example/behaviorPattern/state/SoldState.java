package org.example.behaviorPattern.state;

/**
 * packageName    : org.example.behaviorPattern.state
 * fileName       : SoldState
 * author         : heon
 * date           : 2024-03-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-05           heon               최초 생성
 */
public class SoldState implements State{
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("put out gumball");
    }

    public void ejectQuarter() {
        System.out.println("returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("gumball dispensed");
    }

    public void refill() {
    }

    public String toString() {
        return "good day with gumball";
    }
}
