/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weather;

import SharedWeather.Entities.WeatherInfo;
import SharedWeather.Services.IWeatherPrint;

/**
 *
 * @author Iyed
 */
public class ConsoleWeather implements IWeatherPrint {
    @Override
    public void writeWeather(WeatherInfo weatherInfo) {
        System.out.println("Précipitation = " + weatherInfo.Precipitation);
        System.out.println("Température = " + weatherInfo.Temperature);
        System.out.println("Vent = " + weatherInfo.Wind);
        System.out.println("Pression = " + weatherInfo.Pression);
    }

    @Override
    public void writeWeatherValue(String valueType, String value) {
        System.out.println("pour la " + valueType + " : " + value);
    }
}
