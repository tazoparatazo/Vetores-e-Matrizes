package br.com.generation.exercicios;

public class Exercicio01vetor {
	/*
	 * Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros
	 * inteiros. O programa deve executar os seguintes passos: (a) Atribua os
	 * seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. (b) Armazene em uma
	 * vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e
	 * A[5] do vetor e mostre na tela esta soma. (c) Modifique o vetor na posi��o 4,
	 * atribuindo a esta posi��o o valor 100. (d) Mostre na tela cada valor do vetor
	 * A, um em cada linha.
	 */
	public static void main(String[] args) {

		int soma = 0;
		int[] aVetor = new int[6];
		for (int i = 0; i < 6; i++) {

			aVetor[0] = 1;
			aVetor[1] = 0;
			aVetor[2] = 5;
			aVetor[3] = -2;
			aVetor[4] = -5;
			aVetor[5] = 7;

			System.out.println("O vetor " + i + " - " + aVetor[i]);

			soma = 0;
			aVetor[4] = 100;
		 }
		soma = aVetor[0] + aVetor[1] + aVetor[5];
		System.out.println("\nA soma dos vetores [0][1][5] �: " + soma);
		System.out.println("\nO valor do vetor 4 agora �: " + aVetor[4]);
		for (int i = 0; i < 6; i++) {

			aVetor[0] = 1;
			aVetor[1] = 0;
			aVetor[2] = 5;
			aVetor[3] = -2;
			aVetor[4] = 100;
			aVetor[5] = 7;

			System.out.println("O vetor " + i + " - " + aVetor[i]);
		}
	}
}
