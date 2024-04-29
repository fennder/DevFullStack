package br.dev.abrindoportas.controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Unidade4 {
  Scanner read = new Scanner(System.in);
  int numero;
  public void paraTabuada() {
    // TODO Auto-generated method stub
    int numero, j, i, aux;

    System.out.println("Digite o número para a tabuada: ");
    numero = read.nextInt();

    for(i=1;i<=10;i++){
      aux = i * numero;
      System.out.print(aux + " | ");
    }

    // System.out.println();
    // System.out.println();
    
    // for(i=0;i<=10;i++){
    //   for(j=0;j<=10;j++){
    //     aux = i * j;
    //     if (aux < 10) {
    //       System.out.print(" | 00" + aux);
    //     }else if(aux < 100){
    //       System.out.print(" | 0" + aux);
    //     }else{
    //       System.out.print(" | " + aux);
    //     }
    //   }
    //   System.out.println();    
    // }
  }

  public void Media() {
		// TODO Auto-generated method stub
    final int AVALIACOES = 4;
		double n1, n2, n3, n4, media, media50aluno = 0;
    int i;
		
    for(i =1; i<5; i++){
      System.out.println("Digite a 1ª nota: ");
      n1 = read.nextDouble();
      System.out.println("Digite a 2ª nota: ");
      n2 = read.nextDouble();
      System.out.println("Digite a 3ª nota: ");
      n3 = read.nextDouble();
      System.out.println("Digite a 4ª nota: ");
      n4 = read.nextDouble();
      media = (n1+n2+n3+n4)/AVALIACOES;

      media50aluno = media50aluno + media;
      System.out.println("O valor da 1ª nota é: "+ n1
      +" o valor da 2ª nota é: " + n2
      +" o valor da 3ª nota é: " + n3
      +" o valor da 4ª nota é: " + n4);
      System.out.println("Valor da média é: " + media);
    }
    media50aluno = media50aluno/i;
    System.out.println("Valor da média da turma é : " + media50aluno);

  }

  public void menorMaior() {
    // TODO Auto-generated method stub
    int numero, menor, maior, i;
    boolean condicao = true;

    menor = numero = 5;
    maior = numero = 5;

    for(i = 0; i<5;i++){
      System.out.println("Digite o numero: ");
      numero = read.nextInt();

      if (numero < menor) {
        menor = numero;
      }else if (numero > maior) {
        maior = numero;       
      }
      System.out.println("O menor é: " + menor + "e o maior é: " + maior + " Verdade " + condicao);
    }
    System.out.println("Fim do Para");
  }

  public void sequenciaS() {
		int i;

		System.out.println("Digite um número: ");
		numero = read.nextInt();
		
		for(i = 1; i <= 10000; i++) {
			if(i == 9) {
				System.out.println(" O número na posição "+ i + " é " + numero);
			}else if(i == 10) {
				System.out.println(" O número na posição "+ i + " é " + numero);
			}else if(i == 100) {
				System.out.println(" O número na posição "+ i + " é " + numero);
			}else if(i == 10000) {
				System.out.println(" O número na posição "+ i + " é " + numero);
			}else {
				numero = numero + 3;
			}
		}
	}
}
