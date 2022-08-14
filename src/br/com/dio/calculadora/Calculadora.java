package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		int a, b, i = 3;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segungo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a, b);
		int subtracao = subtracao(a, b);
		int divisao = divisao(a, b);
		int multiplicacao = multiplicacao(a, b);
		
		System.out.println("Soma=" + soma);
		System.out.println("Subtracao=" + subtracao);
		System.out.println("Divisao=" + divisao);
		System.out.println("Multiplicacao=" + multiplicacao);

		int result = 10 - 5 * 2 + --i;

		System.out.println("Result=" + result);		
		
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static int divisao(int a, int b) {
		return a / b;
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	

}
