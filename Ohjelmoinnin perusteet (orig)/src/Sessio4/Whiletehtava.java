package Sessio4;

import java.util.Scanner;

public class Whiletehtava {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		int luku;

		do {
			System.out.println("Anna joku luku väliltä 1-9");
			luku = lukija.nextInt();
		} while (luku < 1 || luku > 9);

	}
}