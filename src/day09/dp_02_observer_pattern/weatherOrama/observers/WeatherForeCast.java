package day09.dp_02_observer_pattern.weatherOrama.observers;

import day09.dp_02_observer_pattern.weatherOrama.observers.WeatherDisplay;
import day09.dp_02_observer_pattern.weatherOrama.observers.WeatherObserver;
import day09.dp_02_observer_pattern.weatherOrama.subject.WeatherData;

public class WeatherForeCast implements WeatherObserver, WeatherDisplay {

    private float currentPressure = 0f;
    private float prevPressure;
    private WeatherData weatherData;

    public WeatherForeCast(WeatherData weatherData,float currentPressure) {
        this.weatherData = weatherData;
        this.currentPressure = currentPressure;
        this.weatherData.registerObserver(this);
    }


    @Override
    public void display() {

        System.out.println("WeatherForecast : "
                +( currentPressure > prevPressure ? " Improving Weather on the way !"
                : (currentPressure == prevPressure ? " More on the same !" : "Watch out for cooler, rainy weather !")));

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        prevPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
}
