package org.example.behaviorPattern.observer.impl;

import org.junit.jupiter.api.Test;

/**
 * packageName    : org.example.behaviorPattern.observerPattern.impl
 * fileName       : WheatherStation
 * author         : heon
 * date           : 2024-02-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20           heon               최초 생성
 */
class WeatherStation {

    @Test
    void main(){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);

        //weatherData가 변할때 currentConditions도 감지해서 알 수 있음.
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        currentConditions.update();
    }

}