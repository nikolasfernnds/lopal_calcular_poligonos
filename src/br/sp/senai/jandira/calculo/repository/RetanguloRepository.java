package br.sp.senai.jandira.calculo.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calculo.model.Retangulo;

public class RetanguloRepository {

	public void criarRetangulo() {
		Scanner leitor = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		System.out.println();
		System.out.println("Criando um retangulo...");
		System.out.print("Qual a medida da altura do retangulo? ");
		retangulo.setAltura(leitor.nextDouble());
		System.out.print("Qual a medida da base do retangulo? ");
		retangulo.setBase(leitor.nextDouble());
		


		
		retangulo.exibirDados();
		
		leitor.close();
	}
}
