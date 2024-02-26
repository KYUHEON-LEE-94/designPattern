package org.example.constructorPattern.Factory.abstractFactory;

import org.example.constructorPattern.Factory.abstractFactory.productManager.Manager;
import org.example.constructorPattern.Factory.abstractFactory.productManager.TennisManager;
import org.example.constructorPattern.Factory.abstractFactory.productPlayer.Player;
import org.example.constructorPattern.Factory.abstractFactory.productPlayer.TennisPlayer;

/**
 * packageName    : org.example.constructorPattern.FactoryPattern.abstractFactory
 * fileName       : TennisStaffFactory
 * author         : heon
 * date           : 2024-02-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-23           heon               최초 생성
 */
public class TennisStaffFactory implements StaffFactory{
    @Override
    public Manager createManager() {
        System.out.println("create TennisManager");
        return new TennisManager();
    }

    @Override
    public Player createPlayer() {
        System.out.println("create TennisPlayer");
        return new TennisPlayer();
    }
}
