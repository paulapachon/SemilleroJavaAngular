package com.heinsohn.semillero.rodeores;

public class Jerbo extends Roedor{

	public Jerbo(String nombre, String color, int peso, int tamaño) {
		super(nombre, color, peso, tamaño);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ObtenerEspecie() {
		// TODO Auto-generated method stub
		return "Jerbo";
	}

	@Override
	public String Alimentarse() {
		// TODO Auto-generated method stub
		return "Omnivoro";
	}

}
