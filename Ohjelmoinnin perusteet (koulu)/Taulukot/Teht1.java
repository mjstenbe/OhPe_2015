public class Teht1 {
	public static void main(String[] args) {
		int[] kokluktaul = { 5, 7, 32, 31, 8 };
		double[] desluktaul = { 12.4, -13.55, 67.44 };
		String[] merkkitaul = { "Helsinki", "Lissabon", "New York", "Shanghai" };
		
		// a) Tulosta ruudulle lause �Alkiossa numero 3 on :
		// � ja liit� per��n merkkijonotaulukon kolmas alkio
		System.out.print("A) " + kokluktaul[2]);
		System.out.println();
		
		// b) Tulosta ruudulle lause �Alkiossa numero 5 on :
		// � ja liit� per��n kokonaislukutaulukon viides alkio
		System.out.print("B) " + kokluktaul[4]);
		System.out.println();
		
		// c) Tulosta ruudulle lause �Desimaalitaulukossa on XX arvoa�,
		// jossa liit�t XX:n per��n ko. taulukon pituuden kertovan
		// kent�n nimen
		System.out.print("C) Desimaalitaulukossa on " + desluktaul.length
				+ " arvoa");
		System.out.println();
		
		// d) Kirjoita kokonaislukutaulukkoa varten for-lause,
		// jolla tulostat taulukon sis�ll�n ruudulle
		for (int laskuri = 0; laskuri < kokluktaul.length; laskuri++) {
			System.out.println("D) " + kokluktaul[laskuri]);
		}
		
		// e) Kirjoita desimaalilukutaulukkoa varten for �lause,
		// jolla tulostat taulukon k��nteisess� j�rjestyksess�
		for (int i = desluktaul.length - 1; i >= 0; --i) {
			System.out.println("E) " + desluktaul[i]);
		}
		
		// f) Kirjoita merkkijonotaulukkoa varten do-while � lause,
		// jolla asetat alkioiden arvoksi tekstin �Tyhj�.
		int laskr = 0;
		do {
			System.out.println("F) " + merkkitaul[laskr]);
			laskr++;
		} while (laskr < merkkitaul.length);
	}
}
