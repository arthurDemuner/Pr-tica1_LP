package questoes;
import java.util.Scanner;
public class questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int tempo;
		System.out.println("Bem vindo a calculadora de combustível do Arthur");
		System.out.println("Entre com a duração da viagem em horas (h)");
		tempo = entrada.nextInt();
		int velmed;
		System.out.println("Entre com a velocidade média do veículo (KM/h)");
		velmed = entrada.nextInt();
		int eficiencia;
		System.out.println("Entre com o valor de kilometragem que o veículo é capaz de realiza com 1 L de combustível ");
		eficiencia = entrada.nextInt();
		int aux;
		aux = (tempo*velmed)/eficiencia;
		System.out.println("A quantidade de combustível a ser gasta durante a viagem é: " + aux);
	}

}
