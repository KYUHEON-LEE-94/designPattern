package org.example.constructorPattern.FactoryPattern.simpleFactory;

/**
 * packageName    : org.example.constructorPattern.FactoryPattern
 * fileName       : PetFactory
 * author         : heon
 * date           : 2024-02-23
 * description    : Simple Factory
 * 디자인 패턴 X
 * 확장이 용이하지만 변경도 열려있음 -> OCP 위배
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-23           heon               최초 생성
 */
//Client 에서 구현 클래스를 직접 의존하지 않기 때문에 나중에 클래스 이름이 변경되거나, 생성자가 변경되는 경우에도 PetFactory 내부만 수정하면 됨.
public class PetFactory {
    public Pet createPet(Pet.Type petType) {
        switch (petType) {
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
            default:
                throw new IllegalArgumentException("Pet 타입이 아닙니다");
        }
    }
}
