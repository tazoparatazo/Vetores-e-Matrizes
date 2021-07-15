package br.com.generation.exercicios;

public class Exercicio01vetor {
	/*
	 * Faça um programa que possua um vetor denominado A que armazene 6 números
	 * inteiros. O programa deve executar os seguintes passos: (a) Atribua os
	 * seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. (b) Armazene em uma
	 * variável inteira (simples) a soma entre os valores das posições A[0], A[1] e
	 * A[5] do vetor e mostre na tela esta soma. (c) Modifique o vetor na posição 4,
	 * atribuindo a esta posição o valor 100. (d) Mostre na tela cada valor do vetor
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
		System.out.println("\nA soma dos vetores [0][1][5] é: " + soma);
		System.out.println("\nO valor do vetor 4 agora é: " + aVetor[4]);
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
