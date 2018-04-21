package com.renta.peliculas;

import java.util.HashMap;

public class Registrar {
	private static HashMap<String, String> Peliculas = new HashMap<String, String>();
	private static HashMap<String, String> Clientes = new HashMap<String, String>();
	private static HashMap<String, String> Discos = new HashMap<String, String>();
	
	public static boolean add(String pColeccion, Object pObjeto) {
		boolean valid = false;
		
		switch(pColeccion) {
			case "Peliculas":
				Pelicula nuevaPelicula = (Pelicula) pObjeto;
				Peliculas.put(nuevaPelicula.getNombre(), nuevaPelicula.toString());
				valid = true;
				System.out.println(Peliculas.toString());
			break;
			
			case "Clientes":
				Cliente nuevoCliente = (Cliente) pObjeto;
				Clientes.put(nuevoCliente.getNombre(), nuevoCliente.toString());
				valid = true;
				System.out.println(Clientes.toString());
			break;
			
			case "Discos":
				Disco nuevoDisco = (Disco) pObjeto;
				Discos.put(nuevoDisco.getNumeroSerie(), nuevoDisco.toString());
				valid = true;
				System.out.println(Discos.toString());
			break;
			
			default:
				valid = false;
			break;
		}
		return valid;
	}
	
	public static Object get(String pColeccion, String pNombre) {
		if("Clientes".equals(pColeccion)) {
			return Clientes.get(pNombre);
		}else{

			return Peliculas.get(pNombre);
		}
	}

	
	
}
