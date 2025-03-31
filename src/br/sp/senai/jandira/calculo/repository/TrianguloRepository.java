package br.sp.senai.jandira.calculo.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calculo.model.Triangulo;

public class TrianguloRepository {
	
	public void criarTriangulo() {
		Scanner leitor = new Scanner(System.in);
		Triangulo triangulo = new Triangulo();
		System.out.println();
		System.out.println("Criando Triangulo...");
		System.out.print("Qual a medida da base do triangulo? ");
		triangulo.setBase(leitor.nextDouble());
		System.out.print("Qual a medida da altura do triangulo? ");
		triangulo.setAltura(leitor.nextDouble());
		
		triangulo.exibirDados();
		leitor.close();
	}

}
