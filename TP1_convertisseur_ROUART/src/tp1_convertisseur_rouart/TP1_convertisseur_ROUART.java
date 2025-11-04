package tp1_convertisseur_rouart;
import java.util.Scanner;
public class TP1_convertisseur_ROUART{

   // Celius à Kelvin
    public static double CelsiusVersKelvin(double valeurCelsius) {
        return valeurCelsius + 273.15;
    }

    // Kelvin à Celsius
    public static double KelvinVersCelsius(double valeurKelvin) {
        return valeurKelvin - 273.15;
    }

    // Fahrenheit à Celsius
    public static double FahrenheitVersCelsius(double valeurFahrenheit) {
        return (valeurFahrenheit - 32) * 5 / 9;
    }

    // Celsius à Fahrenheit
    public static double CelsiusVersFahrenheit(double valeurCelsius) {
        return (valeurCelsius * 9 / 5) + 32;
    }

    // Kelvin à Fahrenheit
    public static double KelvinVersFahrenheit(double valeurKelvin) {       
        double valeurCelsius = KelvinVersCelsius(valeurKelvin);
        return CelsiusVersFahrenheit(valeurCelsius);
    }

    // Fahrenheit à Kelvin
    public static double FahrenheitVersKelvin(double valeurFahrenheit) {        
        double valeurCelsius = FahrenheitVersCelsius(valeurFahrenheit);
        return CelsiusVersKelvin(valeurCelsius);
        
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""                          
                           Saisir une conversion 1,2,3,4,5
                            1=CelsiusVersKelvin 
                            2 = KelvinVersCelsius 
                            3 = FahrenheitVersCelsius
                            4 = CelsiusVersFahrenheit
                            5 = KelvinVersFahrenheit
                            6 = FahrenheitVersKelvin """);
        int valeur = sc.nextInt();
        if (valeur == 1) { 
            System.out.println("Choisi une temperature en Celcius");
            double temp1 = CelsiusVersKelvin(sc.nextDouble());
            System.out.println("Voici ta temperature en Kelvin : " + temp1);
            
        } else if (valeur == 2) {
            System.out.println("Choisi une temperature en Kelvin");    
            double temp2 = KelvinVersCelsius(sc.nextDouble());   
            System.out.println("Voici ta temperature en Celsius : " + temp2);
            
        } else if (valeur == 3) {
            System.out.println("Choisi une temperature en Fahrenheit");
            double temp3 = FahrenheitVersCelsius(sc.nextDouble());   
            System.out.println("Voici ta temperature en Celsius : " + temp3);
            
        } else if (valeur == 4) {
            System.out.println("Choisi une temperature en Celsius");
            double temp4 = CelsiusVersFahrenheit(sc.nextDouble()); 
            System.out.println("Voici ta temperature en Fahrenheit : " + temp4);
            
        } else if (valeur == 5) {
            System.out.println("Choisi une temperature en Kelvin");
            double temp5 =  KelvinVersFahrenheit(sc.nextDouble()); 
            System.out.println("Voici ta temperature en Fahrenheit : " + temp5);
            
        } else if (valeur == 6) {
            System.out.println("Choisi une temperature en Fahrenheit");
            double temp6 = FahrenheitVersKelvin(sc.nextDouble());
            System.out.println("Voici ta temperature en Kelvin : " + temp6);
        } else {
            System.out.println("Valeur invalide !");
        }
        sc.close();
    }
}
