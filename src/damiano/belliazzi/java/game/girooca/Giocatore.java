package damiano.belliazzi.java.game.girooca;

public class Giocatore {
	String nome;
	Casella casellaCorrente;
	Casella casellaPrecedente;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Casella getCasellaCorrente() {
		return casellaCorrente;
	}

	public void setCasellaCorrente(Casella casellaCorrente) {
		this.setCasellaPrecedente(this.casellaCorrente);
		this.casellaCorrente = casellaCorrente;
	}

	public Casella getCasellaPrecedente() {
		return casellaPrecedente;
	}

	public void setCasellaPrecedente(Casella casellaPrecedente) {
		this.casellaPrecedente = casellaPrecedente;
	}

	private int lancioUnDado() {
		return ((int) (Math.random() * 10000) % 6) + 1;
	}

	public int LancioDueDadi() {
		int result = lancioUnDado() + lancioUnDado();
		return result;
	}

	public Giocatore(String nome) {
		super();
		this.nome = nome;
		this.casellaCorrente=new CasellaInizioStart(0);
	}
	

}
