package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        converter.toFahrenheit(30);
    }

    public void toFahrenheit(int temperatureCelsius) {
        double temperatureFahrenheit = (temperatureCelsius * 9.0/5.0) + 32;
        System.out.println(temperatureCelsius + "°C is equal to " + temperatureFahrenheit + "°F");
    }
}