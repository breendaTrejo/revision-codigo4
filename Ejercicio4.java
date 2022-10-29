package com.generation;
import java.util.Scanner;

public class Codigo4 {

    Scanner s = new Scanner();
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    Scanner s2 = new Scanner();
    String j2 = s2.nextLine();//la variable j2 debe apuntar a su propio scanner s2
    
    if (j1.equals(j2)) { //comparacion por referencia con equals
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) {
            g = 1;
            break; //poner break al termino de cada case
          

        case "papel":
          if (j2.equals( "piedra")) {
            g = 1;
            break;
          
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          
          break;
          
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
  
  
}