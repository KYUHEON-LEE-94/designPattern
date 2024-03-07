package org.example.constructorPattern.proxy.remote;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * packageName    : org.example.constructorPattern.proxy.remote
 * fileName       : MyRemoteImpl
 * author         : heon
 * date           : 2024-03-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-07           heon               최초 생성
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    private static final long serialVersionUID = 1L;

    public String sayHello() {
        return "Server says, 'Hey'";
    }

    public MyRemoteImpl() throws RemoteException {
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
