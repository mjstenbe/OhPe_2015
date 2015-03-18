package sessio_2;

/*
 * Luku5.java
 * Tehty Viope Java -kurssille lukuun viisi
 * (c) Viope Solutions Oy
 */
import java.util.Scanner;

public class Luku5 {
	public static void main(String[] args) {

		// nimettyvakio
		final double PII = 3.142;
		// alustetaan tarvittavat muuttujat
		double ympyränAla = 0;
		double säde = 0;

		// luodaan tarvittavat oliot
		Scanner lukija = new Scanner(System.in);

		// ohjelma alkaa
		System.out.println("** Ympyrän ala **");
		System.out.println("Anna ympyrän säde niin lasken sen alan.");
		System.out.println("Erota syötteessä desimaalit pilkulla.");

		// pyydetään sädettä
		System.out.print("säde: ");
		// luetaan säde
		säde = lukija.nextDouble();

		// lasketaan ala
		ympyränAla = PII * säde * säde;

		// tulostetaan ala
		System.out.println("Ympyrän ala: " + ympyränAla);
	}
}
