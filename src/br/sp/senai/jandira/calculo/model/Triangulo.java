package br.sp.senai.jandira.calculo.model;

public class Triangulo {
	private double base;
	private double altura;
	
	public void setBase (double base) {
		this.base = base;
	}
		
	public double getBase() {
		return base;
	}
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double calcularArea() {
		double area = (base * altura) / 2;
		return area;
	}
	
	public void exibirDados() {
		double area = calcularArea();
		System.out.println("Triangulo");
		System.out.printf("Area: %s\n", area);
		System.out.println("=========================");
	}
	

	
}
