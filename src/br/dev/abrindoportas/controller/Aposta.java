package br.dev.abrindoportas.controller;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Aposta {

    Scanner read = new Scanner(System.in);

  public void lotoFacil(){
    int qnum, volante;

    System.out.println("Digite a quantidade de números: ");
    qnum = read.nextInt();

    int[] numeros = new int[qnum];
    Random random = new Random();

    for (int i = 0; i < numeros.length; i++) {
        int novoNumero;
        boolean repetido;

        do {
            repetido = false;
            novoNumero = random.nextInt(24)+1; // Gera números entre 0 e 99

            // Verifica se o novo número já está presente no vetor
            for (int j = 0; j < i; j++) {
                if (numeros[j] == novoNumero) {
                    repetido = true;
                    break;
                }
            }
        } while (repetido);

        numeros[i] = novoNumero;
    }

    Arrays.sort(numeros);

    System.out.println("Números não repetidos gerados:");
    for (int numero : numeros) {
        System.out.print(numero + " | ");
    }
    System.out.println();
  }
}


