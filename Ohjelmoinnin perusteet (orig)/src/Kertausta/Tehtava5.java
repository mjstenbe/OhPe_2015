package Kertausta;

import java.util.Scanner;

public class Tehtava5 {

	public static void main(String[] args) {

		int pin1;

		Scanner lukija = new Scanner(System.in);

		int count = 1;

		do {

			System.out.println("Anna pin-koodi" + " " + "(" + count + "." + ""
					+ "yritys)");
			pin1 = lukija.nextInt();

			if (pin1 == 4231 || pin1 == 9221) {
				System.out.println("KOODI OIKEIN, KIRJAUTUMINEN ONNISTUI!");
			} else {
				System.out.println("VÄÄRIN!");
			}

			if (count >= 4)
				System.out.println("Liikaa yrityksiä!");

			count++;
		} while (pin1 != 4321 && pin1 != 9221 && count <= 4);

	}

}