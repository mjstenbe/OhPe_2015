package sessio3;

/*
 * (c) Viope Solutions Oy
 * Esimerkkiratkaisu teht�v��n: 
 * "Tulostuksen muotoilu"
 */

import java.util.Scanner;

public class MuotoiltuTulostus {
	public static void main(String[] args) {
		String etunimi;
		Scanner lukija = new Scanner(System.in);

		System.out.print("Anna etunimesi: ");
		etunimi = lukija.nextLine();

		System.out.println("\n\nHei, " + "\"" + etunimi + "\"");
		System.out
				.println("\tT�m�n harjoituksen nimi on \'Tulostuksen muotoilu\'.");
		System.out.println("\tSarkainta, rivinvaihtoa ja lainausmerkkej� "
				+ "on jo k�ytetty t�ss� teht�v�ss�.");
		System.out
				.println("\tLis�ksi my�s kenoviivaa(\\) on mahdollista k�ytt�� tulostuksessa.");
		System.out.println("\n\n\t\t*** Se teht�v� oli siin� ***");
	}
}
