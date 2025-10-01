package streams;

import java.util.*;
import java.util.stream.Collectors;

public class WeatherDataStreams {

    public static void main(String[] args) {
        List<WeatherData> weatherDataList = List.of(
                new WeatherData("New York", 85.0, 70.0, 10.0, "Sunny"),
                new WeatherData("Los Angeles", 78.0, 60.0, 5.0, "Cloudy"),
                new WeatherData("Chicago", 90.0, 80.0, 15.0, "Rainy"),
                new WeatherData("Houston", 95.0, 75.0, 20.0, "Sunny"),
                new WeatherData("Phoenix", 100.0, 20.0, 25.0, "Sunny")
        );
        Double a=calcAverageTemp(weatherDataList);
        Double b = maxTemperatur(weatherDataList);
        Double c = minTemp(weatherDataList);
        String st = maxHumidityLocation(weatherDataList);
        List<String> loc = locationAboveThreshold(weatherDataList);
        String str1 = commonWeather(weatherDataList);
        Double d = tempRange(weatherDataList);
        List<String> locs = locationsWithinSpeedRange(weatherDataList,10.0,25.0);
    }

    // Calculate the sum of all temperature divided by the number of records.
    // Input List of WeatherData objects. Expected Output is AverageTemperature.
    public static Double calcAverageTemp(List<WeatherData> weatherData){
        Double avgTemp = weatherData.stream().mapToDouble(WeatherData::getTemperature).average().orElse(0.0);
        System.out.println(avgTemp);
        return avgTemp;
    }

    // Calculate max temperature
    public static Double maxTemperatur(List<WeatherData> data){
        Double maxTemp=data.stream().mapToDouble(WeatherData::getTemperature).max().orElse(0.0);
        System.out.println(maxTemp);
        return maxTemp;
    }

    // Calculate min temperature
    public static Double minTemp(List<WeatherData> data){
        Double minTemp = data.stream().mapToDouble(WeatherData::getTemperature).min().orElse(0.0);
        System.out.println(minTemp);
        return minTemp;
    }

    // Location with Max humidity
    public static String maxHumidityLocation(List<WeatherData> data){
        String str = data.stream().max(Comparator.comparing(WeatherData::getHumidity)).map(WeatherData::getLocation).orElse("");
        System.out.println(str);
        return str;
    }

    // Find all locations where the temperature is above a given threshold
    public static List<String> locationAboveThreshold(List<WeatherData> data){
        Double threshold = 85.0;
        List<String> lst = data.stream().filter(e->e.getTemperature()>threshold).map(WeatherData::getLocation).collect(Collectors.toList());
        // if i do data.stream().filter(e->e.getTemperature()>threshold).collect(Collectors.toList());
        // then it will return List<WeatherData> objects

        System.out.println(lst.toString());
        return lst;
    }

    // Find most common weathercondition in dataset and return string
    public static String commonWeather(List<WeatherData> data){
        String str = data.stream().collect(Collectors.groupingBy(WeatherData::getWeatherCondition,Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("");
        System.out.println(str);
        return str;
    }

    // Calculate the difference between highest and lowest temperature
    public static Double tempRange(List<WeatherData> data){
        Double range = data.stream().mapToDouble(WeatherData::getTemperature).max().orElse(0.0)
                - data.stream().mapToDouble(WeatherData::getTemperature).min().orElse(0.0);

        System.out.println("Range Diff : "+ range);
        return range;
    }

    //find location within maxSpeed and minSpeed Range
    public static List<String> locationsWithinSpeedRange(List<WeatherData> data,Double minSpeed,Double maxSpeed){
        List<String> str = data.stream().filter(e->e.getWindSpeed()>=minSpeed && e.getWindSpeed()<=maxSpeed)
                .map(WeatherData::getLocation)
                .collect(Collectors.toList());
        System.out.println(str);
        return str;
    }
}

