package org.example.constructorPattern.builderPattern;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * packageName    : org.example.constructorPattern.builderPattern
 * fileName       : Member
 * author         : heon
 * date           : 2024-02-20
 * description    : effective java의 builder 사용
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20           heon               최초 생성
 */
public abstract class Member {
    // 모든 서브 타입 객체에 공통적으로 필요한 타입
    public enum Authority { READ, WRITE, DELETE }
    final Set<Authority> authorities;

    //재귀적 타입 파라미터를 가진 제너릭 타입
    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Authority> authorities = EnumSet.noneOf(Authority.class);

        //서브타입에서 권한을 정의할 수 있음
        public T addAuthorities(Authority types){
            authorities.add(Objects.requireNonNull(types));
            return  self();
        }

        abstract Member build();

        // 하위 클래스는 반드시 자기 자신을 반환하는 메서드를 오버라이드 해야 한다.
        protected abstract T self();
    }

    Member(Builder<?> builder) {
        authorities = builder.authorities.clone();
    }
}
