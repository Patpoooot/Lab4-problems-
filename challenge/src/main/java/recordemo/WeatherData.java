package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return temperatureCelsius * 9/5 + 32;
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        return "Current weather: " + temperatureCelsius + "⁰C (" + temperatureFahrenheit() + "⁰F) and " + conditions;
    }
    
    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
        double tempCelis = (tempFahrenheit - 32) * 5/9;
        return new WeatherData(tempCelis, conditions);
    }

    public static void main(String[] args) {

        //creating the weather obj
        WeatherData weather1 = new WeatherData(25, "Sunny");
        System.out.println("Today's weather: " + weather1.getSummary());

        //using the factory method
        WeatherData weather2 = WeatherData.fromFahrenheit(50, "Cloudy");
        System.out.println("Yesterday's weather: " + weather2.getSummary());
    }
}
