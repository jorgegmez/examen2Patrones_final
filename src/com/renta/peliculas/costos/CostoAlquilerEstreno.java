package com.renta.peliculas.costos;

import com.renta.peliculas.Alquiler;

public class CostoAlquilerEstreno implements ICalculosAlquiler {

	@Override
	public double calculosCostoAlquiler(Alquiler alquiler) {
		double montoAlquiler = 0;
		montoAlquiler += alquiler.getDiasAlquilado() * 3;
		return montoAlquiler;
	}

}
