package com.renta.peliculas;

public class Alquiler {
	private Disco disco;
	private int diasAlquilado;
	
	public Alquiler(Disco pDisco, int pDiasAlquilado) {
		this.setDisco(pDisco);
		this.setDiasAlquilado(pDiasAlquilado);
	}

	public Disco getDisco() {
		return disco;
	}

	public void setDisco(Disco pDisco) {
		this.disco = pDisco;
	}

	public int getDiasAlquilado() {
		return diasAlquilado;
	}

	public void setDiasAlquilado(int pDiasAlquilado) {
		this.diasAlquilado = pDiasAlquilado;
	}


	@Override
	public String toString() {
		return "Alquiler [disco=" + disco + ", diasAlquilado=" + diasAlquilado + "]";
	}
	
	
}
