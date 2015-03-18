package Kertausta;

import java.util.Scanner;

public class Tehtava8 {

	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);
		double[] tulokset = new double[5];
		int yhteispisteet = 0;
		int lukuja = 0;

		for (int i = 0; i < 5; ++i) {
			System.out.println("Anna tulos: ");
			tulokset[i] = lukija.nextInt();
			yhteispisteet += tulokset[i];
			lukuja++;
		}

		System.out.println("Lukuja: " + lukuja);
		System.out.println("Keskiarvo: " + (double) yhteispisteet / lukuja);

		System.out.println("Suurin luku: " + haeSuurin(tulokset));
		System.out.println("Pienin luku: " + haePienin(tulokset));

	}

	public static double haePienin(double[] pisteet) {

		double pienin = pisteet[0];
		for (int i = 1; i < pisteet.length; i++) {
			if (pienin > pisteet[i]) {
				pienin = pisteet[i];
			}
		}

		return pienin;
	}

	public static double haeSuurin(double[] pisteet) {

		double suurin = pisteet[0];
		for (int i = 1; i < pisteet.length; i++) {
			if (suurin < pisteet[i]) {
				suurin = pisteet[i];
			}

		}
		return suurin;
	}
}
