package org.example.etcTest;

import org.example.behaviorPattern.observerPattern.impl.CurrentConditionsDisplay;
import org.example.behaviorPattern.observerPattern.impl.WeatherData;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

/**
 * packageName    : org.example.etcTest
 * fileName       : supplierExample
 * author         : heon
 * date           : 2024-02-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-21           heon               최초 생성
 */
public class supplierExample {
        @Test
        void main(){
            Supplier<String> hello = () -> "Hello";
            System.out.println(hello.get() + " world");
        }



    class ExpensiveObject {
        public void doSomething() {
            System.out.println("ExpensiveObject is doing something...");
        }
    }

    public class LazyInitializationExample {
        // 지연 초기화를 위한 Supplier
        private Supplier<ExpensiveObject> expensiveObjectSupplier = this::createExpensiveObject;

        // 비용이 많이 드는 객체 생성 메서드
        private ExpensiveObject createExpensiveObject() {
            // 여기에서 복잡한 초기화 로직이 수행될 수 있음
            return new ExpensiveObject();
        }

        // 지연 초기화된 객체를 반환하는 메서드
        public ExpensiveObject getExpensiveObject() {
            return expensiveObjectSupplier.get();
        }
    }



    @Test
    void LazyInitializationExample (){
        LazyInitializationExample example = new LazyInitializationExample();

        // 필요한 시점에 객체 생성
        ExpensiveObject expensiveObject = example.getExpensiveObject();

        // 생성된 객체 사용
        expensiveObject.doSomething();
    }


}
