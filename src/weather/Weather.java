/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package weather;

import Business.WeatherManager;
import SharedWeather.Entities.WeatherConfig;
import SharedWeather.Services.IWeatherOut;
import java.io.IOException;

/**
 *
 * @author Iyed
 */
public class Weather {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IWeatherOut weatherManager;
        System.out.println("Hello weather With JAVA");
        weatherManager = new WeatherManager(new ConsoleWeather());
        WeatherConfig info = new WeatherConfig();
        info.setHasPrecipitation(true);
        info.setHasPression(false);
        info.setHasWind(true);
        weatherManager.SetWeatherInfo(info);
        weatherManager.StartCollect();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        weatherManager.StopCollect();
    }
    }
    

