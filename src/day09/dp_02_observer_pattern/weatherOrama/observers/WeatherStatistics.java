package day09.dp_02_observer_pattern.weatherOrama.observers;

import day09.dp_02_observer_pattern.weatherOrama.observers.WeatherDisplay;
import day09.dp_02_observer_pattern.weatherOrama.observers.WeatherObserver;
import day09.dp_02_observer_pattern.weatherOrama.subject.WeatherData;

public class WeatherStatistics implements WeatherObserver, WeatherDisplay {

    private float minimumTemperature;
    private float maximumTemperature;
    private float totalTemperature;
    private int numberOfReadings;
    private WeatherData weatherData;

    public WeatherStatistics(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (totalTemperature / numberOfReadings)
                + "/" + maximumTemperature + "/" + minimumTemperature);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        totalTemperature+=temperature;
        numberOfReadings++;

        if(minimumTemperature > temperature) minimumTemperature = temperature;
        if(maximumTemperature < temperature) maximumTemperature = temperature;

        display();

    }
}
