package Sessio4;

/* Esimerkki toistorakenteista */ 
public class Toistorakenteita {

	public static void main(String[] args) {

		double pesäMuna = 0.0;
		double säästettäväRaha = 10; 
		
		for (int laskuri = 0; laskuri < 12; laskuri++) {
			pesäMuna += säästettäväRaha;
			System.out.println("Kertymä tässä vaiheessa: "+pesäMuna+" euroa.");
		}
		System.out.println("Lopussa rahaa on: "+pesäMuna+ " euroa.");
	}

}
