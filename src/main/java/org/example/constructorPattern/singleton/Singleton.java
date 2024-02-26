package org.example.constructorPattern.singleton;

/**
 * packageName    : org.example.constructorPattern.singleton
 * fileName       : Singleton
 * author         : heon
 * date           : 2024-02-26
 * description    : Type-safety, Serializtion 보장 및 Reflection 공격에도 안전
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-26           heon               최초 생성
 */
public enum Singleton{
    singleton;
    //기타 필드

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.singleton;
    }
}

//---- another class

