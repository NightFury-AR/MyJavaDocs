package day09.dp_02_observer_pattern.weatherOrama2.observers;

import java.util.Observable;
import java.util.Observer;

public interface WeatherObserver extends Observer {

    @Override
    void update(Observable o, Object arg);
    
}
