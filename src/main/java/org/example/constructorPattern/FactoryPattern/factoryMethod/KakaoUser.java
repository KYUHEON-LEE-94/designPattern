package org.example.constructorPattern.FactoryPattern.factoryMethod;

/**
 * packageName    : org.example.constructorPattern.FactoryPattern.factoryMethod
 * fileName       : KakaoUser
 * author         : heon
 * date           : 2024-02-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-23           heon               최초 생성
 */
public class KakaoUser implements User {
    @Override
    public void signup() {
        System.out.println("카카오 아이디로 가입");
    }
}
