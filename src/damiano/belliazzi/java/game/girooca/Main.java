
package damiano.belliazzi.java.game.girooca;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main (String[] Arg) {
	
	PlanciaBase plancia=new PlanciaDiGioco();
	
	Giocatore giocatore1=new Giocatore("Pippo");
	Giocatore giocatore2=new Giocatore("Pluto");
	Giocatore giocatore3=new Giocatore("Paperino");
	List<Giocatore> listGiocatori= new ArrayList<Giocatore>();
	listGiocatori.add(giocatore1);
	listGiocatori.add(giocatore2);
	listGiocatori.add(giocatore3);
	plancia.initPlanciaDiGioco();
	Partita partita=new Partita(listGiocatori,plancia,false);
	partita.giocaPiuTurni(20);
}
}
