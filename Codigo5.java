package com.correccioncodigo5;

import java.util.Scanner;//se importó scanner

public class Codigo5 {
	public static void main(String[] args) {
		
    Scanner s = new Scanner(System.in); //Se agregó System.in al scanner
    
    System.out.print("Introduzca un número: "); //se cambiaron comillas
    int ni = s.nextInt(); //se cambió String por int y nextInt
    int c = ni;
    
    int afo = 0;
    int noAfo = 0;
    
    while (ni > 0) {
	  int digito = (int)(ni % 10);
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
		afo++;
      } else {
		noAfo++;
	  
	  ni /= 10;
    }
    if (afo > noAfo) {
      System.out.println("El " + c + " es un número afortunado.");//se completó el print
    } else {
      System.out.println("El " + c + " no es un número afortunado.");
    }
    break;//se estableció break para que sólo imprimiera una vez
  }s.close();//se cierra scanner
	}
}