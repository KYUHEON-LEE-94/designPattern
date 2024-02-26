package org.example.constructorPattern.Factory.factoryMethod;

/**
 * packageName    : org.example.constructorPattern.FactoryPattern.factoryMethod
 * fileName       : KakaoUserFactory
 * author         : heon
 * date           : 2024-02-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-23           heon               최초 생성
 */
public class KakaoUserFactory extends UserFactory {
    @Override
    protected User createUser() {
        return new KakaoUser();
    }
}
