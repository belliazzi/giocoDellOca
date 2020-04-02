package damiano.belliazzi.java.game.girooca;



public abstract class PlanciaBase {
	
	protected int numCaselle;
	
	
	protected Casella[] caselle;
	
	public abstract void initPlanciaDiGioco();

	public int getNumCaselle() {
		return numCaselle;
	}

	public void setNumCaselle(int numCaselle) {
		this.numCaselle = numCaselle;
	}

	public Casella[] getCaselle() {
		return caselle;
	}

	public void setCaselle(Casella[] caselle) {
		this.caselle = caselle;
	}

	public PlanciaBase(int numCaselle) {
		super();
		this.numCaselle = numCaselle;
	}
	
	

}
