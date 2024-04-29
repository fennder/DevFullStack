package br.dev.abrindoportas.controller;

import java.util.Random;
import java.util.Scanner;
import java.lang.*;

import javax.swing.JOptionPane;

public class Unidade3 {
	Scanner read = new Scanner(System.in);
	
	
	public void Media() {
		// TODO Auto-generated method stub
		double n1, n2, n3, n4, media;
		int frequencia;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a 1ª nota: ");
		n1 = leia.nextDouble();
		System.out.println("Digite a 2ª nota: ");
		n2 = leia.nextDouble();
		System.out.println("Digite a 3ª nota: ");
		n3 = leia.nextDouble();
		System.out.println("Digite a 4ª nota: ");
		n4 = leia.nextDouble();
		// System.out.println("Digite a Frequência: ");
		// frequencia = leia.nextInt();

		media = (n1+n2+n3+n4)/4;
		
		System.out.println("O valorProduto da 1ª nota é: "+ n1
				+" o valorProduto da 2ª nota é: " + n2
				+" o valorProduto da 3ª nota é: " + n3
				+" o valorProduto da 4ª nota é: " + n4);
		System.out.println("Valor da média é: " + media);

		if (media >= 7) {
			// System.out.println("Aluno aprovado com média: " + media + " e frequência " + frequencia);
			System.out.println("Aluno aprovado com média: " + media);
			Media();
		}else if (media >= 5) {
			// System.out.println("Aluno aprovado em recuperação com média: " + media + " e frequência " + frequencia);
			System.out.println("Aluno aprovado em recuperação com média: " + media);
			Media();
		} else if (media < 5) {
			// System.out.println("Aluno reprovado com média: " + media + " e frequência " + frequencia);
			System.out.println("Aluno reprovado com média: " + media);
			Media();
		}
	}

	public void sile25Numero() {
		// TODO Auto-generated method stub
		System.out.println("Digite o número: ");
		int numero = read.nextInt();
		
		if(numero%2 == 0) {
			System.out.println("Este número é par: " + numero);
		}else {
			System.out.println("Este número é impar: " + numero);
		}
	}

	public void condicao() {
		// TODO Auto-generated method stub
		boolean valorProduto = true;
		Random nu = new Random();
		
		while(valorProduto == true) {
			int numero = nu.nextInt(9)+1;
			if (numero < 4) {
				System.out.println("Número menor que " + numero);
				valorProduto = false;
			}else if(numero > 4){
				System.out.println("Número maior que " + numero);
				valorProduto = false;
			}else if(numero == 4) {
				System.out.println("Número igual a " + numero);
				valorProduto = true;		
			}
		}	
	}

	public void equacao() {
		// TODO Auto-generated method stub
		int a, b, c;
		double delta, x1, x2;
		
		System.out.println("Digite o valorProduto de a: ");
		a = read.nextInt();
		System.out.println("Digite o valorProduto de b: ");
		b = read.nextInt();
		System.out.println("Digite o valorProduto de c: ");
		c = read.nextInt();
		
		delta = b*b-4*a*c;
		
		if(delta >= 0) {
			x1 = (-b - (Math.sqrt(delta)))/2*a;
			x2 = (-b + (Math.sqrt(delta)))/2*a;
			
			System.out.println("O valorProduto de X1 é: " + x1 + " e o valorProduto de X2 é: " + x2);
		}else{
			System.out.println("Não existe delta");
		}
	}

	public void raizExata() {
		// TODO Auto-generated method stub
		int numero;
		double raizExata, maiorValor;
		
		System.out.println("Digite o valorProduto de Número: ");
		numero = read.nextInt();

		raizExata = Math.sqrt(numero);
		maiorValor = Math.round(raizExata);
		
		if(raizExata == maiorValor) {
			System.out.println("Existe raiz exata para o número: " + numero);
		}else{
			System.out.println("Não existe raiz exata para o número: " + numero);
		}
		
	}

	public void pesoIdela() {
		// TODO Auto-generated method stub
		double altura,pesoIdealHomem, pesoIdealMulher;
		String sexo;

		System.out.println("Digite a altura: ");
		altura = read.nextDouble();
		System.out.println("Digite o sexo exemplo 'M or F': ");
		sexo = read.next();

		if(sexo.equalsIgnoreCase("M")){
			pesoIdealHomem = (altura*72.7)-58;
			System.out.println("O peso ideal do homem é: " + pesoIdealHomem);
		}else{
			pesoIdealMulher = (altura*62.1)-44.7;
			System.out.println("O peso ideal da mulher é: " + pesoIdealMulher);
		}
	}

	public void triangulo() {
		// TODO Auto-generated method stub
		int a,b,c;


		System.out.println("Digite primeiro lado do triangulo: ");
		a = read.nextInt();
		System.out.println("Digite segundo lado do triangulo: ");
		b = read.nextInt();
		System.out.println("Digite tereceiro lado do triangulo: ");
		c = read.nextInt();

		if ((a<b+c) && (b<a+c) && (c<a+b)) {
			// System.out.println("Este é um triângulo!");
			triangulo();
			if((a==b)&&(b==c)){
				System.out.println("Triângulo Equilátero!");
				triangulo();
			}else if ((a==b)||(b==c)) {
				System.out.println("Triângulo Escaleno!");
				triangulo();
			}

		}else{
			System.out.println("Os lados informados não formam um triângulo");
			triangulo();
		}

	}

	public void caixaEletronico() {
		// TODO Auto-generated method stub
		double notas100, notas50, notas10;
		int resto, saque;
		System.out.println("Informe o valorProduto do Saque: ");
		saque = read.nextInt();

		if (saque%10 == 0) {
			notas100 = Math.floor(saque/100);
			resto = saque % 100;
			notas50 = Math.floor(resto/50);
			resto = resto % 50;
			notas10 = Math.floor(resto/10);
			// resto = resto % 10;

			if (notas100 > 0) {
				System.out.println("O número de notas de cem= " + notas100);
			}
			if(notas50 > 0){
				System.out.println("O número de notas de cinquenta= " + notas50);
			}
			if(notas10 > 0){
				System.out.println("O número de notas de dez= " + notas10);
				caixaEletronico();
			}
		}else{
			System.out.println("O valorProduto do saque está incorreto. ");
			caixaEletronico();
		}

	}

  public void switchCase() {
    // TODO Auto-generated method stub
		int opcao;

		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Um: ");
		System.out.println("2 - Dois: ");
		System.out.println("3 - Três: ");
		System.out.println("4 - Quadtro: ");
		System.out.println("0 - Sair: ");
		opcao = read.nextInt();
		
		switch (opcao) {
			case 1:
				System.out.println("Retorno " + opcao);
				break;
			case 2:
				System.out.println("Retorno " + opcao);
				
				break;
			case 3:
				System.out.println("Retorno " + opcao);
				
				break;
			case 4:
					System.out.println("Retorno " + opcao);
					
				break;
			default:
				System.out.println("Saindo " + opcao);
				break;
		}
  }

	public void moeda() {
		// TODO Auto-generated method stub
		double valor, conversao;

		int tipoMoeda;
		System.out.println("Digite o valor em Real para conversão: ");
		valor = read.nextInt();

		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Libra: ");
		System.out.println("2 - Dollar: ");
		System.out.println("3 - Euro: ");
		System.out.println("0 - Sair: ");
		tipoMoeda = read.nextInt();

		switch (tipoMoeda) {
			case 1:
				conversao = valor/6;
				System.out.println("O valorProduto $" + valor + " convertido em Libra é: R$" + conversao);
				break;
			case 2:
			conversao = valor/5;
				System.out.println("O valorProduto $" + valor + " convertido em Libra é: R$" + conversao);
				break;
			case 3:
			conversao = valor/5.5;
				System.out.println("O valorProduto $" + valor + " convertido em Libra é: R$" + conversao);
				break;
			default:
				System.out.println("Valor incorreto");
				break;
		}
	}

	public void pagamento() {
		// TODO Auto-generated method stub
		double valorProduto, valorFinalProduto;

		int codigo;
		System.out.println("Digite o valorProduto do Produto: ");
		valorProduto = read.nextInt();

		System.out.println("Escolha uma forma de pagamento: ");
		System.out.println("1 - À vista em dinhero ou cheque, recebe 10% de desconto: ");
		System.out.println("2 - À vista no cartão de crédito, recebe 5% de desconto: ");
		System.out.println("3 - Em 2 vezes sem juros: ");
		System.out.println("4 - Em 3 vexvezes com juros de 10%: ");
		System.out.println("0 - Sair: ");
		codigo = read.nextInt();

		switch (codigo) {
			case 1:
				valorFinalProduto = valorProduto * 0.1;
				System.out.println("O valor do Produto $" + valorProduto + " sera de 10% : R$" + valorFinalProduto);
				break;
			case 2:
				valorFinalProduto = valorProduto * 0.95;
				System.out.println("O valor do Produto $" + valorProduto + " será de 5%: R$" + valorFinalProduto);
				break;
			case 3:
				valorFinalProduto = valorProduto * 1;
				System.out.println("O valor do Produto $" + valorProduto + " será de 2x sem juros: R$" + valorFinalProduto);
				break;
			case 4:
				valorFinalProduto = valorProduto * 1.10;
				System.out.println("O valor do Produto $" + valorProduto + " será de 3x com juros: R$" + valorFinalProduto);
				break;
			default:
				System.out.println("Valor incorreto");
				pagamento();
				break;
		}
	}

	public void switchExpression() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		double valor, conversao;
		int tipoMoeda;
		
		valor = Double.parseDouble((JOptionPane.showInputDialog("Digite o valor em Real para conversão: ")));

		tipoMoeda = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: [1 - Libra:]" + "[2 - Dollar:]" + "[3 - Euro:]" + "[0 - Sair:]"));
	
		JOptionPane.showMessageDialog(null, switch(tipoMoeda)
		{
			case 1 -> "O valorProduto R$" + valor + " convertido em Libra é: $" + (valor/6);
			case 2 -> "O valorProduto R$" + valor + " convertido em Libra é: $" + (valor/5);
			case 3 -> "O valorProduto R$" + valor + " convertido em Libra é: $" + (valor/5.3);
			default -> "Digite uma moeda ocrreta";
			
		});
	}	
}
