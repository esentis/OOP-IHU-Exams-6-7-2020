/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k2;

import java.util.Scanner;

/**
 * @author esentis
 */
public class TestSalary {

	// Well, the array is now of type Object because we dont have any Abstract class
	// for Worker.
	public static double averageOromisthiosSalary(Salary[] workers) {
		// Save all salaries to this variable
		double sum = 0;
		// Increment when we find a oromosthio worker
		int oromisthioi = 0;
		for (Salary worker : workers) {
			// This beauty checks if our worker objcet is ormisthios so it can start adding.
			// salary.
			if (worker instanceof Oromisthios) {
				sum += worker.salary();
			}
			oromisthioi++;
		}
		// Checking for zero division
		return oromisthioi == 0 ? 0 : sum / oromisthioi;
	}

	public static double maxHmeromisthio(Salary[] workers) {
		double max = 0;
		for (Salary worker : workers) {
			// This beauty checks if our worker object is Symvasiouhos so it can start
			// looking for max.
			if (worker instanceof Symvasiouhos) {
				// If the salary of the current worker is higher than the max, then it will
				// become the new max
				if (((Oromisthios) worker).salary() > max) {
					max = worker.salary();
				}
			}

		}
		return max;
	}

	public static double totalSalaries(Salary[] workers) {

		double allSalaries = 0;
		for (Salary worker : workers) {
			allSalaries += worker.salary();
		}
		return allSalaries;
	}

	public void main(String[] args) {
		// The workers array
		Salary[] workers = new Salary[20];
		// Our scanner that will get us the user inputs
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 20; i++) {
			// Something beautiful to simulate 50/50 randomness.
			// randomNumber is either 0 : Oromisthios or 1: Symvasiouhos
			// Legacy way
			// int randomNumber = (int) Math.floor((Math.random() * 2));
			// Fancier way of finding random with turnary not exactly 50-50 but still quite
			// fair.
			int randomNumber = Math.random() > 0.5 ? 0 : 1;
			if (randomNumber == 0) {
				System.out.println("Seems like you are adding Oromisthios Worker, give the ORES he works\n");
				// And we ask the user for the radius
				double ores = Double.parseDouble(sc.nextLine());
				// The check if user entered correct data
				while (ores < 1 || ores > 200) {
					System.out.print("Obey the rules, ORES should be between 1 and 250\n");
					// And we ask the user for the radius
					ores = Double.parseDouble(sc.nextLine());
				}
				System.out.println("How much is his OROMISTHIO ?\n");
				double oromisthio = Double.parseDouble(sc.nextLine());
				// We create our Oromisthios object
				Oromisthios oromisthios = new Oromisthios(ores, oromisthio);
				workers[i] = oromisthios;
			} // Else the random number is 1 and we are adding Symvasiouhos
			else {
				System.out.println("Seems like you are adding Symvasiouhos Worker, give the MERES he works\n");
				double meres = Double.parseDouble(sc.nextLine());
				// The check if user entered correct data
				while (meres < 1 || meres > 25) {
					System.out.print("Obey the rules, ORES should be between 1 and 250\n");
					// And we ask the user for the radius
					meres = Double.parseDouble(sc.nextLine());
				}
				System.out.println("How much is his HMEROMISTHIO ?\n");
				double hmeromisthio = Double.parseDouble(sc.nextLine());
				// We create our Symvasiouhos object
				Symvasiouhos symv = new Symvasiouhos(meres, hmeromisthio);
				workers[i] = symv;
			}
		}
		// The sum of salaries of Symvasiouhoi needs to be another loop in the object
		// array
		double symvasiouhosSalarySum = 0;
		for (Object worker : workers) {
			if (worker instanceof Symvasiouhos) {
				symvasiouhosSalarySum += ((Symvasiouhos) worker).salary();
			}
		}
		System.out.println("THE SUM OF SUMVASIOUHON SALARY IS " + symvasiouhosSalarySum);

	}
}
