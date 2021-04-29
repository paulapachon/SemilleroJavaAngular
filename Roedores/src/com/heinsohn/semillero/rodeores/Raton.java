package com.heinsohn.semillero.rodeores;

public class Raton extends Roedor{

	public Raton(String nombre, String color, int peso, int tamaño) {
		super(nombre, color, peso, tamaño);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ObtenerEspecie() {
		return "Raton";
	
	}

	@Override
	public String Alimentarse() {
		return "Herviboro";
		
	}
	
	
}
