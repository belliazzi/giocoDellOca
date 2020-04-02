package damiano.belliazzi.java.game.girooca;

public class CasellaTrappola implements Casella {

	protected int numero;

	protected Giocatore giocatore;

	public CasellaTrappola(int numero, Giocatore giocatore) {
		this.numero = numero;
		this.giocatore = giocatore;
	}

	
	public CasellaTrappola(int ininumero) {
		this.numero = ininumero;
		this.giocatore = null;
	}

	@Override
	public boolean isliberabile() {
		return true;
	}
	

	@Override
	public int getNumero() {
		return this.numero;
	}


	@Override
	public boolean isOccupata() {
		
			return this.giocatore != null;
	}

	
	

	@Override
	public Giocatore getGiocatoreCorrente() {
		return this.giocatore;
	}

	@Override
	public void setGiocatoreCorrente(Giocatore giocatore) {
		this.giocatore = giocatore;
	}

	
	public void welcomeGiocatore(Giocatore giocatore) {
		if (this.getGiocatoreCorrente() != null) {
			
			System.out.print("The giocatore " +this.getGiocatoreCorrente().toString() + " is already here !");
			
			Giocatore giocatoreCheDeveSbaraccare = this.getGiocatoreCorrente();
			
			Casella casellaDiDestinazione = giocatore.getCasellaCorrente();
			
			giocatoreCheDeveSbaraccare.setCasellaCorrente(casellaDiDestinazione);
			
			System.out.println(" il giocatore " +giocatore.getNome()
			+ " prende posto e il giocatore "+giocatoreCheDeveSbaraccare.getNome()
			+ " verra mosso fino alla casella numero " + casellaDiDestinazione.getNumero() + ".");
		}
	}

	

	
	@Override
	public void saltaTurno() {
		System.out.println("Il giocatore  " +this.getGiocatoreCorrente() +" è in una casella trappola! "
				+ " lui deve ASPETTARE non appena ne arriva un altro giocatore ");
		};
		
	
	
	@Override
	public int movimento(int numeroDadi) {
		int finalnumero = 0;
		if (this.getNumero() == 6) {
			finalnumero = 12;
		}
		if (this.getNumero() == 42) {
			finalnumero = 30;
		}
		if (this.getNumero() == 58) {
			finalnumero = 1;
		}

		System.out.print("il giocatore e' finito su una casella trappola");
		System.out.println(" il giocatore e' finito nella casella " + finalnumero);
		return finalnumero;
	}

}


