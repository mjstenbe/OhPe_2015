package Kertausta;

public class Tehtava7 {

	public static void main(String[] args) {
		System.out.println("Kanava nro: "+arvoKanava());
	}

	public static int arvoKanava() {
		int kanava = (int) (Math.random() * 4 + 1);
		return kanava;
	}

}
