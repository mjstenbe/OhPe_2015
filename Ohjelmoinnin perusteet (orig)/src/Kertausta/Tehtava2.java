package Kertausta;

import java.util.Scanner;

public class Tehtava2 {

	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);
		String etunimi;
		String sukunimi;
		int opiskelijanumero;
		boolean ollako;

		System.out.println("SYÖTÄ OPISKELIJAN TIEDOT");
		System.out.println("------------------------");
		System.out.println("");
		System.out.println("Anna etunimet: ");
		etunimi = lukija.nextLine();
		System.out.println("Anna sukunimi: ");
		sukunimi = lukija.nextLine();
		System.out.println("Anna opiskelijanumero: ");
		opiskelijanumero = lukija.nextInt();
		System.out.println("Oletko ilmoittautunut läsnäolevaksi: ");
		ollako = lukija.nextBoolean();
		System.out.println("KIITOS!");

		System.out.println("");
		System.out.println("");

		System.out.println("OPISKELIJAN TIEDOT");
		System.out.println("------------------");
		System.out.println("");

		if (ollako == true) {
			System.out.println("NIMI: " + sukunimi + ", " + etunimi + " ("
					+ opiskelijanumero + ") "
					+ ", on ilmoittautunut läsnäolevaksi");
		} else {

			System.out.println("NIMI: " + sukunimi + ", " + etunimi + " ("
					+ opiskelijanumero + ") "
					+ ", ei ole ilmoittautunut läsnäolevaksi");

		}
	}

}
