package com.heinsohn.semillero.rodeores;

public abstract class Roedor {
	
	private String nombre;
	private String color;
	private int peso;
	private int tama�o;
	private String reproduccion= "Vivipara";
	private int numeroPatas=4;
	
	public Roedor(String nombre, String color, int peso, int tama�o) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.peso = peso;
		this.tama�o = tama�o;
	}
	
	
	
	public abstract String ObtenerEspecie();
	public abstract String Alimentarse();	
	
	public String Reproducirse() {
		return reproduccion;
	}
	public int ObtenerNumeroPatas() {
		return numeroPatas;
	}
	
	public String getNombre() {
		return nombre;
	}



	public String getColor() {
		return color;
	}



	public int getPeso() {
		return peso;
	}



	public int getTama�o() {
		return tama�o;
	}

	
}
