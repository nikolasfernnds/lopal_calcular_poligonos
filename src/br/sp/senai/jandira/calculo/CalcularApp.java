package br.sp.senai.jandira.calculo;

import br.sp.senai.jandira.calculo.model.Circunferencia;
import br.sp.senai.jandira.calculo.model.Quadrado;
import br.sp.senai.jandira.calculo.model.Retangulo;
import br.sp.senai.jandira.calculo.model.Trapezio;
import br.sp.senai.jandira.calculo.model.Triangulo;

public class CalcularApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Retangulo r1  = new Retangulo();
		System.out.println(r1);
		Quadrado q1 = new Quadrado();
		System.out.println(q1);
		Triangulo t1 = new Triangulo();
		System.out.println(t1);
		Circunferencia c1 = new Circunferencia();
		System.out.println(c1);
		Trapezio tpz = new Trapezio ();
		System.out.println(tpz);
		
		r1.setAltura(10);
		r1.setBase(50);
		r1.exibirDados();
		
		q1.setAltura(10);
		q1.setBase(10);
		q1.exibirDados();
		
		t1.setAltura(3);
		t1.setBase(8);
		t1.exibirDados();
		
		c1.setRaio(5);
		c1.exibirDados();
		
		tpz.setAltura(3);
		tpz.setBaseMaior(5);
		tpz.setBaseMenor(4);
		tpz.exibirDados();
	}

}
