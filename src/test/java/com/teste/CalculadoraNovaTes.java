package com.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraNovaTes {
	
	@Test
	public void deveSomarTresValores() {
		int valorA = 1;
		int valorB = 2;
		int valorC = 30;
		
		CalculadoraNova calc =  new CalculadoraNova();
		int soma = calc.somar(valorA, valorB, valorC);
		
		assertEquals(33, soma);
	}
}
