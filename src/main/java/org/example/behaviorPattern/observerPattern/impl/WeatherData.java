package org.example.behaviorPattern.observerPattern.impl;

import org.example.behaviorPattern.observerPattern.Observer;
import org.example.behaviorPattern.observerPattern.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : org.example.behaviorPattern.observerPattern
 * fileName       : WeatherData
 * author         : heon
 * date           : 2024-02-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20           heon               최초 생성
 */
public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update();
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
