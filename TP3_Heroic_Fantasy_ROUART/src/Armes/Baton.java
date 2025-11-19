package Armes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Rouart Antoine
 */
public class Baton extends Arme {
    int age;
    public Baton(String nom,int NA, int age) {
        super(NA, nom);
        if (age > 100) {
            System.out.println("baton cassé");
        }  
                else {
                this.age = age;}
    }
     
    @Override
    public String toString() {
        return "\nnom : "+ nom + "\nniveau d'attaque " + NA +  " \nage = " + age  ;
    }}
