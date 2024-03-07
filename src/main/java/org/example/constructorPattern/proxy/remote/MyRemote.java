package org.example.constructorPattern.proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * packageName    : org.example.constructorPattern.proxy.remote
 * fileName       : MyRemote
 * author         : heon
 * date           : 2024-03-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-07           heon               최초 생성
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
