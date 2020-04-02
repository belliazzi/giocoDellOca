package damiano.belliazzi.java.game.girooca;



public class PlanciaDiGioco extends PlanciaBase {

	/* Constructor for the original board */
	public PlanciaDiGioco() {
		super(64);
	}
	
	@Override
	
	public void initPlanciaDiGioco(){
		Casella[] caselle = new Casella[64];
		
		caselle[0] = new CasellaInizioStart(0);
		
		for (int i = 1; i < 64; i++) {
			caselle [i] = new CasellaSemplice(i);
		}
		
		int[] gooseCasellas = {5,14,23,9, 18, 27, 36, 45, 54};
		
		for (int i : gooseCasellas) {
			caselle [i] = new CasellaOca(i);
		}
		caselle[6] = new CasellaPonte(6);
		this.setCaselle(caselle);
	}

	
}
