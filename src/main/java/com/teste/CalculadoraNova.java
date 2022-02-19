package com.teste;

public class CalculadoraNova {

	public int somar(int ...valores) {
		// TODO Auto-generated method stub
		int soma = 0;
		for (int valor : valores) {
			soma += valor;
		}
		return soma;
	}

}
