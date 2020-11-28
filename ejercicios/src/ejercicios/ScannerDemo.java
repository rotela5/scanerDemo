package ejercicios;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc= new Scanner (System.in);
   String name = sc.nextLine();
   
   char genero = sc.next().charAt(0);
   int edad = sc.nextInt();
   long telefono = sc.nextLong();
   double promedio = sc.nextDouble();
   
   System.out.println("nombre :"+name);
   System.out.println("genero :"+genero);
   System.out.println("edad :"+edad);
   System.out.println("telefono :"+telefono);
   System.out.println("promedio :"+promedio);
   
   

	}

}
