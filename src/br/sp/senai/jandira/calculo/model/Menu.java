package br.sp.senai.jandira.calculo.model;

import java.util.Scanner;

public class Menu {
	public static void criarMenu() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("====================");
		System.out.println("Calculadora de Poligonos");
		System.out.println("====================");
		System.out.println("1 - Retângulo");
		System.out.println("2 - Quadrado");
		System.out.println("3 - Triangulo");
		System.out.println("4 - Circunferência");
		System.out.println("5 - Trapézio");
		System.out.println("====================");
		System.out.println("Escolha uma opção (1 - 5)");
		
		int opcao = leitor.nextInt();
		
		if (opcao == 2) {
			CalculoDePoligonos.calcularRetangulo();
		} else {
			System.out.println("A opção selecionanda ainda não foi implementada");
		}
	}
}
