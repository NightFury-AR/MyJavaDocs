package day09.dp_02_observer_pattern.weatherOrama.observers;

public interface WeatherObserver {
    void update(float temperature,float humidity,float pressure);
}
