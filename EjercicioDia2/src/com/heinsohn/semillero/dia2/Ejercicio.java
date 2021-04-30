package com.heinsohn.semillero.dia2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ejercicio {

	public static void main(String[] args) {
		
		//Ejercicio 1
		String fecha= "29/04/2021";
		String dia= fecha.substring(0, 2);
		String mes= fecha.substring(3, 5);
		String año= fecha.substring(6,10);
		
		System.out.println(dia);
		System.out.println(mes);
		System.out.println(año);
		
		//Ejercicio 2
		int arreglo[] = {3,5,7,9,4};
		int suma = 0;
		for(int i: arreglo) {
			suma+=i;
		}
		System.out.println(suma);
		
		//Ejercicio 3
		Scanner leer=new Scanner(System.in);
		List<Integer> precios = new ArrayList<>();
		
		for(int i=0;i<5;i++) {
			precios.add(leer. nextInt());
		}
		double precio;
		int total=0;
		int mayor=0;
		for(int i:precios) {
			if(i>mayor) {
				mayor=i;
			}
			total+=i;
		}
		
		if(total>300) {
			precio=total*1.1;
		}
		else {
			precio=total*1.07;
		}
		System.out.println("Precio mayor: "+mayor);
		System.out.println("Precio final: "+precio);

	}

}
