package Kertausta;

import java.util.Scanner;

public class Tehtava3 {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		double pituus = 0.0;
		
		System.out.println("Kuinka pitk� olet");
		pituus = lukija.nextDouble();
		
		if (pituus < 140) {
			System.out.println("Olet lyhyt");
		} else if (pituus > 210) {
			System.out.println("Olet pitk�");
		} else
			System.out.println("Olet keskiverto");
	}
}
	