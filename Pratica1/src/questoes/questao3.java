package questoes;
import java.util.Scanner;
public class questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String frase,frasea,frasee,frasei,fraseo,fraseu;
		System.out.println("Bem vindo ao contador de vogais do Arthur");
		System.out.println("Entre com a frase que você deseja saber a quantidade de vogais (Sem Repetição)");
		frase = entrada.nextLine();
		int cont,conta,conte,conti,conto,contu;
		cont=frase.length();//calcula o tamanho da frase digitada pelo usuário;
		
		frasea = frase.replace("a","");
		frasee = frase.replace("e","");
		frasei = frase.replace("i","");
		fraseo = frase.replace("o","");
		fraseu = frase.replace("u","");
		
		
		conta=frasea.length();
		conte=frasee.length();
		conti=frasei.length();
		conto=fraseo.length();
		contu=fraseu.length();

		int auxa,auxe,auxi,auxo,auxu;
		
		auxa=cont-conta;
		auxe=cont-conte;
		auxi=cont-conti;
		auxo=cont-conto;
		auxu=cont-contu;
		
		int contadordevogal=0;
		if(auxa>0)
			contadordevogal++;
		if(auxe>0)
			contadordevogal++;
		if(auxi>0)
			contadordevogal++;
		if(auxo>0)
			contadordevogal++;
		if(auxu>0)
			contadordevogal++;
		
		
		System.out.println("A quantidade de vogais (sem repetição) na frase é:"+contadordevogal );
	}

}
