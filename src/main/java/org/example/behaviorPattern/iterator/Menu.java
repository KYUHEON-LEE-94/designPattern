package org.example.behaviorPattern.iterator;


import java.util.Iterator;

/**
 * packageName    : org.example.behaviorPattern.iterator
 * fileName       : Menu
 * author         : heon
 * date           : 2024-03-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-04           heon               최초 생성
 */
public interface Menu {
    public Iterator<MenuItem> createIterator();
}
