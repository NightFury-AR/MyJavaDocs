package day09.dp_02_observer_pattern.weatherOrama2.observers;

import day09.dp_02_observer_pattern.weatherOrama2.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class WeatherForeCast implements Observer,WeatherDisplay {

    Observable observable;
    private float currentPressure;
    private float prevPressure;

    public WeatherForeCast(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void reportWeather() {
        System.out.println("WeatherForecast : "
                +( currentPressure > prevPressure ? " Improving Weather on the way !"
                : (currentPressure == prevPressure ? " More on the same !" : "Watch out for cooler, rainy weather !")));
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.prevPressure = this.currentPressure;
            this.currentPressure = weatherData.getPressure();
            reportWeather();
        }
    }
}
