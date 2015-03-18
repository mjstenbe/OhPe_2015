package sessio3;

import java.util.Scanner;

public class Keskiarvo {
	static int intMaara;
	static int intSumma;
	static boolean blNega;

	public static void main(String[] args) {
		double dblArvo;
		System.out
				.println("Ohjelma laskee syötettyjen arvosanojen keskiarvon.");
		System.out.println("Lopetus negatiivisella kokonaisluvulla.");
		System.out.println();

		while (blNega != true) {
			kysy();
		}
		if (intMaara != 0) {
			double dblSumma = intSumma;
			double dblMaara = intMaara;
			System.out.println();
			dblArvo = dblSumma / dblMaara;
			System.out.println("Syötetty " + intMaara + " arvosanaa.");
			System.out.println("Arvosanojen keskiarvo: " + dblArvo);
		} else {
			System.out.println();
			System.out.println("Et antanut yhtään arvosanaa.");
		}
	}

	public static void kysy() {
		int i;
		Scanner rdrArvo = new Scanner(System.in);
		System.out.print("Anna arvosana (4-10): ");
		i = rdrArvo.nextInt();
		if (i > 3 && i < 11) {
			intMaara = intMaara + 1;
			intSumma = intSumma + i;
		} else {
			if (i < 0) {
				blNega = true;
			} else {
				System.out.println("Antamasi arvosana ei kelpaa!");
			}
		}
	}
}
