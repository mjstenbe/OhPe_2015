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
		double ympyr�nAla = 0;
		double s�de = 0;

		// luodaan tarvittavat oliot
		Scanner lukija = new Scanner(System.in);

		// ohjelma alkaa
		System.out.println("** Ympyr�n ala **");
		System.out.println("Anna ympyr�n s�de niin lasken sen alan.");
		System.out.println("Erota sy�tteess� desimaalit pilkulla.");

		// pyydet��n s�dett�
		System.out.print("s�de: ");
		// luetaan s�de
		s�de = lukija.nextDouble();

		// lasketaan ala
		ympyr�nAla = PII * s�de * s�de;

		// tulostetaan ala
		System.out.println("Ympyr�n ala: " + ympyr�nAla);
	}
}
