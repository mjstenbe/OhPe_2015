package Metodit;

public class Nopanheitto {

	public static void main(String[] args) {
		int osumat = 0;
		int laskuri = 0;

		do {

			int tulos = (int) (Math.random() * 6 + 1);
			laskuri++;

			if (tulos == 6)
				osumat++;

		} while (osumat != 10);

		System.out.println("Osumia: " + osumat);
		System.out.println("Heittoja kertyi: " + laskuri);

	}

}
