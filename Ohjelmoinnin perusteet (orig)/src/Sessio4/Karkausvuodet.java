package Sessio4;

public class Karkausvuodet {

	public static void main(String[] args) {

		for (int vuosi = 1753; vuosi <= 2050; ++vuosi) {

			if (vuosi % 400 == 0 || (vuosi % 4 == 0 && vuosi % 100 != 0)) {
				System.out.println("Vuosi " + vuosi + " oli karkausvuosi.");
			} // if
			else {
				//System.out.println("Vuosi "+vuosi +" ei ollut karkausvuosi.");
			} // else
		} // for

	} // main
}
