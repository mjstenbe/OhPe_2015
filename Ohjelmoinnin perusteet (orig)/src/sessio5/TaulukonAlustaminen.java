package sessio5;

import java.util.Arrays;

public class TaulukonAlustaminen {

	public static void main(String[] args) {

		int[] taulukko = { 4, 8, 11, 1, 0 };

		System.out.println(taulukko);
		System.out.println("Taulukon pituus: " + taulukko.length);
		System.out.println(taulukko[2]);

		Arrays.sort(taulukko);

		for (int i = 0; i < taulukko.length; ++i)
			System.out.println(taulukko[i]);

		for (int i = taulukko.length - 1; i >= 0; --i)
			System.out.println(taulukko[i]);

		int laskuri = 0;

		do {
			System.out.println(taulukko[laskuri]);
			++laskuri;
		} while (laskuri < taulukko.length);

	}
}
