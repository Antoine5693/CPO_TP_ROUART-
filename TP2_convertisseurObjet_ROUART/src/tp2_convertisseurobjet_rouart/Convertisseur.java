/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_rouart;

/**
 *
 * @author Rouart Antoine
 */
public class Convertisseur {
    int nbConversions;
    
    public Convertisseur(){
        nbConversions = 0 ; 
        System.out.println("Convertisseur éxécuté !");
        
    }
       // Celius à Kelvin
    public double CelsiusVersKelvin(double valeurCelsius) {
        nbConversions++;
        return valeurCelsius + 273.15;
    }

    // Kelvin à Celsius
    public double KelvinVersCelsius(double valeurKelvin) {
        nbConversions++;
        return valeurKelvin - 273.15;
        
    }

    // Fahrenheit à Celsius
    public double FahrenheitVersCelsius(double valeurFahrenheit) {
        nbConversions++;
        return (valeurFahrenheit - 32) * 5 / 9;
    }

    // Celsius à Fahrenheit
    public double CelsiusVersFahrenheit(double valeurCelsius) {
        nbConversions++;
        return (valeurCelsius * 9 / 5) + 32;
    }

    // Kelvin à Fahrenheit
    public double KelvinVersFahrenheit(double valeurKelvin) {
        nbConversions-=1;
        double valeurCelsius = KelvinVersCelsius(valeurKelvin);
        return CelsiusVersFahrenheit(valeurCelsius);
    }

    // Fahrenheit à Kelvin
    public double FahrenheitVersKelvin(double valeurFahrenheit) {
        nbConversions-=1;
        double valeurCelsius = FahrenheitVersCelsius(valeurFahrenheit);
        return CelsiusVersKelvin(valeurCelsius);
        
        }
    @Override 
    public String toString () 
    { return "nb de conversions"+ nbConversions; } 
}