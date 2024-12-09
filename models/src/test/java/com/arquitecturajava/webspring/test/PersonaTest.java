package com.arquitecturajava.webspring.test;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.webspring.models.Persona;

public class PersonaTest {

	@Test
	public void mayorEdadTest() {
		//AAA arrange preparar
		Persona p = new Persona("pepe",20);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}

}
