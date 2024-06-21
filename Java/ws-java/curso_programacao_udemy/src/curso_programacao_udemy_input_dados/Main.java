package curso_programacao_udemy_input_dados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Exercicio leitura de dados, input de teclado
		//Locale para tratar erro de input, ponto ou virgula a depender da configuração.
		//nesse caso quero decimais separados por ponto.
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);

		String x;
		//input String
		x = sc.next();
		
		char c;
		//leitura de um caracter naquela posição da string
		//nesse caso abaixo pegando o primeiro caracter independente
		//do tamanho da string
		c = sc.next().charAt(0);
				
		
		int y;
		//input int
		y = sc.nextInt();
		
		double z;
		//input double
		z= sc.nextDouble();
		
		//utilizado esse nextLine() para ignorar a quebra de linha que vem das chamadas anteriores
		//dos outros metodos, pois quando pressionamos Enter é adicionada uma quebra de linha
		//que acabava sendo consumida pelo nextLine antes de receber a string a ser lida na linha 41.
		sc.nextLine();
		
		String linha;
		//nextLine utilizado para ler ate encontrar quebra de linha
		linha = sc.nextLine();
		
		
		System.out.println("Voce digitou: " + x);
		System.out.println("Voce digitou: " + c);
		System.out.println("Voce digitou: " + y);
		System.out.println("Voce digitou: " + z);
		System.out.println("Voce digitou: " + linha);
		
		sc.close();
	}

}
