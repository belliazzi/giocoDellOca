package damiano.belliazzi.java.game.girooca;

public class CasellaOca implements Casella {


		protected int numero;

		protected Giocatore giocatore;

		public CasellaOca(int numero, Giocatore giocatore) {
			this.numero = numero;
			this.giocatore = giocatore;
		}

		
		public CasellaOca(int ininumero) {
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
						+ giocatoreCheDeveSbaraccare.getNome() + " sara' mosso nella casella " + casellaDiDestinazione.getNumero() );
			}
		}
		
		@Override
		public void saltaTurno() {
			// TODO Auto-generated method stub
			
		};
		
		@Override
		public int movimento(int numeroDadi) {
			System.out.print("The cell " + this.getNumero()
			+ " is a goose cell !");
			int finalnumero =  this.getNumero() + numeroDadi;
			System.out.print("il giocatore e' finito su una casella oca");
			System.out.println(" il giocatore e' finito nella casella " + finalnumero);
			return finalnumero;
		}

	}


