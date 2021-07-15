package br.com.generation.exercicios;

import java.util.Scanner;

/*- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
public class Exercicio03matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double[][] matriz = new double[3][3];
		double valores = 0.0;
		
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[(int) l].length; c++) {
				System.out.printf("\nDigite os numeros: [%d] [%d]", l, c); //
			     matriz[l][c] = entrada.nextDouble();
			     
			     if(matriz[l][c] > 10) {
						valores++;	
			}
		}	
	}
		System.out.println("\nVocê digitou " + valores + " acima de 10");
	}
}
