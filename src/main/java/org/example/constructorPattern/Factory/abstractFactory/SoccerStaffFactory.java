package org.example.constructorPattern.Factory.abstractFactory;

import org.example.constructorPattern.Factory.abstractFactory.productManager.Manager;
import org.example.constructorPattern.Factory.abstractFactory.productManager.SoccerManager;
import org.example.constructorPattern.Factory.abstractFactory.productPlayer.Player;
import org.example.constructorPattern.Factory.abstractFactory.productPlayer.SoccerPlayer;

/**
 * packageName    : org.example.constructorPattern.FactoryPattern.abstractFactory
 * fileName       : SoccerStaffFactory
 * author         : heon
 * date           : 2024-02-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-23           heon               최초 생성
 */
public class SoccerStaffFactory implements StaffFactory{
    @Override
    public Manager createManager() {
        System.out.println("create SoccerManager");
        return new SoccerManager();
    }

    @Override
    public Player createPlayer() {
        System.out.println("create SoccerPlayer");
        return new SoccerPlayer();
    }
}
