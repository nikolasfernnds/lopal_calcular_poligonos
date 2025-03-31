package br.sp.senai.jandira.calculo.model;

public class Quadrado {
	private double lado;
	private double perimetro;
	
	public void setLado (double lado) {
		this.lado = lado;
	}
		
	public double getLado() {
		return lado;
	}
	
	
	public void setPerimetro (double perimetro) {
		this.perimetro = perimetro;
	}
	
	public double getPerimetro() {
		return perimetro;
	}
	public double calcularArea() {
		double area = lado * lado;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 2 * ( lado + lado );
		return perimetro;
	}
	
	public void exibirDados() {
		double area = calcularArea();
		double perimetro = calcularPerimetro();
		System.out.println("Quadrado");
		System.out.printf("Area: %s\n", area);
		System.out.printf("Perimetro: %s\n", perimetro);
		System.out.println("=========================");
	}

}
