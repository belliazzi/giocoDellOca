package damiano.belliazzi.java.game.girooca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Partita {

private List<Giocatore> giocatori = new ArrayList<Giocatore>();
	

	private PlanciaBase planciaBase;
	
	private boolean fineGioco;
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	public List<Giocatore> getGiocatori() {
		return giocatori;
	}

	public void setGiocatori(List<Giocatore> giocatori) {
		this.giocatori = giocatori;
	}

	public PlanciaBase getPlanciaBase() {
		return planciaBase;
	}

	public void setPlanciaBase(PlanciaBase planciaBase) {
		this.planciaBase = planciaBase;
	}

	public boolean isFineGioco() {
		return fineGioco;
	}

	public void setFineGioco(boolean fineGioco) {
		this.fineGioco = fineGioco;
	}

	public Partita(List<Giocatore> giocatori, PlanciaBase planciaBase, boolean fineGioco) {
		super();
		this.giocatori = giocatori;
		this.planciaBase = planciaBase;
		this.fineGioco = fineGioco;
	}

	public void addGiocatore(Giocatore p) {
		this.giocatori.add(p);
		this.getPlanciaBase().getCaselle()[0].setGiocatoreCorrente(p);
	}

	/**
	 * metodo che definisce i singoli turni di ogni giocatore 
	 */
	public void giocaUnTurno(){
		
		int boardSize = this.getPlanciaBase().getNumCaselle() - 1;
		
		turno:
		for (Giocatore p : this.giocatori) {
			
			
			if (p.getCasellaCorrente().isliberabile()) {
				int result=0;
				if (p.isAutoma())  {
					result=p.lancioDueDadi();
				} else 
				{
					
					int i=1;
					result=lancioManuale( i);
					i=2;
					result=result+lancioManuale(i);
					
				}
				
			
				int currentIndex = p.getCasellaCorrente().getNumero();
				int interIndex = currentIndex + result;
				int intermediateIndex;
				int destinationIndex;
				
				
				if (interIndex < boardSize + 1) {
					intermediateIndex = interIndex;
					destinationIndex = this.getPlanciaBase().getCaselle()[intermediateIndex].movimento(result);
				} else {
					intermediateIndex = boardSize - (result - (boardSize - currentIndex));
					destinationIndex = intermediateIndex;
				}
				
				
				System.out.print(p.getNome() + " e' nella casella  " +currentIndex +".");
				System.out.println(" lancia i dadi e ottiene " +result + " cosi va alla casella " +intermediateIndex +".");
				
				Casella destinationCell = this.getPlanciaBase().getCaselle()[destinationIndex];
								
				destinationCell.welcomeGiocatore(p);
				p.setCasellaCorrente(destinationCell);
				this.getPlanciaBase().getCaselle()[destinationIndex].setGiocatoreCorrente(p);
				
			
				if (destinationIndex == boardSize) {
					System.out.println(p.getNome() + " e' nella casella " +destinationIndex
							+" e la casella finale e lui vince VINCE " +p.getNome().toUpperCase()+ "*******");
					this.setFineGioco(true);
					break turno;
				}
			} else {
				p.getCasellaCorrente().saltaTurno();
			}
			
		}
		
	}

	private int lancioManuale( int i) {
		int numeroDado=0;
		while  (!(numeroDado>0 && numeroDado<=6)) {
			
			System.out.println("Inserire il numero del dado "+ i +" (valore numerico) da 1 a 6 :");
			numeroDado = Utility.getNumeroDaConsole(bufferedReader);
		}
		return numeroDado;
	}
	
	/**
	 * La partita e' composta da piu' turni 
	 * @param Nmax
	 */
	public void giocaPiuTurni(int Nmax) {
		int i = 0;
		while (i < Nmax & !this.isFineGioco()) {
			System.out.println("Turno " +i);
			this.giocaUnTurno();
			i++;
		}
	}

	
}
