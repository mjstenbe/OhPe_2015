package Kertausta;

import java.util.Scanner;

public class Tehtava9 {

	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna kuvion korkeus: ");
		int korkeus = lukija.nextInt();
		
		tulostaKuvio(korkeus);
		
	}

	public static void tulostaKuvio(int korkeus) {

		for (int i = 0; i < korkeus; ++i) {
			System.out.println();
			for (int j=0; j <= i; ++j){
				System.out.print("o");
			}
		}

	}
}
