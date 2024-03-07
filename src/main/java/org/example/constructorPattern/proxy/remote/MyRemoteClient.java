package org.example.constructorPattern.proxy.remote;

import java.rmi.Naming;

/**
 * packageName    : org.example.constructorPattern.proxy.remote
 * fileName       : MyRemoteClient
 * author         : heon
 * date           : 2024-03-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-07           heon               최초 생성
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
