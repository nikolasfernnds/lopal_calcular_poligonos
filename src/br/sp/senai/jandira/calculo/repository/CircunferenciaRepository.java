package br.sp.senai.jandira.calculo.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calculo.model.Circunferencia;

public class CircunferenciaRepository {
	
	public void criarCircunferencia() {
		Scanner leitor = new Scanner(System.in);
		Circunferencia circunferencia = new Circunferencia();
		System.out.println();
		System.out.println("Criando uma circunferencia...");
		System.out.print("Qual a medida do raio? ");
		circunferencia.setRaio(leitor.nextDouble());
		
	
		circunferencia.exibirDados();
	
		leitor.close();
	}
}
