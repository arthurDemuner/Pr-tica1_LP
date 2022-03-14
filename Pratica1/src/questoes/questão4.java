package pratica1lp;

import java.util.Random;
import java.util.Scanner;

public class questão4 {
	
	public class system {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}
	public class Ramdom {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}
	public class string {
			
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}
	}
	
public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner entrada = new Scanner(System.in);
	Scanner ler = new Scanner(System.in);
	
	long CPF,CPF2,nVoo,CPF3,nVoo3;
	String nome;
	String data;
	string voo;
	String horario;
			
	System.out.print ("Painel de controle SALVINOAIR \n");
	System.out.print ("Cadastro de passageiro\n");
	System.out.print ("Opção 1 (Exercício)\n");
	System.out.print ("Nome: ");
	nome = ler.nextLine();
	System.out.print ("CPF: (Informe apenas os números)");
	CPF = entrada.nextLong();
	System.out.print ("Data do Voo: (Informe no padrão: DIA/MÊS/ANO (4digítos para ano))");
	data = ler.nextLine();
	System.out.print ("Horario do Voo: (Informe no padrão XX:XX)");
	horario = ler.nextLine();
	
	Random random = new Random();
	int nvoo = random.nextInt(1000);
    System.out.println("Número do voo é: " + nvoo);
    
    System.out.print ("\nCadastro efetuado com sucesso:\n");
    System.out.print ("Passageiro: "+nome+"\n");
    System.out.print ("CPF: " +CPF+ "\n");
    System.out.print ("Data do Voo: " +data+ "\n");
    System.out.print ("Horário: " +horario+ "\n");
    System.out.println("Número do voo é: " + nvoo);
    
    System.out.println("\n\n______________\n");
    System.out.print ("Opção 2 (Exercício)\n");
    System.out.print ("CPF: (Informe apenas os números)");
	CPF2 = entrada.nextLong();
	System.out.print ("Número do Vôo: (Informe apenas os números)");
	nVoo = entrada.nextLong();
	System.out.println("\nCheck in relizado com sucesso, bom vôo\n");
	
	System.out.println("\n\n______________\n");
    System.out.print ("Opção 3 (Exercício)\n");
    System.out.print ("CPF: (Informe apenas os números)");
	CPF3 = entrada.nextLong();
	System.out.print ("Número do Vôo: (Informe apenas os números)");
	nVoo3 = entrada.nextLong();
	System.out.println("\nVoo Cancelado, lamentamos o ocorrido\n");
}
	
}
