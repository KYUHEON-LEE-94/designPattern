package org.example.constructorPattern.proxy.protection;

/**
 * packageName    : org.example.constructorPattern.proxy.protection
 * fileName       : PersonImpl
 * author         : heon
 * date           : 2024-03-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-08           heon               최초 생성
 */
public class PersonImpl implements Person {
    private String name;
    private String gender;
    private String interests;
    private int rating;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getGeekRating() {
        return rating;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void setGender(String gender) {
        this.gender=gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests=interests;
    }

    @Override
    public void setGeekRating(int rating) {
        this.rating=rating;
    }
}
