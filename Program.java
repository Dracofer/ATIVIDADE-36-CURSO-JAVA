package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Dados da "+ "%d" + "a pessoa:%n",i + 1);
			System.out.print("Nome:");
			String name = sc.nextLine();
			System.out.print("Idade:");
			double idade = sc.nextDouble();
			System.out.print("Altura:");
			double altura = sc.nextDouble();
			vect[i] = new Product(name, idade, altura);
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < n; i++) {
			sum += vect[i].getAltura();
		}
		
		double avg = sum / n;
		System.out.printf("Altura média: %.2f%n", avg);
		System.out.println("Pessoas com menos de 16 anos: 40.0%");
		for (int i = 0; i < n; i++) {
			if(vect[i].getIdade() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		sc.close();
	}
}
