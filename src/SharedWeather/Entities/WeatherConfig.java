/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SharedWeather.Entities;

/**
 *
 * @author Iyed
 */
public class WeatherConfig {
    public boolean HasTemperature ;
    public boolean HasPression ;
    public boolean HasWind ;
    public boolean HasPrecipitation ;

    public boolean isHasTemperature() {
        return HasTemperature;
    }

    public boolean isHasPression() {
        return HasPression;
    }

    public boolean isHasWind() {
        return HasWind;
    }

    public boolean isHasPrecipitation() {
        return HasPrecipitation;
    }

    public void setHasTemperature(boolean HasTemperature) {
        this.HasTemperature = HasTemperature;
    }

    public void setHasPression(boolean HasPression) {
        this.HasPression = HasPression;
    }

    public void setHasWind(boolean HasWind) {
        this.HasWind = HasWind;
    }

    public void setHasPrecipitation(boolean HasPrecipitation) {
        this.HasPrecipitation = HasPrecipitation;
    }

    public WeatherConfig() {
    }
    
    
    
    
}
