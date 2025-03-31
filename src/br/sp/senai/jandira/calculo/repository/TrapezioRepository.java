package br.sp.senai.jandira.calculo.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calculo.model.Trapezio;

public class TrapezioRepository {
	
	public void criarTrapezio() {
	Scanner leitor = new Scanner(System.in);
	Trapezio trapezio = new Trapezio();
	System.out.println();
	System.out.println("Criando um trapézio...");
	System.out.print("Qual o valor da base maior do trapézio? ");
	trapezio.setBaseMaior(leitor.nextDouble());
	System.out.print("Qual o valor da base menor do trapézio? ");
	trapezio.setBaseMenor(leitor.nextDouble());
	System.out.print("Qual o valor da altura do trapézio? ");
	trapezio.setAltura(leitor.nextDouble());
	
	trapezio.exibirDados();
	
	leitor.close();
	}
}
