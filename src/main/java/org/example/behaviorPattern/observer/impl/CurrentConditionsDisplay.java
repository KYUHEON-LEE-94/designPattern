package org.example.behaviorPattern.observer.impl;

import org.example.behaviorPattern.observer.DisplayElement;
import org.example.behaviorPattern.observer.Observer;

/**
 * packageName    : org.example.behaviorPattern.observerPattern.impl
 * fileName       : CurrentConditionsDisplay
 * author         : heon
 * date           : 2024-02-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20           heon               최초 생성
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }

    public void display() {
        System.out.println("현재 상태: 온도 " + temperature  + "F, 습도 " + humidity + "%");
    }
}
