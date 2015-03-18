package sessio3;

import java.util.Scanner;

public class Karkausvuosi {

	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);

		int rajavuosi = 1753;
		int vuosi;

		System.out.print("Mikä vuosiluku sinua kiinnostaa? ");
		vuosi = lukija.nextInt();
		if (vuosi < rajavuosi) {
			System.out.print("Käytössä oli juliaaninen kalenteri. ");
			if (vuosi % 4 == 0) {
				System.out.println("Vuosi oli karkausvuosi.");
			} else {
				System.out.println("Vuosi ei ollut karkausvuosi.");
			}
		} else {
			System.out.print("Käytössä oli gregoriaaninen kalenteri. ");
			if (vuosi % 400 == 0 || (vuosi % 4 == 0 && vuosi % 100 != 0)) {
				System.out.println("Vuosi oli karkausvuosi.");
			} else {
				System.out.println("Vuosi ei ollut karkausvuosi.");
			}
		}

	}

}