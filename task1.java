import java.util.Scanner;

public class task1 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a temperature value: ");
        double temperature = sc.nextDouble();
        System.out.println("Enter the unit of the temperature value (Celsius or Fahrenheit): ");
        String unit = sc.next();
        if (temperature < -273.15) {
            System.out.println("Invalid temperature value. Temperature must be greater than or equal to -273.15 degrees Celsius.");
            System.exit(1);
        }

        if (!unit.equalsIgnoreCase("Celsius") && !unit.equalsIgnoreCase("Fahrenheit")) 
        {
            System.out.println("Invalid temperature unit. Unit must be either Celsius or Fahrenheit.");
            System.exit(1);
        }
        double convertedTemperature;
        if (unit.equalsIgnoreCase("Celsius")) {
            convertedTemperature = (temperature * 9/5) + 32;
        } else {
            convertedTemperature = (temperature - 32) * 5/9;
        }

        System.out.println("The converted temperature is: " + convertedTemperature + " degrees " + ((unit.equalsIgnoreCase("Celsius")) ? "Fahrenheit" : "Celsius"));
    }
}
