package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do vetor: ");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n]; //  Cria��o do vetor do tipo do Product(classe).
		
		for (int i=0; i<vect.length; i++) { // Mesmo eu colocando o valor i=1, a primeira excu��o do vetor come�ar� com ele valendo zero (0), sempre!
			sc.nextLine(); // Esta linha serve para consumir a quebra de linha que ficou pendente de "sc.nextInt()" 
			System.out.printf("Digite o nome do %d� produto: ", i + 1);
			String name = sc.nextLine();
			System.out.printf("Digite o valor do produto %s: ", name);
			double price = sc.nextDouble();
			vect[i] = new Product(name, price); /* Aqui ocorre a instancia��o do objeto sempre que o la�o de repeti��o "for" for executado e guardar� os valores na posi��o do vetor da repeti��o passando os par�metros name e price.  
												 * Pois, para o vetor guardar os valores na posi��o correta quando se tratar de um vetor do tipo refer�ncia (classe) � necess�rio sempre a instacia��o da classe quando o vetor for receber um valor em determinada posi��o. 
												 */
		}                                        
		
		double soma = 0.0;
		
		for (int i=0; i<vect.length; i++) {
			soma += vect[i].getPrice(); // Aqui a vari�vel "soma" recebe "soma" +  "soma" + o valor do vetor da repeti��o e acessando o valor atrav�s do getPrice(). 
		}
		
		double media = soma/vect.length;
		
		System.out.printf("A m�dia de valor dos produtos � = %.2f.\n", media);
		
		
		sc.close();

	}
		
}
