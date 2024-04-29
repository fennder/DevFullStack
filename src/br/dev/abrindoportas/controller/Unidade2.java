package br.dev.abrindoportas.controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Unidade2 {
	
	public void exercicio21() {
		//DECLARAÇÃO DE CONSTANTE
		final int numeroAvaliacoes = 4;
				
		//DECLARAÇÃO DE VARIÁVEIS
		double saldoBancario = 4531.50;
		int numeroIrmaos = 3;
		String textoProva = "Teste de texto";
		boolean porta = true;
			
		//SAÍDA DE DADOS
		
		System.out.println("Valor em conta é: " + saldoBancario + "\n"
												+ "Número de irmãos: "	+ numeroIrmaos + "\n"
												+ "Texto para a prova: "	+ textoProva + "\n"
												+ "Porta aberta: "	+ porta + ". ");
	}

	public void exercicio22() {
				
		//DECLARAÇÃO DE VARIÁVEIS
		
		int matricula;
		String nome;
		String endereco;
		double nota;
		boolean sexo;
		
		//ENTRADA DE DADOS
		matricula = 202401;
		nome = "Edir Pereira";
		endereco = "Quadra 1005 Sul Alameda 13 QI 7 Lote 8 Cs 1";
		nota = 5.8;
		sexo = true;
		
		//SAÍDA DE DADOS
		System.out.println("A matrícula é: " + matricula + "\n"
											+ "Nome: "	+ nome + "\n"
											+ "Endereço: "	+ endereco + "\n"
											+ "Nota: "	+ nota + "\n"
											+ "Sexo: " + sexo + ".");
	}

	public void operadoresMatematicos() {
		double resultado1 = 5 + 8 * 3;
		double resultado2 = (5 + 8) * 3;
		double resultado3 = 5 + 9 + 7 + 8/4;
		double resultado4 = 1-4 * 3/6 - Math.pow(3, 2);
		
		if(resultado1 == resultado2) {
			System.out.println("Sgue o jogo");
		}else {
		
			System.out.println("Valores: " + resultado1 + "\n"
										+ resultado2 + "\n"
										+ resultado3 + "\n"
										+ resultado4 + ".");
		}
	}

	public void fruta() {
		// TODO Auto-generated method stub
		String fruta = "Banana";
		double valor = 6.99;
		
		System.out.println("O valor da " + fruta + " é de " + valor + ".");
		
	}
	
	public void algo2() {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = leia.next();
		
		System.out.println("O nome digitado é: " + nome);
	}

	public void alg3() {
		// TODO Auto-generated method stub
		double numero, dobro;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		numero = leia.nextDouble();
		
		dobro = numero * 2;
		
		System.out.println("O dobro de "+numero+" é " +dobro);
		
	}

	public void slide129() {
		// TODO Auto-generated method stub
		final double taxaGarcon = 0.1;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valo do jantar: ");
		double jantar = leia.nextDouble();
		double valorJantarTotal = jantar + (jantar * taxaGarcon);
		
		System.out.println("O valor do jantar é "+ valorJantarTotal + " com taxa de serviço de "+taxaGarcon);
	}

	public void slide129CalcHoras() {
		// TODO Auto-generated method stub
		double dias, horas;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número de dias: ");
		dias = leia.nextDouble();
		System.out.println("Digite o número de horas: ");
		horas = leia.nextDouble();
		
		double totalHoras = dias*24 + horas;
		
		System.out.println("O número de horas de uma viagem foi de: " + totalHoras);
	}
	
	public void slide129Entorno() {
		// TODO Auto-generated method stub
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número a ser verificado: ");
		numero = leia.nextInt();
		
		System.out.println("O número anterior é "+ (numero-1) + " de "+numero+" e o número posterior é: "+(numero+1) );
		
	}

	public void slide129Pizza() {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		double valorConta;
		int clientes;
		
		System.out.println("Digite a quantdade de clientes");
		clientes = leia.nextInt();
		System.out.println("Digite o valor da conta: ");
		valorConta = leia.nextDouble();
		
		
		System.out.println("O valor da conta foi "+ valorConta+ "são "+clientes+" a conta para cada um ficou: "+(valorConta/clientes));
		
	}

	public void slide129Desconto() {
		// TODO Auto-generated method stub
		final double desconto = 0.1;
		Scanner leia = new Scanner(System.in);
		double preco;
		final int parcela = 3;
		
		System.out.println("Digite o preço do produto: ");
		preco = leia.nextDouble();
		
		System.out.println("O valor do produto é: "+preco+" o valor a vista com desconto é:"
				+(preco-(preco*desconto))+" se aopção for dividir em "
				+ parcela+ " será de "
				+ (preco/parcela));
	}


	public void slide129Media() {
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
		System.out.println("Digite a Frequência: ");
		frequencia = leia.nextInt();

		media = (n1+n2+n3+n4)/4;
		
		System.out.println("O valor da 1ª nota é: "+ n1
				+" o valor da 2ª nota é: " + n2
				+" o valor da 3ª nota é: " + n3
				+" o valor da 4ª nota é: " + n4);
		System.out.println("Valor da média é: " + media);

		if ((media < 5) || (frequencia < 75)) {
			System.out.println("Aluno reprovado com média: " + media + " e frequência " + frequencia);
		} else {
			System.out.println("Aluno aprovado com média: " + media + " e frequência " + frequencia);
		}
		
	}
	
Scanner read = new Scanner(System.in);
	
	

	public void revendaVeiculos() {
		// TODO Auto-generated method stub
		String modelo = JOptionPane.showInputDialog("Digite o modelo do carro: ");
		double precoCarro = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do veículo:"));
		double entrada = 0.5 * precoCarro;
		double restante = entrada / 48;
		JOptionPane.showMessageDialog(null, "O modelo do veículo a venda é " + modelo
											+ ". O valor do veículo é " + precoCarro 
											+ ", valor de enrada é " + entrada 
											+ ", Com valor restante a financiar de " + restante);
		
	}

	public void lanHouse() {
		// TODO Auto-generated method stub
		final int VALOR15MINUTOS = 2;
		
		double horas, minutos, totalMinutos, totalPagar;
		
		horas = Double.parseDouble(JOptionPane.showInputDialog("Digito número de horas utilizadas"));
		minutos = Double.parseDouble(JOptionPane.showInputDialog("Digito número de minutos utilizadas"));
		
		totalMinutos = (horas * 60) + minutos;
		
		totalPagar = Math.ceil((totalMinutos/15))*VALOR15MINUTOS;
		
		JOptionPane.showMessageDialog(null, "Valor total do tempo conectado: " + totalPagar);
	}


	
}
