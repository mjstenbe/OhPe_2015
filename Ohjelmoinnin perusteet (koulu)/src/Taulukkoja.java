public class Taulukkoja {

	public static void main(String[] args) {

		String[] kaupungit = { "Helsinki", "Kerava", "Kouvola" };

		for (int i = 0; i < kaupungit.length; i++) {
			System.out.println("Kaupunki " + i + ": " + kaupungit[i]);
		}

		kaupungit[1] = "Jyväskylä";
		System.out.println(kaupungit[1]);
		
	}
}
