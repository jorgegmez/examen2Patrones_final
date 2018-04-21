package com.renta.peliculas;

import java.util.ArrayList;
import java.util.Iterator;

public class Cliente {
	private static String nombre;
	private ArrayList<Alquiler> alquileres= new ArrayList<>();
	
	public Cliente() {}
	
	public Cliente(String pNombre) {
		this.setNombre(pNombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String pNombre) {
		this.nombre = pNombre;
	}

	public ArrayList<Alquiler> getAlquileres() {
		return alquileres;
	}
	
	public boolean addAlquiler(Disco pDisco, int pDiasAlquiler) {
		boolean valid = false;
		Alquiler nuevoAlquiler = new Alquiler(pDisco, pDiasAlquiler);
		if(alquileres == null || alquileres != null) {
			this.alquileres.add(nuevoAlquiler);
			System.out.println(nuevoAlquiler);
			valid = true;
		}
		return valid;
	}
	
	public String statement() {
		double montoTotal = 0;
		int puntosAlquilerFrecuente = 0;
		
		Iterator<Alquiler> iterator = alquileres.iterator();
		String result = "Alquileres de " + getNombre() + ":\n";
		
		while(iterator.hasNext()) {
			int montoAlquiler = 0;
			Alquiler alquiler = iterator.next();
			System.out.println("This is a test");
			switch(alquiler.getDisco().getPelicula().getCodigoPrecio()) {
				case Pelicula.NORMAL:
					montoAlquiler += 2;
					if (alquiler.getDiasAlquilado() > 2) {
						montoAlquiler += (alquiler.getDiasAlquilado() - 2) * 1.5;
					}      
				break;
				case Pelicula.ESTRENO:
					montoAlquiler += alquiler.getDiasAlquilado() * 3;
				break;
				case Pelicula.INFANTIL:
					montoAlquiler += 1.5;
                    if (alquiler.getDiasAlquilado() > 3) {
                    	montoAlquiler += (alquiler.getDiasAlquilado() - 3) * 1.5;
                    }    
				break;
			}
			montoTotal += montoAlquiler;
			puntosAlquilerFrecuente ++;
			
			// agregar bono por alquiler de pelicula "estreno"
            if ((alquiler.getDisco().getPelicula().getCodigoPrecio() == Pelicula.ESTRENO) 
            	&& alquiler.getDiasAlquilado() > 1) {
            	puntosAlquilerFrecuente ++; 
            }
          //mostrar datos
            result += "\t" + alquiler.getDisco().getPelicula().getNombre() +
            		  "\t" + String.valueOf(montoAlquiler) + "\n";
		}
		//fin del reporte
        result +=  "Monto total:  " + String.valueOf(montoTotal) + "\n";
        result += "Gano " + String.valueOf(puntosAlquilerFrecuente) +
        		  " puntos por alquiler frecuente";
        System.out.println(result);
       System.out.println(result);
		return result;
	}
	
	public boolean persist() {
		boolean valid = false;
		
		valid = Registrar.add("Clientes", this);
		
		return valid;
	}
	
	public static Cliente get(String pNombre) {
		Cliente miCliente = (Cliente) Registrar.get("Clientes", pNombre);
		System.out.println("Get cliente " + miCliente);
		
		return  miCliente;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + "]";
	}
	
}
