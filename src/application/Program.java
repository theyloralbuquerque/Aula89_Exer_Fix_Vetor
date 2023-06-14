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
		
		Product[] vect = new Product[n]; //  Criação do vetor do tipo do Product(classe).
		
		for (int i=0; i<vect.length; i++) { // Mesmo eu colocando o valor i=1, a primeira excução do vetor começará com ele valendo zero (0), sempre!
			sc.nextLine(); // Esta linha serve para consumir a quebra de linha que ficou pendente de "sc.nextInt()" 
			System.out.printf("Digite o nome do %d° produto: ", i + 1);
			String name = sc.nextLine();
			System.out.printf("Digite o valor do produto %s: ", name);
			double price = sc.nextDouble();
			vect[i] = new Product(name, price); /* Aqui ocorre a instanciação do objeto sempre que o laço de repetição "for" for executado e guardará os valores na posição do vetor da repetição passando os parâmetros name e price.  
												 * Pois, para o vetor guardar os valores na posição correta quando se tratar de um vetor do tipo referência (classe) é necessário sempre a instaciação da classe quando o vetor for receber um valor em determinada posição. 
												 */
		}                                        
		
		double soma = 0.0;
		
		for (int i=0; i<vect.length; i++) {
			soma += vect[i].getPrice(); // Aqui a variável "soma" recebe "soma" +  "soma" + o valor do vetor da repetição e acessando o valor através do getPrice(). 
		}
		
		double media = soma/vect.length;
		
		System.out.printf("A média de valor dos produtos é = %.2f.\n", media);
		
		
		sc.close();

	}
		
}
