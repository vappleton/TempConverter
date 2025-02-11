public class Conversions {

    private static final double kelvinConstant = 273.15;
    private static final double fahrenheitConstant = 32;
    private static final double fahrenheitMultiplier = 5.0 / 9.0;
    private static final double kelvinMultiplier = 9.0 / 5.0;

    public static double celsiusToKelvin(double celsius) {
        return celsius + kelvinConstant;
    }
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - kelvinConstant;
    }

    public static double fahrenheitToCelsius( double fahrenheit) {
        return (fahrenheit - fahrenheitConstant) * fahrenheitMultiplier;
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * kelvinMultiplier) + fahrenheitConstant;
    }

    public static double fahrenheitToKelvin( double fahrenheit) {
        return celsiusToKelvin(fahrenheitToCelsius(fahrenheit));
    
    }
    public static double kelvinToFahrenheit(double kelvin) {
        return celsiusToFahrenheit(kelvinToCelsius(kelvin));
    }
}