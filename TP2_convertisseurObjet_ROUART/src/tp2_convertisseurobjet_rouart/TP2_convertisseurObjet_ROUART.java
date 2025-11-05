/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_rouart;

import java.util.Scanner;

/**
 *
 * @author Rouart Antoine
 */
public class TP2_convertisseurObjet_ROUART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Convertisseur Va = new Convertisseur();
        Scanner sc = new Scanner(System.in) ;
        System.out.println("saisissez une convertion entre 1:c->k,2:k->c,3:f->c,4:c->f,5:k->f,6:f->k");
        double mod = sc.nextDouble();
        System.out.println("saisi une temp");
        double temp= sc.nextDouble();
        if (mod==1){
            System.out.println(Va.CelsiusVersKelvin(temp));
        }
        if (mod==2){
            System.out.println(Va.KelvinVersCelsius(temp));
        }
        if (mod==3){
            System.out.println(Va.FahrenheitVersCelsius(temp));
        }
        if (mod==4){
            System.out.println(Va.CelsiusVersFahrenheit(temp));
        }
        if (mod==5){
            System.out.println(Va.KelvinVersFahrenheit(temp));
        }
        if (mod==6){
            System.out.println(Va.FahrenheitVersKelvin(temp));
        }
        sc.close();
    }}