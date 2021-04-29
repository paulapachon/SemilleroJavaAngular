package com.heinsohn.semillero.rodeores;

public class Hamster extends Roedor {

	public Hamster(String nombre, String color, int peso, int tamaño) {
		super(nombre, color, peso, tamaño);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ObtenerEspecie() {
		// TODO Auto-generated method stub
		return "Hamster";
	}

	@Override
	public String Alimentarse() {
		// TODO Auto-generated method stub
		return "Omnivoros";
	}
	
	
}
