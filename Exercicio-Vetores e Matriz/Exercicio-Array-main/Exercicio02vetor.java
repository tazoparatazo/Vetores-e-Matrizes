package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio02vetor {
/*Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
*/
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] vetor = new int[6];
		int impar=0;
		int somaPar=0;
		
	
		
		for(int i = 0 ; i<6 ; i++) {
			System.out.println("Digite os numeros: ");
			vetor[i] = leia.nextInt();
		
		if(vetor[i] % 2 == 0) {
			somaPar += vetor[i];
		}
		else if (vetor[i] % 2 == 1) {
			impar++;
		}
		}
		for(int i = 0 ; i<6 ; i++) {
			if(vetor[i] % 2 == 0) {
		System.out.println("\nValor par: " + vetor[i]);	
		}
		}
		for(int i = 0 ; i<6 ; i++) {
			if(vetor[i] % 2 == 1) {
		System.out.println("\nValor impar: " + vetor[i]);
		}
		}
		System.out.println("Quantidade de numeros impares digitados: " + impar);
		System.out.println("A soma de numeros pares � de: " + somaPar);
	
		}
	}
