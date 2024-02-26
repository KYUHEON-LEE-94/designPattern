package org.example.constructorPattern.Factory.factoryMethod;

import org.junit.jupiter.api.Test;

/**
 * packageName    : org.example.constructorPattern.FactoryPattern.factoryMethod
 * fileName       : FactoryMethodTest
 * author         : heon
 * date           : 2024-02-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-23           heon               최초 생성
 */
class FactoryMethodTest {

    @Test
    void test(){
        UserFactory userFactory = new NaverUserFactory();
        User user = userFactory.newInstance();

        // 위 클라이언트 코드 수정 없이 다른 곳에서 사용 가능
        UserFactory kakaoUserFactory = new KakaoUserFactory();
        User kakaoUser = kakaoUserFactory.newInstance();
    }

}