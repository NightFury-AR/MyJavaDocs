package day09.dp_02_observer_pattern.weatherOrama2;

import day09.dp_02_observer_pattern.weatherOrama2.observers.WeatherForeCast;
import day09.dp_02_observer_pattern.weatherOrama2.observers.WeatherHeatIndex;
import day09.dp_02_observer_pattern.weatherOrama2.observers.WeatherLive;
import day09.dp_02_observer_pattern.weatherOrama2.observers.WeatherStatistics;
import day09.dp_02_observer_pattern.weatherOrama2.subject.WeatherData;

public class WeatherStation2 {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        WeatherStatistics weatherStatistics = new WeatherStatistics(weatherData);
        WeatherLive weatherLive = new WeatherLive(weatherData);
        WeatherHeatIndex weatherHeatIndex = new WeatherHeatIndex(weatherData);
        WeatherForeCast weatherForeCast = new WeatherForeCast(weatherData);

        weatherData.setWeatherData(80, 65, 30.4f);
        weatherData.setWeatherData(82, 70, 29.2f);
        weatherData.setWeatherData(78, 90, 29.2f);
    }
}
