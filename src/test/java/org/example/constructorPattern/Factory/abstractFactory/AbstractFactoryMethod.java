package org.example.constructorPattern.Factory.abstractFactory;

import org.example.constructorPattern.Factory.abstractFactory.productManager.Manager;
import org.example.constructorPattern.Factory.abstractFactory.productPlayer.Player;
import org.junit.jupiter.api.Test;

/**
 * packageName    : org.example.constructorPattern.FactoryPattern.abstractFactory
 * fileName       : AbstractFactoryMethod
 * author         : heon
 * date           : 2024-02-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-23           heon               최초 생성
 */
class AbstractFactoryMethod {
    private static void use(StaffFactory factory) {
        Manager manager = factory.createManager();
        Player player = factory.createPlayer();
    }

    @Test
    void main(){
        use(new SoccerStaffFactory());
        use(new TennisStaffFactory());
    }

}