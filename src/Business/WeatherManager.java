/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import SharedWeather.Entities.WeatherConfig;
import SharedWeather.Entities.WeatherInfo;
import SharedWeather.Services.IWeatherOut;
import SharedWeather.Services.IWeatherPrint;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Iyed
 */
public class WeatherManager implements IWeatherOut {
private IWeatherPrint weatherPrint;
private WeatherConfig config;
private WeatherInfo weatherInfo;
private Timer timerPrecipitation;
private Timer timerWind;
private Timer timerPressure;
private Timer timerTemperature;
private Random random;

   public WeatherManager(IWeatherPrint weatherPrint) {
        this.weatherPrint = weatherPrint;
        random = new Random(5);
        weatherInfo = new WeatherInfo();
    }

public void StartCollect() {
    weatherInfo = new WeatherInfo();
    if (config.isHasTemperature()) {
        timerPrecipitation = new Timer();
        timerPrecipitation.schedule(new TimerTask() {
            @Override
            public void run() {
                newValuePrecipitation();
            }
        }, 5000, 5000);
    }
    if (config.HasWind) {
        timerWind = new Timer();
        timerWind.schedule(new TimerTask() {
            @Override
            public void run() {
                newValueWind();
            }
        }, 3000, 3000);
    }
    if (config.isHasTemperature()) {
        timerTemperature = new Timer();
        timerTemperature.schedule(new TimerTask() {
            @Override
            public void run() {
                newValueTemperature();
            }
        }, 2000, 2000);
    }
    if (config.isHasPression()) {
        timerPressure = new Timer();
        timerPressure.schedule(new TimerTask() {
            @Override
            public void run() {
                newValuePression();
            }
        }, 10000, 10000);
    }
}

  private void newValuePression() {
        weatherInfo.setPression(random.nextInt(50));
        weatherPrint.writeWeather(weatherInfo);
    }

    private void newValueTemperature() {
        weatherInfo.setTemperature(random.nextInt(30));
        weatherPrint.writeWeatherValue("Temperature", Integer.toString(weatherInfo.getTemperature()));
        weatherPrint.writeWeather(weatherInfo);
    }

    private void newValueWind() {
        weatherInfo.setWind(random.nextInt(10));
        weatherPrint.writeWeatherValue("Wind", Integer.toString(weatherInfo.getWind()));
        weatherPrint.writeWeather(weatherInfo);
    }

    private void newValuePrecipitation() {
        weatherInfo.setPrecipitation(random.nextInt(100));
        weatherPrint.writeWeatherValue("Precipitation", Integer.toString(weatherInfo.getPrecipitation()));
        weatherPrint.writeWeather(weatherInfo);
    }

public WeatherConfig GetWeatherInfo() {
    return this.config;
}

public void SetWeatherInfo(WeatherConfig config) {
    this.config = config;
}

public void StopCollect() {
    if (timerPrecipitation != null) {
        timerPrecipitation.cancel();
    }
    if (timerPressure != null) {
        timerPressure.cancel();
    }
    if (timerWind != null) {
        timerWind.cancel();
    }
    if (timerTemperature != null) {
        timerTemperature.cancel();
    }
}
    
}
