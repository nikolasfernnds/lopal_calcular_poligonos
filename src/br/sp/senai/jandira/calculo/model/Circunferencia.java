package br.sp.senai.jandira.calculo.model;

public class Circunferencia {
	private double raio;
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getRaio(double raio) {
		return raio;
	}
	
	public double calcularArea() {
		double area = Math.PI * (raio * raio);
		return area;
	}
	
	public void exibirDados() {
		double area = calcularArea();
		System.out.println("Circunferencia");
		System.out.printf("Area: %s\n", area);
		System.out.println("=========================");
	}
}
