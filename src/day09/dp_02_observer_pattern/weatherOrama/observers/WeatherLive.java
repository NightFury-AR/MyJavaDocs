package day09.dp_02_observer_pattern.weatherOrama.observers;


import day09.dp_02_observer_pattern.weatherOrama.subject.WeatherSubject;

public class WeatherLive implements WeatherObserver,WeatherDisplay {

    private WeatherSubject weatherData;
    private float temperature;
    private float humidity;

    public WeatherLive(WeatherSubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
