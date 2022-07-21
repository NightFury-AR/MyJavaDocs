package day09.dp_02_observer_pattern.weatherOrama2.observers;

import day09.dp_02_observer_pattern.weatherOrama2.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class WeatherStatistics implements Observer,WeatherDisplay {

    Observable observable;
    private float minimumTemperature;
    private float maximumTemperature;
    private int totalTemperature;
    private int numberOfReadings;

    public WeatherStatistics(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void reportWeather() {
        System.out.println("Avg/Max/Min temperature = " + (totalTemperature / numberOfReadings)
                + "/" + maximumTemperature + "/" + minimumTemperature);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            totalTemperature+=weatherData.getTemperature();
            numberOfReadings++;
            if(minimumTemperature > weatherData.getTemperature()) minimumTemperature = weatherData.getTemperature();
            if(maximumTemperature < weatherData.getTemperature()) maximumTemperature = weatherData.getTemperature();
            reportWeather();
        }
    }
}
