package org.example.behaviorPattern.templateMethod;

/**
 * packageName    : org.example.behaviorPattern.templateMethod
 * fileName       : Tea
 * author         : heon
 * date           : 2024-02-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-29           heon               최초 생성
 */
public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("찻잎을 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }
}
