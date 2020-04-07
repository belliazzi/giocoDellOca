package damiano.belliazzi.java.game.girooca;

import java.io.BufferedReader;
import java.io.IOException;

public final class Utility {
	public  static  java.lang.Integer getNumeroDaConsole(	BufferedReader bufferedReader) {
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

	public static  java.lang.String getStringaDaConsole(	BufferedReader bufferedReader) {
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
