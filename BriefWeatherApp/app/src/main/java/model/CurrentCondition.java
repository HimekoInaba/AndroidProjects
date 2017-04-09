package model;

/**
 * Created by Syrym on 2/19/2017.
 */

public class CurrentCondition {
    private int weatherId;
    private String condition;
    private String description;
    private String icon;
    private float pressure;
    private float humidity;
    private float maxTemp;
    private float minTemp;
    private double temprature;

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setMaxTemp(float maxTemp) {
        this.maxTemp = maxTemp;
    }

    public void setMinTemp(float minTemp) {
        this.minTemp = minTemp;
    }

    public void setTemprature(double temprature) {
        this.temprature = temprature;
    }

    public String getCondition() {
        return condition;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public float getMinTemp() {
        return minTemp;
    }

    public float getMaxTemp() {
        return maxTemp;
    }

    public double getTemprature() {
        return temprature;
    }
}
