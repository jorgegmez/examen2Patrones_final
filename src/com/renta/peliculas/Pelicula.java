package com.renta.peliculas;

public class Pelicula {
	public static final int INFANTIL = 2;
	public static final int NORMAL = 0;
	public static final int ESTRENO = 1;
	private String nombre;
	private int codigoPrecio;
	
	public Pelicula(String pNombre, int pCodigoPrecio) {
		this.setNombre(pNombre);
		this.setCodigoPrecio(pCodigoPrecio);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String pNombre) {
		this.nombre = pNombre;
	}

	public int getCodigoPrecio() {
		return codigoPrecio;
	}

	public void setCodigoPrecio(int pCodigoPrecio) {
		this.codigoPrecio = pCodigoPrecio;
	}
	
	public boolean persist() {
		boolean valid = false;
		
		valid = Registrar.add("Peliculas", this);
		
		return valid;
	}

	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", codigoPrecio=" + codigoPrecio + "]";
	}
	
	
	
}
