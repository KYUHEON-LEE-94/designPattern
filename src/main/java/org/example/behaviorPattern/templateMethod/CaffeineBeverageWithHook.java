package org.example.behaviorPattern.templateMethod;

/**
 * packageName    : org.example.behaviorPattern.templateMethod
 * fileName       : CaffeineBeverageWithHook
 * author         : heon
 * date           : 2024-02-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-29           heon               최초 생성
 */
public abstract class CaffeineBeverageWithHook {
    // 템플릿 메소드
    // 서브 클래스에서 오버라이드를 막기 위해 final로 선언
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // 서브 클래스에서 구현해야하는 알고리즘의 단계는 abstract 메소드로 구현
    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끓이는 중");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    // true를 반환하는 아무 작업이 없는 hook 메소드
    boolean customerWantsCondiments() {
        return true;
    }
}
