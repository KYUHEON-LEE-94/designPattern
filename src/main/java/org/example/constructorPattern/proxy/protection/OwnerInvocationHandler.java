package org.example.constructorPattern.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * packageName    : org.example.constructorPattern.proxy.protection
 * fileName       : OwnerInvocationHandler
 * author         : heon
 * date           : 2024-03-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-08           heon               최초 생성
 */
public class OwnerInvocationHandler implements InvocationHandler {
    Person person;

    public OwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            } else if (method.getName().equals("setGeekRating")) {
                throw new IllegalAccessException(); // 메서드 호출을 막음
            } else if (method.getName().startsWith("set")) {
                return method.invoke(person, args);
            }
            // 나머지 메서드는 모두 허용 → 주제에 있는 메서드를 호출
        }
        // 진짜 주제에서 예외를 던졌을 경우
        catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        // 다른 메서드가 호출되었을 경우
        return null;
    }
}
