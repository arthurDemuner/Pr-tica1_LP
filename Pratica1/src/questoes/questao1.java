package questoes;
import java.util.Scanner;
public class questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int tempo;
		System.out.println("Bem vindo a calculadora de combust�vel do Arthur");
		System.out.println("Entre com a dura��o da viagem em horas (h)");
		tempo = entrada.nextInt();
		int velmed;
		System.out.println("Entre com a velocidade m�dia do ve�culo (KM/h)");
		velmed = entrada.nextInt();
		int eficiencia;
		System.out.println("Entre com o valor de kilometragem que o ve�culo � capaz de realiza com 1 L de combust�vel ");
		eficiencia = entrada.nextInt();
		int aux;
		aux = (tempo*velmed)/eficiencia;
		System.out.println("A quantidade de combust�vel a ser gasta durante a viagem �: " + aux);
	}

}
