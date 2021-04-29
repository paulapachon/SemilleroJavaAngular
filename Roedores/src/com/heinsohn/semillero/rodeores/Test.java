package com.heinsohn.semillero.rodeores;

import java.util.ArrayList;
import java.util.List;


public class Test {

	public static void main(String[] args) {
		
		List<Roedor> roedores = new ArrayList<>();
		
		Raton raton1 = new Raton("Pepito","Negro",30,5);
		Hamster hamster1 = new Hamster("Mouse","Blanco",45,7);
		Jerbo jerbo1 = new Jerbo("Mark","Cafe",25,4);
		
		roedores.add(raton1);
		roedores.add(hamster1);
		roedores.add(jerbo1);
		
		for(Roedor r:roedores) {
			System.out.println("Especie: "+r.ObtenerEspecie());
			System.out.println("Nombre: "+r.getNombre());
			System.out.println("Color: "+r.getColor());
			System.out.println("Tamaño: "+r.getTamaño());
			System.out.println("Peso: "+r.getPeso());
			System.out.println("Número de Patas: "+r.ObtenerNumeroPatas());
			System.out.println("Alimento: "+r.Alimentarse());
			System.out.println("Reproducción: "+r.Reproducirse());
			System.out.println();
			
		}

	}

}
