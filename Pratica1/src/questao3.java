package questoes;
import java.util.Scanner;
public class questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String frase,frasea,frasee,frasei,fraseo,fraseu;
		System.out.println("Bem vindo ao contador de vogais do Arthur");
		System.out.println("Entre com a frase que voc� deseja saber a quantidade de vogais (Sem Repeti��o)");
		frase = entrada.nextLine();
		int cont,conta,conte,conti,conto,contu;
		cont=frase.length();//calcula o tamanho da frase digitada pelo usu�rio;
		
		frasea = frase.replace("a",""); // Substitui todas as letras "a" da frase
		frasee = frase.replace("e",""); // Substitui todas as letras "e" da frase
		frasei = frase.replace("i",""); // Substitui todas as letras "i" da frase
		fraseo = frase.replace("o",""); // Substitui todas as letras "o" da frase
		fraseu = frase.replace("u",""); // Substitui todas as letras "u" da frase
		
		
		conta=frasea.length(); //calcula o tamanho da frase digitada pelo usu�rio com a vogal "a" removida;
		conte=frasee.length(); //calcula o tamanho da frase digitada pelo usu�rio com a vogal "e" removida;
		conti=frasei.length(); //calcula o tamanho da frase digitada pelo usu�rio com a vogal "i" removida;
		conto=fraseo.length(); //calcula o tamanho da frase digitada pelo usu�rio com a vogal "o" removida;
		contu=fraseu.length(); //calcula o tamanho da frase digitada pelo usu�rio com a vogal "u" removida; 

		int auxa,auxe,auxi,auxo,auxu;
		
		auxa=cont-conta; //verifica a quantidade de vogais que foi substituida atraves da subtra��o;
		auxe=cont-conte; //verifica a quantidade de vogais que foi substituida atraves da subtra��o;
		auxi=cont-conti; //verifica a quantidade de vogais que foi substituida atraves da subtra��o;
		auxo=cont-conto; //verifica a quantidade de vogais que foi substituida atraves da subtra��o;
		auxu=cont-contu; //verifica a quantidade de vogais que foi substituida atraves da subtra��o;
		
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
		
		
		System.out.println("A quantidade de vogais (sem repeti��o) na frase �:"+contadordevogal );
	}

}
