package com.renta.peliculas.costos;

import com.renta.peliculas.Alquiler;

public class CostoAlquilerNormal implements ICalculosAlquiler {

	@Override
	public double calculosCostoAlquiler(Alquiler alquiler) {
		double montoAlquiler = 0;
		montoAlquiler += 2;
		if (alquiler.getDiasAlquilado() > 2) {
			montoAlquiler += (alquiler.getDiasAlquilado() - 2) * 1.5;
		} 
		return montoAlquiler;
	}
}
