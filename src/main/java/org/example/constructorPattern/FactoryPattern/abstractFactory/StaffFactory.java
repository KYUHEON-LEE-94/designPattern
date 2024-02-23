package org.example.constructorPattern.FactoryPattern.abstractFactory;

import org.example.constructorPattern.FactoryPattern.abstractFactory.productManager.Manager;
import org.example.constructorPattern.FactoryPattern.abstractFactory.productPlayer.Player;

/**
 * packageName    : org.example.constructorPattern.FactoryPattern.abstractFactory
 * fileName       : StaffFactory
 * author         : heon
 * date           : 2024-02-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-23           heon               최초 생성
 */
public interface StaffFactory {
    Manager createManager();
    Player createPlayer();
}
