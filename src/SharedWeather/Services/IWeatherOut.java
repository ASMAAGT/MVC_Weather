/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SharedWeather.Services;

import SharedWeather.Entities.WeatherConfig;

/**
 *
 * @author Iyed
 */
public interface IWeatherOut {
       WeatherConfig GetWeatherInfo();
        void SetWeatherInfo(WeatherConfig info);
        void StartCollect();
        void StopCollect();
}
