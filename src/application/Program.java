package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Payers;

public class Program {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		List<Payers> list = new ArrayList<>();
		
		System.out.printf("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Tax payer # " + i + " data:");
			System.out.println("Individual or Company? (i/c)");
			char ch = sc.next().charAt(0);
			
			if(ch == 'i') {
				sc.nextLine();
				System.out.printf("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual Income: ");
				Double income = sc.nextDouble();
				System.out.println("Health expenditures: ");
				Double exp = sc.nextDouble();
				Payers individual = new Individual(name, income, exp);
				list.add(individual);
			
			}else if (ch =='c') {
				sc.nextLine();
				System.out.printf("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual Income: ");
				Double income = sc.nextDouble();
				System.out.println("Number of employees: ");
				Integer num = sc.nextInt();
				Payers company = new Company(name, income, num);
				list.add(company);
			}
			
			}
			
		for(Payers payers : list) {
			System.out.println(payers);
		}		
		
	}
}


