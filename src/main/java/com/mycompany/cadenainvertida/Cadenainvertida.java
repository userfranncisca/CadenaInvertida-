/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cadenainvertida;

/**
 *
 * @author user
 */
public class Cadenainvertida {
 public String invertir(String cad) {
        return  new StringBuilder(cad).reverse().toString();
    }

    public static void main(String[] args) {
      Cadenainvertida ejemplo = new Cadenainvertida();
      String cadenanormal = "francisca";
      String cadenainvertida = ejemplo.invertir(cadenanormal);
        System.out.println("La cadena origininal es: "+ cadenanormal);
        System.out.println("La cadena invetida: "+ cadenainvertida);

    
}
}

 
