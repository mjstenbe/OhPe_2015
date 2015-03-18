package Metodit;

public class LukujenSumma {

	public static void main(String[] args) {

		int tulos = LukujenSumma(5, 2);
		System.out.println(tulos);
		LukujenSumma(11, 8);
		LukujenSumma(8, 4);
	}

	public static int LukujenSumma(int ekaluku, int tokaluku) {
		int summa = ekaluku + tokaluku;
		System.out.println("Summataan: " + (ekaluku + tokaluku));
		return summa;
	}

}
