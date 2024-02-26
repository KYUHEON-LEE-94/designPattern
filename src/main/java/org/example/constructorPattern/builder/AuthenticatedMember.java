package org.example.constructorPattern.builder;

/**
 * packageName    : org.example.constructorPattern.builderPattern
 * fileName       : AuthenticatedMember
 * author         : heon
 * date           : 2024-02-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20           heon               최초 생성
 */
public class AuthenticatedMember extends Member{
    private final String name;  // 필수 속성
    private final String email; // 필수 속성

    public static class Builder extends Member.Builder<Builder>{
        private String name;
        private String email;

        public Builder (String name, String email){
            this.name = name;
            this.email = email;
        }

        @Override
        Member build() {
            return new AuthenticatedMember(this);
        }

        @Override
        protected Builder self() {
            return null;
        }
    }

    public AuthenticatedMember(Builder builder) {
        super(builder);
        name = builder.name;
        email = builder.email;
    }
}
