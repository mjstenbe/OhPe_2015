public class Metodeita2 {

	public static void main(String[] args) {
		
		
		int luku = summaa(5,6);
		System.out.println(luku);		

	}

	public static int summaa(int eka, int toka) {
		
		int summa = eka+toka;
		
		return summa; 
				
	}

	
	public static void tulostaMoi(int kpl) {
		
		System.out.println("Välitit metodiin arvon: "+kpl);
		
		for (int i = 0; i < kpl; ++i) {
			System.out.println("Hoi maailma!");
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
