package com.heinsohn.semillero.rodeores;

public class Hamster extends Roedor {

	public Hamster(String nombre, String color, int peso, int tama�o) {
		super(nombre, color, peso, tama�o);
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
