package br.sp.senai.jandira.calculo.model;

public class Trapezio {
	private double baseMaior;
	private double baseMenor;
	private double altura;
	
	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}
	public double getBaseMaior(double baseMaior) {
		return baseMaior;
	}
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	public double getBaseMenor(double baseMenor) {
		return baseMenor;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura(double altura) {
		return altura;
	}
	
	public double calcularArea() {
		double area = (baseMaior * baseMenor) * altura / 2;
		return area;
	}
	
	public void exibirDados() {
		double area = calcularArea();
		System.out.println("Trapezio");
		System.out.printf("Area: %s\n", area);
		System.out.println("=========================");
	}
}
