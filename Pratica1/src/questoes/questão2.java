package pratica1lp;

import java.util.Scanner;

public class quest�o2 {
	
	public class string {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Scanner ler = new Scanner(System.in);
		
		int ano, velho, seminovo;
		String placa;
		
		System.out.print ("Bem vindo ao sistema do Arthur, informe o ano do seu ve�culo: \n"); // ler o ano do ve�culo
		ano = input.nextInt(); // recebe o valor o ano do ve�culo
		velho = (2022-ano); //calcula o tempo de idade do ve�culo
		seminovo = (2022-ano); //Calcula a "idade do ve�culo"
		
		if(ano<=2010) //identifica em que faixa o ve�culo se encontra
			System.out.print("Seu ve�culo � velho, ele possui " + velho + " anos");
			else if (ano <=2021)
			System.out.print("Seu ve�culo � semi novo, ele possui " + seminovo + " anos");
			else if (ano >= 2022)
			System.out.print("Seu ve�uclo � novo.");
		
		System.out.print ("\n\nInforme a placa do seu ve�culo por gentileza: \n"); //recebe a placa do ve�uculo
		placa = ler.nextLine();
		
			placa = placa.replace('a','*'); //Substitui a vogal da placa por *
			placa = placa.replace('e','*'); //Substitui a vogal da placa por *
			placa = placa.replace('i','*'); //Substitui a vogal da placa por *
			placa = placa.replace('o','*'); //Substitui a vogal da placa por *
			placa = placa.replace('u','*'); //Substitui a vogal da placa por *
			placa = placa.replace('A','*'); //Substitui a vogal da placa por *
			placa = placa.replace('E','*'); //Substitui a vogal da placa por *
			placa = placa.replace('I','*'); //Substitui a vogal da placa por *
			placa = placa.replace('O','*'); //Substitui a vogal da placa por *
			placa = placa.replace('U','*'); //Substitui a vogal da placa por *
		
			
					
			System.out.print("A placa do seu ve�uculo �: " +placa); // Mostra a placa sem volgais.
		
	}

}
