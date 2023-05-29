/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SharedWeather.Services;

import SharedWeather.Entities.WeatherInfo;

/**
 *
 * @author Iyed
 */
public interface IWeatherPrint {
    
     
    void writeWeatherValue(String valueType, String value);
    void writeWeather(WeatherInfo weatherInfo);
}
