package org.example.constructorPattern.proxy.protection;

/**
 * packageName    : org.example.constructorPattern.proxy.protection
 * fileName       : Person
 * author         : heon
 * date           : 2024-03-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-08           heon               최초 생성
 */
public interface Person {
    String getName();

    String getGender();

    String getInterests();

    int getGeekRating();

    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setGeekRating(int rating);
}
