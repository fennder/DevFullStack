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

  public void fibonnacci() {
    // TODO Auto-generated method stub
    float s, s1, s2, s9, s10, s100, s10000, i;

    s1 = 1;
    s2 = 1;
    for(i=3;i<=10000;i++){
        s =s1+s2;
        s1 = s2;
        s2 = s;
   
        if(i == 9) {
          s9 = s;
          
        }else if(i == 10) {
          s10 = s;
          System.out.println(s10);
        }else if(i == 100) {
          s100 = s;
          System.out.println(s100);
        }else if(i == 10000) {
          s10000 = s;
          System.out.println(s10000);
        }else {
          numero = numero + 3;
          System.out.println(numero);
        }
    }
  }

  public void calculeE() {
    
    double x, e = 0;
    int i;

    System.err.println("Favor infrmar o valor de X: ");
    x = read.nextInt();

    for(i = 0; i <= 50; i++){
      e = e + Math.pow(x, i)/i;
      System.out.println("O valor de E^ " + " = " + e);
    }
  }

  public void enquantoMedia() {
    
    int valor;
    String nome, endereco, telefone;
    int matricula, cont;

    System.out.println("Informe o valor: ");
    valor = read.nextInt();
    
    float soma_valor = 0;
    cont = 0;
    

    while (valor != -1) {
      soma_valor = soma_valor + 1;
      cont++;

      System.out.println("Informe o valor: ");
      valor = read.nextInt();
    }
    System.out.println("Média é gual: " + soma_valor/cont);

    System.out.println("Pr favor, digite a matrícula: ");
    matricula = read.nextInt();
    
    //Ler aluno
    while (matricula != 0) {
      soma_valor = soma_valor + 1;
      cont++;

      System.out.println("Informe o Nome: ");
      nome = read.next();
      System.out.println("Informe o Endereço: ");
      endereco = read.next();
      System.out.println("Informe o Telefone: ");
      telefone = read.next();
      cont++;

      System.out.println("Pr favor, digite a matrícula: ");
      matricula = read.nextInt();
    }
  }

  public void fatorial() {
    double fatorial = 1;
    int numero, i;

    System.out.println("Informe o número: ");
    numero = read.nextInt();

    i = numero;
    while (i > 1) {
      fatorial = fatorial * numero;
      i--;
    }
    System.out.println("O fatorial do número: " + numero + " = " + fatorial);

  }

  public void impostoRenda() {

    String nome, cpf;
    int numeroDependentes, i=0;
    double redimentoMensal, salarioLiquido, irpf;

    while (i < 10) {
      System.out.println("Digite o nome: ");
      nome = read.next();
      System.out.println("Digite o CPF: ");
      cpf = read.next();
      System.out.println("Digite o número de dependentes: ");
      numeroDependentes = read.nextInt();
      System.out.println("Digite a Renda MEnsal: ");
      redimentoMensal = read.nextDouble();

      salarioLiquido = redimentoMensal - (numeroDependentes * 189.59) - 0.11 * redimentoMensal;
      System.out.println(salarioLiquido);
      if (salarioLiquido <= 1903.98) {
        irpf = 0;
        System.out.println("Contribuinte " + nome + " é isento!");
      }else if ((salarioLiquido >= 1903.99) && (salarioLiquido <= 2826.65)) {
        irpf = 0.075 * salarioLiquido - 142.80;
        System.out.println("O IRPF do contribuinte " + nome + " é " + irpf);
      }else if ((salarioLiquido >= 2826.66) && (salarioLiquido <= 3751.05)) {
        irpf = 0.15 * salarioLiquido - 354.80;
        System.out.println("O IRPF do contribuinte " + nome + " é " + irpf);
      }else if ((salarioLiquido >= 3751.06) && (salarioLiquido <= 4664.68)) {
        irpf = 0.225 * salarioLiquido - 636.13;
        System.out.println("O IRPF do contribuinte " + nome + " é " + irpf);        
      }else if ((salarioLiquido >= 4664.69)) {
        irpf = 0.275 * salarioLiquido - 869.36;
        System.out.println("O IRPF do contribuinte " + nome + " é " + irpf);
      }
      i++;
    }
  }
}
