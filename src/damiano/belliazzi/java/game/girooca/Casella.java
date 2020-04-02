package damiano.belliazzi.java.game.girooca;

/**
 * Casella del tabellone . un inteface che tramite polimorfismo assumera caratterisitche differenti 
 * casella ponte , trappola etc etc 
 * @author Damiano
 *
 */
public interface Casella {
	
	boolean isliberabile();
	public int getNumero ();
	public int movimento (int numeroDadi);
	public boolean isOccupata ();
	public Giocatore getGiocatoreCorrente();
	public void setGiocatoreCorrente(Giocatore giocatore);
	public void saltaTurno();
	public void welcomeGiocatore(Giocatore giocatore);
	
	
	

}
