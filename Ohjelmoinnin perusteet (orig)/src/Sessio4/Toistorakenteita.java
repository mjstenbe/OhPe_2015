package Sessio4;

/* Esimerkki toistorakenteista */ 
public class Toistorakenteita {

	public static void main(String[] args) {

		double pes�Muna = 0.0;
		double s��stett�v�Raha = 10; 
		
		for (int laskuri = 0; laskuri < 12; laskuri++) {
			pes�Muna += s��stett�v�Raha;
			System.out.println("Kertym� t�ss� vaiheessa: "+pes�Muna+" euroa.");
		}
		System.out.println("Lopussa rahaa on: "+pes�Muna+ " euroa.");
	}

}
