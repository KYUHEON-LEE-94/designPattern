package org.example.constructorPattern.builder;

import java.util.Objects;

/**
 * packageName    : org.example.constructorPattern.builderPattern
 * fileName       : Guest
 * author         : heon
 * date           : 2024-02-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20           heon               최초 생성
 */
public class Guest extends Member{
    private final String name;

    public static class Builder extends Member.Builder<Builder> {
        private final String name;

        // 1. Guest 객체가 가져야할 인스턴스 변수
        public Builder(String name) { this.name = Objects.requireNonNull(name); }

        // 2. 마지막으로 호출되는 빌드 완성 메서드
        // - 공변 반환 타이핑(covariant return typing)을 사용하면, 빌더를 사용하는 클라이언트는 캐스팅이 필요없다.
        @Override Guest build() { return new Guest(this); }

        // 3. 부모 타입에서 필요한 서브 타입의 참조
        @Override protected Builder self() { return this; }
    }
    private Guest(Builder builder) {
        super(builder);
        name = builder.name;
    }
}
