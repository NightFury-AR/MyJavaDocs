package day09.dp_02_observer_pattern.weatherOrama2.observers;

import day09.dp_02_observer_pattern.weatherOrama2.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class WeatherLive implements Observer,WeatherDisplay {

    Observable obeObservable;
    private float temperature;
    private float humidity;

    public WeatherLive(Observable obeObservable) {
        this.obeObservable = obeObservable;
        obeObservable.addObserver(this);
    }

    @Override
    public void reportWeather() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }


    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            reportWeather();
        }
    }
}
