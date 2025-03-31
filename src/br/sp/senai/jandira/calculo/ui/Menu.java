package br.sp.senai.jandira.calculo.ui;

import java.util.Scanner;

import br.sp.senai.jandira.calculo.model.CalculoDePoligonos;
import br.sp.senai.jandira.calculo.repository.CircunferenciaRepository;
import br.sp.senai.jandira.calculo.repository.QuadradoRepository;
import br.sp.senai.jandira.calculo.repository.RetanguloRepository;
import br.sp.senai.jandira.calculo.repository.TrapezioRepository;
import br.sp.senai.jandira.calculo.repository.TrianguloRepository;


public class Menu {
	public static void criarMenu() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("====================");
		System.out.println("Calculadora de Poligonos");
		System.out.println("====================");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retângulo");
		System.out.println("3 - Circunferência");
		System.out.println("4 - Trapézio");
		System.out.println("5 - Triangulo");
		System.out.println("6 - Sair");
		System.out.println("====================");
		System.out.println("Escolha uma opção (1 - 6)");
		
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			QuadradoRepository quadradoRepository = new QuadradoRepository();
			quadradoRepository.criarQuadrado();
		}else if (opcao == 2) {
			RetanguloRepository retanguloRepository = new RetanguloRepository();
			retanguloRepository.criarRetangulo();
		}else if (opcao == 3){
			CircunferenciaRepository circunferenciaRepository = new CircunferenciaRepository();
			circunferenciaRepository.criarCircunferencia();
			
		}else if (opcao == 4){
			TrapezioRepository trapezioRepository = new TrapezioRepository();
			trapezioRepository.criarTrapezio();
			
		}else if (opcao == 5){
			TrianguloRepository trianguloRepository = new TrianguloRepository();
			trianguloRepository.criarTriangulo();
			
		}else if (opcao == 6){
			System.out.println("Tem certeza que deseja sair? (S/N) ");
			String escolha = leitor.next();
			
			if (escolha.equalsIgnoreCase("s")) {
				System.out.println();
				System.out.println("Encerrando o sistema. Bye!");
				System.out.println();
				System.exit(0);
		    }else if (escolha.equalsIgnoreCase("n")) {
		    	criarMenu();
		    }else {
		    	System.out.println();
		    	System.out.println("Você deve escolher somente \"S\" ou \"N\"!");
		    }
			
		}
	}
}
