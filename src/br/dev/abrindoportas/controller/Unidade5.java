package br.dev.abrindoportas.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Unidade5 {
  Scanner read = new Scanner(System.in);
  Random random = new Random();
  
  public void vetor() {
    String[] nomesVetor = new String[5];

    for(int i=0;i < nomesVetor.length; i++){
      System.out.println("Digite na posição " + i +"º o nome: ");
      nomesVetor[i] = read.next();
    }
    
    Arrays.sort(nomesVetor);
    System.out.println();
    System.out.println("Nomes Digitados são: ");
    for(int i=0;i < nomesVetor.length; i++){
      System.out.print(nomesVetor[i] + " | ");
    }
    System.out.println();
  }
  
  public void matriz(){
    String[][] nomesMatriz = new String[2][2];

    for(int i = 0;i < nomesMatriz.length;i++){
      for(int j = 0;j < nomesMatriz.length;j++){
        System.out.println("Digite na posição " + i + j +"º o nome: ");
        nomesMatriz[i][j] = read.next();
      }
    }
    
    // Arrays.sort(nomesMatriz);

    System.out.println();
    System.out.println("Nomes digitados são: ");
    for(int i = 0;i < nomesMatriz.length;i++){
      for(int j = 0;j < nomesMatriz.length;j++){
        System.out.print(nomesMatriz[i][j] + " | ");
      }
    }
  }

  public void calculaVetor() {

    int i;
    double[] A = new double[5];
    double[] B = new double[5];

    for(i = 0; i < A.length;i++){
      System.out.println("Informar o valor de A[" + i + "]");
      A[i] = read.nextDouble();

      if (i%2==0) {
        B[i] = 2*A[i];
      }else{
        B[i] = A[i]/2;
      }
    }

    for(double valor : A){
      System.out.print("A = " + valor);
    }
    System.out.println();
    for (double valor : B) {
      System.out.print("B = " + valor);
    }
  }

  public void writeFile() throws IOException{
    String[] nomes = {"Edir", "Vicente", "Karla"};
    String[] telefones = {"98406-7817", "98406-7818", "98406-7819"};
    String[] cidades = {"Brasília", "Palmas", "Araguatins"};

    FileWriter file = new FileWriter("contatos.txt");
    PrintWriter salvaFile = new PrintWriter(file);
    salvaFile.println("==========================================");

    salvaFile.println("Nomes || Telefones || Cidades");
    for(int i=0; i < nomes.length; i++){
      salvaFile.println("========================================");
      salvaFile.print(nomes[i] + " || ");
      salvaFile.print(telefones[i] + " || ");
      salvaFile.println(cidades[i]);
    }
    salvaFile.println("==========================================");
    file.close();
    salvaFile.close();
  }

  public void matrizIdentidade() throws IOException {
    int i, j;
    int I[][] = new int[10][10];

    //Impressão da matriz em arquivos
    FileWriter file = new FileWriter("matriz.txt");
    PrintWriter salvaFile = new PrintWriter(file);

    for (i = 0; i < I.length; i++) {
      for (j = 0; j < I.length; j++) {
        if (i == j) {
          I[i][j] = 1;
        }else{
          I[i][j] = 0;        
        }
      }
    }

    for (i = 0; i < I.length; i++) {
      for (j = 0; j < I.length; j++) {
        salvaFile.print(I[i][j] + " | ");
      }
      salvaFile.println();
    }
    file.close();
    salvaFile.close();

  }
}