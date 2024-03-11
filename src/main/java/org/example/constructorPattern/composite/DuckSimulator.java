package org.example.constructorPattern.composite;

/**
 * packageName    : org.example.constructorPattern.composite2
 * fileName       : DuckSimulator
 * author         : heon
 * date           : 2024-03-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-11           heon               최초 생성
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable goose = new GooseAdapter(new Goose());
        System.out.println("\n오리 시뮬레이션 게임");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(goose);

        System.out.println(QuackCounter.getNumberOfQuacks());
    }

    // 다형성이 활용됨.
    void simulate(Quackable duck) {
        duck.quack();
    }
}
