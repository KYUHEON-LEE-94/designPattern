package org.example.constructorPattern.Factory.factoryMethod;

/**
 * packageName    : org.example.constructorPattern.FactoryPattern.factoryMethod
 * fileName       : NaverUser
 * author         : heon
 * date           : 2024-02-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-23           heon               최초 생성
 */
public class NaverUser implements User {
    @Override
    public void signup() {
        System.out.println("네이버 아이디로 가입");
    }
}
