public class Metodeita {

	public static void main(String[] args) {
		
		// tulostaValikko();
		// tulostaMoi(5);
		// System.out.println();
		// tulostaMoi(12);
		
		System.out.println( summaa(32, 12) );
		

	}
	public static int summaa(int ekaluku, int tokaluku) {
		int summa = ekaluku + tokaluku;
		
		System.out.println("Summa: " + summa);
		return summa;
	}
	
	public static int summaa(int ekaluku, int tokaluku, int kolmas) {
		
		int summa = ekaluku + tokaluku +tokaluku;
		System.out.println("Summa: " + summa);
		return summa;
	}

	public static void tulostaMoi(int kpl) {

		// System.out.println(kpl);

		for (int i = 0; i < kpl; ++i) {
			System.out.println("Hoi Maailma");
		}
	}

	
	public static void tulostaValikko() {
		System.out.println("***************************");
		System.out.println("* 1 – Käynnistä auto");
		System.out.println("* 2 – Aja autoa");
		System.out.println("* 3 – Sammuta auto");
		System.out.println("* 4 – Lopeta peli");
		System.out.println("***************************");
	}

}





