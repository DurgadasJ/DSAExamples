package streams;

public class WeatherData {

    private String location;

    private Double temperature;

    private Double humidity;

    private Double windSpeed;

    private String weatherCondition;

    public WeatherData(String location, Double temperature, Double humidity, Double windSpeed, String weatherCondition) {
        this.location = location;
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.weatherCondition = weatherCondition;
    }

    public String getLocation() {
        return location;
    }

    public Double getTemperature() {
        return temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public String getWeatherCondition() {
        return weatherCondition;
    }

    @Override
    public String toString() {
        return "WeatherData [location=" + location + ", temperature=" + temperature + ", humidity=" + humidity
                + ", windSpeed=" + windSpeed + ", weatherCondition=" + weatherCondition + "]";
    }
}
