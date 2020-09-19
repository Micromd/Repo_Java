package Class3;

public class Homework2 {
    public static void main (String[] args){

        // Fahrenheit to Celsius. Formula  T(°C) = (T(°F) - 32) × 5/9
        double fTemp = 123;
        double cTemp = (fTemp - 32) * 5/9;
        System.out.println(fTemp + " °F is equal to " + cTemp + "°C." );

        // Fahrenheit to Kelvin. Formula T(K) = (T(°F) + 459.67) × 5/9
        fTemp = 230.59;
        double kTemp = (fTemp +459.67) * 5/9;
        System.out.println(fTemp + " °F is equal to " + kTemp + "K" );

        // Kelvin to Celsius. Formula  T(°C) = T(K) - 273.15
        kTemp = 0;
        cTemp = kTemp - 273.15;
        System.out.println(kTemp + " K is equal to " + cTemp + "°C" );

        // Kelvin to Fahrenheit. Formula T(°F) = T(K) × 9/5 - 459.67
        fTemp = kTemp * 9/5 - 459.67 ;
        System.out.println(kTemp + " K is equal to " + fTemp + "°F");

        // Celsius to Fahrenheit. Formula T(°F) = T(°C) × 9/5 + 32
        cTemp = 92300.56 ;
        fTemp = cTemp * 9/5 + 32;
        System.out.println(cTemp + " °C is equal to " + fTemp + "°F");

        // Celsius to Kelvin. Formula T(K) = T(°C) + 273.15
        cTemp = -51.36;
        kTemp = cTemp + 273.15;
        System.out.println(cTemp + " °C is equal to " + kTemp + "K");









    }


























}
