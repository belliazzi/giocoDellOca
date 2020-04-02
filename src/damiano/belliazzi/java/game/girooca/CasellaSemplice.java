package damiano.belliazzi.java.game.girooca;

public class CasellaSemplice implements Casella {

	protected int numero;

	protected Giocatore giocatore;

	public CasellaSemplice(int numero, Giocatore giocatore) {
		this.numero = numero;
		this.giocatore = giocatore;
	}

	public CasellaSemplice(int ininumero) {
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

			System.out.print("il giocatore " + this.getGiocatoreCorrente().getNome() + " e' già qui");

			Giocatore giocatoreCheDeveSbaraccare = this.getGiocatoreCorrente();

			Casella casellaDiDestinazione = giocatore.getCasellaCorrente();

			giocatoreCheDeveSbaraccare.setCasellaCorrente(casellaDiDestinazione);

			System.out.println(" il giocatore " + giocatore.getNome() + " prende posto e il giocatore "
					+ giocatoreCheDeveSbaraccare.getNome() + " sara' mosso nella casella "
					+ casellaDiDestinazione.getNumero());
		}
	}

	@Override
	public void saltaTurno() {
		// TODO Auto-generated method stub

	};

	@Override
	public int movimento(int numeroDadi) {
		return this.getNumero();
	}

}
