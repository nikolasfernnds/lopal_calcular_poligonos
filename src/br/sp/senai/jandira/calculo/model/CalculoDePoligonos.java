package br.sp.senai.jandira.calculo.model;

import java.util.Scanner;

public class CalculoDePoligonos {

	
	public static void calcularRetangulo() {
		
		Retangulo retangulo = new Retangulo();
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Qual é a altura do retângulo:");
		double altura = leitor.nextDouble();
		
		System.out.print("Qual é a altura do retângulo:");
		double base = leitor.nextDouble();
		
		retangulo.setAltura(altura);
		retangulo.setBase(base);
		retangulo.exibirDados();
		
		leitor.close();
	}
}
