package org.example.constructorPattern.Factory;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : org.example.constructorPattern.FactoryPattern
 * fileName       : FactoryPattern
 * author         : heon
 * date           : 2024-02-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-23           heon               최초 생성
 */
class FactoryPattern {

    abstract class Product {
        public abstract void use();
    }

    class IDCard extends Product {
        private String owner;

        public IDCard(String owner) {
            System.out.println(owner + "의 카드를 만듭니다.");
            this.owner = owner;
        }

        @Override
        public void use() {
            System.out.println(owner + "의 카드를 사용합니다.");
        }

        public String getOwner() {
            return owner;
        }
    }

    abstract class Factory {
        public final Product create(String owner) {
            Product product = createProduct(owner);
            registerProduct(product);
            return product;
        }
        protected abstract Product createProduct(String owner);
        protected abstract void registerProduct(Product p);
    }

    class IDCardFactory extends Factory {
        private List<String> owners = new ArrayList<>();

        @Override
        protected Product createProduct(String owner) {
            return new IDCard(owner);
        }

        @Override
        protected void registerProduct(Product p) {
            owners.add(((IDCard) p).getOwner());
        }

        public List<String> getOwners() {
            return owners;
        }
    }
    @Test
    void main(){
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("홍길동");
        Product card2 = factory.create("이순신");
        Product card3 = factory.create("강감찬");
        card1.use();
        card2.use();
        card3.use();
    }
}