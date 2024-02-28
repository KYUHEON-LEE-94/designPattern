package org.example.structuralPattern.decorator;

import org.junit.jupiter.api.Test;

/**
 * packageName    : org.example.structuralPattern.DecoratorPattern
 * fileName       : StarbuxxCoffee
 * author         : heon
 * date           : 2024-02-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-21           heon               최초 생성
 */
class StarbuxxCoffee {
    @Test
    void main(){
        
        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        // 에스프레소 커피 $1.99

        beverage = new Mocha(beverage); // Mocha로 감싼다
        beverage = new Milk(beverage); // Milk로 감싼다
        beverage = new Whip(beverage); // Whip으로 감싼다
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        // 에스프레소, 모카, 우유, whip $2.53

        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2); // Mocha로 감싼다
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
        // 에스프레소 커피, 모카 $2.19

        Beverage beverage3 = new Espresso();
        beverage3 = new Whip(beverage3); // Whip으로 감싼다
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
        // 에스프레소 커피, 휘핑크림 $2.08


    }

}