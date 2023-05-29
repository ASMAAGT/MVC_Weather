/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SharedWeather.Entities;



/**
 *
 * @author Iyed
 */
public class WeatherInfo  {
    public int Temperature ;
    public int Pression;
    public int Precipitation ;
    public int Wind ;

    public int getTemperature() {
        return Temperature;
    }

    public int getPression() {
        return Pression;
    }

    public int getPrecipitation() {
        return Precipitation;
    }

    public int getWind() {
        return Wind;
    }

    public void setTemperature(int Temperature) {
        this.Temperature = Temperature;
    }

    public void setPression(int Pression) {
        this.Pression = Pression;
    }

    public void setPrecipitation(int Precipitation) {
        this.Precipitation = Precipitation;
    }

    public void setWind(int Wind) {
        this.Wind = Wind;
    }

    public WeatherInfo() {
    }
    public String toString() {
    return "Temperature : " + Temperature + " " +
            "Vent : " + Wind + " " +
            "Pression : " + Pression + " " +
            "Précipitation : " + Precipitation + " ";
}
    
 
}
   

  