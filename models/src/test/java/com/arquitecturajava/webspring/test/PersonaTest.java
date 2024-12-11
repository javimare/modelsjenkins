package com.arquitecturajava.webspring.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.arquitecturajava.webspring.models.Persona;

public class PersonaTest {

	@Test
	public void mayorEdadTest() {
		//arrange preparar
		Persona p= new Persona("pepe",20);
		boolean esMayor=p.esMayorEdad();
		assertTrue(esMayor);
	}

}
