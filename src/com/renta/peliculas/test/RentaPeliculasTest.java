package com.renta.peliculas.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.renta.peliculas.Alquiler;
import com.renta.peliculas.Cliente;
import com.renta.peliculas.Disco;
import com.renta.peliculas.Pelicula;

class RentaPeliculasTest {
	private static Cliente clienteTest = new Cliente("Jorge");
	private static Pelicula peliculaTest = new Pelicula("The Lion King", 2);
	private static Disco discoTest = new Disco("XC8", peliculaTest);
	private static Alquiler alquilerTest = new Alquiler(discoTest, 4);

	@Test
	void testRegPelicula() {
		assertEquals(true,peliculaTest.persist());
	}
	
	@Test
	void testRegCliente() {
		assertEquals(true,clienteTest.persist());
	}
	
	@Test
	void testRegDisco() {
		assertEquals(true,discoTest.persist());
	}
	
	@Test
	void testAlquiler() {
		assertEquals(true,clienteTest.addAlquiler(discoTest, 4));
	}
	
	@Test
	void testStatement() {
		assertEquals("Alquileres de Jorge:\n" +
	                 "\tThe Lion King" + "\t2\n" + 
				     "Monto total:  2.0\n" + 
				     "Gano 1 puntos por alquiler frecuente",clienteTest.statement());
	}

}
