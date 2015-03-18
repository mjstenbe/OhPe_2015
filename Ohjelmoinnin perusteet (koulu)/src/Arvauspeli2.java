import java.util.Scanner;

public class Arvauspeli2 {

	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);

		int avainLuku;
		int arvaus;

		System.out.print("Syötä arvattava luku: ");
		avainLuku = lukija.nextInt();
		System.out.println();

		do {

			System.out.print("Syötä luku: ");
			arvaus = lukija.nextInt();
			System.out.println();

			if (avainLuku == arvaus) {
				System.out.print("ARVASIT OIKEIN! ");
			} else if (arvaus > avainLuku) {
				System.out.print("ARVASIT VÄÄRIN! LUKU ON PIENEMPI!\n");
				lukija.nextLine();
			} else if (arvaus < avainLuku) {
				System.out.print("ARVASIT VÄÄRIN! LUKU ON SUUREMPI!\n");
				lukija.nextLine();
			}

		}

		while (avainLuku != arvaus);

	}
}
