package org.example.constructorPattern.Factory.factoryMethod;

/**
 * packageName    : org.example.constructorPattern.FactoryPattern.factoryMethod
 * fileName       : UserFactory
 * author         : heon
 * date           : 2024-02-23
 * description    : 외부에서 User 객체를 생성할 때는 newInstance() 메서드를 호출하면 되고, 실제로 어떤 객체를 생성할 지는 추상 메서드로 정의해서 하위 클래스에서 정의
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-23           heon               최초 생성
 */
public abstract class UserFactory {
    public User newInstance() {
        User user = createUser();
        user.signup();
        return user;
    }

    protected abstract User createUser();
}
