package br.sp.senai.jandira.calculo.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calculo.model.Quadrado;

public class QuadradoRepository {
	
	public void criarQuadrado() {
		Scanner leitor = new Scanner(System.in);
		System.out.println();
		System.out.println("Criando um quadrado...");
		System.out.print("Qual a medida de um dos lados do quadrado? ");
		
		Quadrado quadrado = new Quadrado();
		quadrado.setLado(leitor.nextDouble());
		
		quadrado.exibirDados();
		
		leitor.close();
	}

}
