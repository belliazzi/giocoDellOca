
package damiano.belliazzi.java.game.girooca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main (String[] Arg) {
	
	PlanciaBase plancia=new PlanciaDiGioco();
	List<Giocatore> listGiocatori= new ArrayList<Giocatore>();
	
	int numeroTurni=0;
	int numeroGiocatori=0;	
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	
	while  (!(numeroTurni>0 && numeroTurni<=100)) {
		
		System.out.println("Inserire il numero dei turni massimi consentiti (valore numerico) da 1 a 100 :");
		numeroTurni = getNumeroDaConsole(bufferedReader);
	}
	while  (!(numeroGiocatori>0 && numeroGiocatori<=100)) {
		
		System.out.println("Inserire il numero dei giocatori (valore numerico)");
		numeroGiocatori = getNumeroDaConsole(bufferedReader);
	}
	int i=1;
	String nome="";
	while (i<=numeroGiocatori) {
		 boolean OkGiocatore=false;
		 while (!OkGiocatore) {
	     System.out.println("Inserire il nome del giocatore " +i+ " (valore alfanumerico)");
		 nome=getStringaDaConsole(bufferedReader);
		 OkGiocatore=true;
		 for(Giocatore elem: listGiocatori) {
			 if (elem.getNome().equals(nome)) {
				  System.out.println("giocatore "+ nome+ " e' già esistente ");
				 OkGiocatore=false;
						 break;
			 } else {
				 OkGiocatore=true;
			 }
		 }
		 }
		 if (OkGiocatore) { 
			 Giocatore giocatore1=new Giocatore(nome);
			 String stsAutoma="";
			 while  (!(stsAutoma.toUpperCase().equals("Y") || stsAutoma.toUpperCase().equals("N"))) {
					
				    System.out.println("il giocatore "+ nome + " e' un automa (y,n)");
				    stsAutoma=getStringaDaConsole(bufferedReader);
				    giocatore1.setAutoma(stsAutoma.toUpperCase().equals("Y"));
				}
			 i++;
			 listGiocatori.add(giocatore1);
		 }
		
	}
	
	
	plancia.initPlanciaDiGioco();
	Partita partita=new Partita(listGiocatori,plancia,false);
	partita.giocaPiuTurni(numeroTurni);
}

private static  java.lang.Integer getNumeroDaConsole(	BufferedReader bufferedReader) {
	Integer numeroLetto = 0;
	boolean corretto =false ;
	while (!(corretto)) {
	try {
        
	
		numeroLetto = Integer.parseInt( bufferedReader.readLine().trim());
		corretto=true;
    } catch (NumberFormatException ex) {
       System.out.println("non è un numero !");
       corretto=false ;
    } catch (IOException e) {
        e.printStackTrace();
    }
	}
	return numeroLetto;
}

private static  java.lang.String getStringaDaConsole(	BufferedReader bufferedReader) {
	String sts = "";
	boolean corretto =false ;
	while (!(corretto)) {
	try {
 		sts =  bufferedReader.readLine().trim();
 		corretto=true;
    } catch (IOException e) {
        e.printStackTrace();
    }
	}
	return sts;
}
}
