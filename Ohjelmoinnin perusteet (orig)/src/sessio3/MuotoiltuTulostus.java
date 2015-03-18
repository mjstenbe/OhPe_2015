package sessio3;

/*
 * (c) Viope Solutions Oy
 * Esimerkkiratkaisu tehtävään: 
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
				.println("\tTämän harjoituksen nimi on \'Tulostuksen muotoilu\'.");
		System.out.println("\tSarkainta, rivinvaihtoa ja lainausmerkkejä "
				+ "on jo käytetty tässä tehtävässä.");
		System.out
				.println("\tLisäksi myös kenoviivaa(\\) on mahdollista käyttää tulostuksessa.");
		System.out.println("\n\n\t\t*** Se tehtävä oli siinä ***");
	}
}
