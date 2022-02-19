package com.teste;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSomar() {
		//fail("Not yet implemented");
		Calculadora calc = new Calculadora();
		int soma = calc.somar("1+1+40");
		assertEquals(42, soma);
	}
	
	@Test
	public void testSomarComMock() {
		Calculadora calculadora = mock(Calculadora.class);
		
		when(calculadora.somar("30+2+1")).thenReturn(99);
		
		int resultado = calculadora.somar("30+2+1");
		
		assertEquals(99, resultado);
	}

}
