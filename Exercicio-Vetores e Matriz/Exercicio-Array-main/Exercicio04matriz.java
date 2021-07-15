package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio04matriz {
/*Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada.
 Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado 
 na própria matriz.
*/
	public static void main(String[] args) {
	
		Scanner leia =new Scanner(System.in);
		
		double[][] matrizUm = new double[2][2];
		double[][] matrizDois = new double[2][2];
		double[][] matrizX = new double [2][2];
		double soma=0.0, subtracao=0.0, constante=0.0 , imprimir=0.0;
		int usuario = 0;
		
		for (int l = 0; l < matrizUm.length; l++) {
			for (int c = 0; c < matrizUm[(int) l].length; c++) {
				System.out.printf("\nDigite os numeros da primeira matriz: [%d] [%d]", l, c); //
			     matrizUm[l][c] = leia.nextDouble();
	}

}
		for (int l = 0; l < matrizDois.length; l++) {
			for (int c = 0; c < matrizDois[(int) l].length; c++) {
				System.out.printf("\nDigite os numeros da segunda matriz: [%d] [%d]", l, c); //
			     matrizDois[l][c] = leia.nextDouble();
			}
		}
		System.out.println("Digite 1 para somar as duas matrizes \r\n"
				+ "Digite 2 para subtrair a primeira matriz da segunda \r\n"
				+ "Digite 3 para adicionar uma constante as duas matrizes\r\n"
				+ "Digite 4 para imprimir as matrizes ");
		usuario = leia.nextInt();
		
		       
		if (usuario == 1) {
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					matrizX[l][c] = matrizUm[l][c] + matrizDois[l][c]; 
					System.out.println(" A soma das duas matrizes será de: " +matrizX[l][c]);
				}
			}
		}
		if(usuario == 2) {
			for(int l= 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					matrizX[l][c] = matrizDois[l][c] - matrizUm[l][c] ; 
					System.out.println(" A subtração das duas matrizes será de: " + matrizX[l][c]);
				}
			}
		}
		if(usuario ==3) {
			System.out.println("Digite uma constante: ");
			constante = leia.nextDouble();
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					matrizUm[l][c] = matrizUm[l][c] + constante;
					 matrizDois[l][c] =  matrizDois[l][c] + constante;
					 System.out.println("\nA soma da primeira matriz com a costante é será de: " + matrizUm[l][c]);
					 System.out.println("\nA soma da segunda matriz com a costante é será de: \" : " + matrizDois[l][c]);
		}
	}
}
		if(usuario == 4) {
			System.out.println("A matriz um:");
			for(int l= 0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.println(matrizUm[l][c]);
				}
					}
					System.out.println("A matriz dois:");
					for(int l= 0; l < 2; l++) {
						for (int c = 0; c < 2; c++){
						System.out.println(matrizDois[l][c]);
				}
			}
		}
	}
}