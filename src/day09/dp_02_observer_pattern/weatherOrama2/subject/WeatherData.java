package day09.dp_02_observer_pattern.weatherOrama2.subject;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {

    private Float temperature;
    private Float pressure;
    private Float humidity;

    public WeatherData() {}

    public void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public void setWeatherData(float temperature,float pressure,float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public Float getTemperature() {
        return temperature;
    }

    public Float getPressure() {
        return pressure;
    }

    public Float getHumidity() {
        return humidity;
    }
}
