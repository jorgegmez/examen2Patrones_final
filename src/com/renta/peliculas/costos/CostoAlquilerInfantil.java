package com.renta.peliculas.costos;

import com.renta.peliculas.Alquiler;

public class CostoAlquilerInfantil implements ICalculosAlquiler {

	@Override
	public double calculosCostoAlquiler(Alquiler alquiler) {
		double montoAlquiler = 0;
		montoAlquiler += 1.5;
        if (alquiler.getDiasAlquilado() > 3) {
        	montoAlquiler += (alquiler.getDiasAlquilado() - 3) * 1.5;
        }
		return montoAlquiler;
	}

}
