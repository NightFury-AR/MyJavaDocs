package day09.dp_02_observer_pattern.weatherOrama.subject;

import day09.dp_02_observer_pattern.weatherOrama.observers.WeatherObserver;

import java.util.ArrayList;
import java.util.List;


public class WeatherData implements WeatherSubject {

    private List<WeatherObserver> observerList;
    private Float temperature;
    private Float humidity;
    private Float pressure;

    public WeatherData() {
        this.observerList = new ArrayList<WeatherObserver>();
    }

    @Override
    public void registerObserver(WeatherObserver weatherObserver) {
        observerList.add(weatherObserver);
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        int i = observerList.indexOf(weatherObserver);
        if(i>=0) observerList.remove(i);
    }

    @Override
    public void notifyObserver() {
        observerList.stream().forEach( observer -> observer.update(this.temperature,this.humidity,this.pressure));
    }

    public void weatherChanged() {
        notifyObserver();
    }

    public void setWeather(float temperature,float humidity,float pressure) {
        this.temperature=temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        weatherChanged();
    }

    public Float getTemperature() {
        return temperature;
    }

    public Float getHumidity() {
        return humidity;
    }

    public Float getPressure() {
        return pressure;
    }
}
