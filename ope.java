package Operaciones;
import java.util.Scanner;
public class ope {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int a;
        do {
		int eleccion;
		int x;
		int y;
		int respuesta;
		System.out.println("Menu de operaciones: ");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Division");
		System.out.println("Ingrese su eleccion: ");
		eleccion = in.nextInt();
		System.out.println("Ingrese el primer numero: ");
		x = in.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		y = in.nextInt();
		
		switch(eleccion) {
		
		case 1: 
			respuesta = x + y;
			System.out.println("El resultado de la suma es: "+respuesta);
			break;
		case 2: 
			respuesta = x - y;
			System.out.println("El resultado de la resta es: "+respuesta);
			break;
		case 3: 
			respuesta = x * y;
			System.out.println("El resultado de la multiplicacion es: "+respuesta);
			break;
		case 4: 
			if (y != 0) {
				respuesta = x/y;
				System.out.println("El resultado de la multiplicacion es: "+respuesta);
			} else
				System.out.println("El denominador no puede ser 0");
			break;

		}
		 System.out.println("Para continuar ingrese 1: ");
		 a = in.nextInt();
		}while (a==1);
        
		
	}

}
