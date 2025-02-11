import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
 
            //get coversion units
            System.out.println("Temperature Converter");    
            System.out.println("From: ");
            String from =  scanner.nextLine().trim().toLowerCase();
            
            System.out.println("To: ");
            String to = scanner.nextLine().trim().toLowerCase();
        
            System.out.println("Value: ");
            double tempValue = Double.parseDouble(scanner.nextLine());
        

        //performs conversion based on user input

        switch (from) {
            case "celsius":
                switch (to) {
                    case "kelvin":
                        System.out.printf("Kelvin: %.2f\n", Conversions.celsiusToKelvin(tempValue));
                        break;
                    case "fahrenheit":
                        System.out.printf("Fahrenheit: %.2f\n ", Conversions.celsiusToFahrenheit(tempValue));
                        break;
                }
                break;
            case "kelvin":
                switch (to) {
                    case "celsius":
                        System.out.printf("Celsius: %.2f\n", Conversions.kelvinToCelsius(tempValue));
                        break;
                    case "fahrenheit":
                        System.out.printf("Fahrenheit: %.2f\n", Conversions.kelvinToFahrenheit(tempValue));
                        break;
                }
                break;
            case "fahrenheit":
                switch (to) {
                    case "celsius":
                        System.out.printf("Celsius: %.2f\n", Conversions.fahrenheitToCelsius(tempValue));
                        break;
                    case "kelvin":
                        System.out.printf("Kelvin: %.2f\n", Conversions.fahrenheitToKelvin(tempValue));
                        break;

                }
                break;
        }

    } catch (NumberFormatException e) {
        System.out.println("Invalid input");

         }
    scanner.close();
  

            
    }
}


