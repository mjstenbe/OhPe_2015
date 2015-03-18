package Kertausta;

import java.util.Scanner;
import java.util.Arrays;

public class Tehtava6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nimet = new String[10];

		for (int i = 0; i < nimet.length; i++) {
			System.out.print("Anna " + (i + 1) + ". nimi: ");
			nimet[i] = sc.next();
		}

		for (int j = nimet.length - 1; j >= 0; j--) {
			System.out.println((j + 1) + ". nimi: " + nimet[j]);
		}

		Arrays.sort(nimet);

		for (int j = nimet.length - 1; j >= 0; j--) {
			System.out.println((j + 1) + ". nimi: " + nimet[j]);
		}

	}
}
