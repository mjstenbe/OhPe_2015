import java.util.Scanner;

public class Arvosanoja {
	public static void main(String[] args) {
		String[] nimet = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
				"21" };
		int[] arvosana = new int[20];
		int luku = 0, nolla = 0, eka = 0, toka = 0, kolmas = 0, neljas = 0, viides = 0;
		Scanner lukija = new Scanner(System.in);
		for (int i = 0; i < nimet.length; i++) {
			System.out.println("Anna " + nimet[i] + ". opiskelijan arvosana: ");
			luku = lukija.nextInt();
			if (luku == 0) {
				nolla += 1;
			} else if (luku == 1) {
				eka += 1;
			} else if (luku == 2) {
				toka += 1;
			} else if (luku == 3) {
				kolmas += 1;
			} else if (luku == 4) {
				neljas += 1;
			} else {
				viides += 1;
			}
		}
		System.out.print("\nTULOKSET:\n");
		System.out.print("0:");
		for (int i = 0; i < nolla; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("1:");
		for (int i = 0; i < eka; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("2:");
		for (int j = 0; j < toka; j++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("3:");
		for (int i = 0; i < kolmas; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("4:");
		for (int i = 0; i < neljas; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("5:");
		for (int i = 0; i < viides; i++) {
			System.out.print("*");
		}
		System.out.print("\n\nYhteensä: 21 opiskelijaa. \n");
	}
}
