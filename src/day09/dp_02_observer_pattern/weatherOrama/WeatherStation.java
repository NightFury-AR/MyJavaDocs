package day09.dp_02_observer_pattern.weatherOrama;

import day09.dp_02_observer_pattern.weatherOrama.observers.WeatherForeCast;
import day09.dp_02_observer_pattern.weatherOrama.observers.WeatherHeatIndex;
import day09.dp_02_observer_pattern.weatherOrama.observers.WeatherLive;
import day09.dp_02_observer_pattern.weatherOrama.observers.WeatherStatistics;
import day09.dp_02_observer_pattern.weatherOrama.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        WeatherLive weatherLive = new WeatherLive(weatherData);
        WeatherForeCast weatherForeCast = new WeatherForeCast(weatherData,20);
        WeatherStatistics weatherStatistics = new WeatherStatistics(weatherData);
        WeatherHeatIndex weatherHeatIndex = new WeatherHeatIndex(weatherData);
        System.out.println("==============================Weather Forecast started===============================");
        weatherData.setWeather(80, 65, 30.4f);
        System.out.println("==============================Weather Forecast started===============================");
        weatherData.setWeather(82, 70, 29.2f);
        System.out.println("==============================Weather Forecast started===============================");
        weatherData.setWeather(78, 90, 29.2f);
    }
}





