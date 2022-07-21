package day09.dp_02_observer_pattern.weatherOrama.subject;

import day09.dp_02_observer_pattern.weatherOrama.observers.WeatherObserver;

public interface WeatherSubject {
    void registerObserver(WeatherObserver weatherObserver);
    void removeObserver(WeatherObserver weatherObserver);
    void notifyObserver();
}


