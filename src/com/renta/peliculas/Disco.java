package com.renta.peliculas;

public class Disco {
	private String numeroSerie;
	private Pelicula pelicula;
	
	public Disco(String pNumeroSerie, Pelicula pPelicula) {
		this.setNumeroSerie(pNumeroSerie);
		this.setPelicula(pPelicula);
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String pNumeroSerie) {
		this.numeroSerie = pNumeroSerie;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pPelicula) {
		this.pelicula = pPelicula;
	}
	
	public boolean persist() {
		boolean valid = false;
		
		valid = Registrar.add("Discos", this);
		
		return valid;
	}

	@Override
	public String toString() {
		return "Disco [numeroSerie=" + numeroSerie + ", pelicula=" + pelicula + "]";
	}
	
}
