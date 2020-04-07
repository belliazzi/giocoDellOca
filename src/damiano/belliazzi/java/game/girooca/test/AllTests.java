package damiano.belliazzi.java.game.girooca.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import damiano.belliazzi.java.game.girooca.CasellaOca;
import damiano.belliazzi.java.game.girooca.CasellaPonte;
import damiano.belliazzi.java.game.girooca.CasellaSemplice;
import damiano.belliazzi.java.game.girooca.CasellaTrappola;
import damiano.belliazzi.java.game.girooca.Giocatore;


public class AllTests {
	
	

	@BeforeClass
	public static void initClass() {
	System.out.println("initClass()");
	}
	@AfterClass
	public static void endClass() {
	System.out.println("endClass()");
	}
	@Before
	public void initMethod() {	
	System.out.println("initMethod()");
	}
	@After
	public void endMethod() {
	System.out.println("end Method");
	}
	
	@Test
	public void testCasellaTrappola() {
	System.out.println("testCasellaTrappola");
	Giocatore giocatore1=new Giocatore("Pippo");
	giocatore1.setCasellaCorrente(new CasellaSemplice(1));
	Giocatore giocatore2=new Giocatore("Pluto");
	giocatore2.setCasellaCorrente(new CasellaTrappola(2));
	CasellaTrappola casellaTrappola= new CasellaTrappola(2,giocatore2);
	casellaTrappola.welcomeGiocatore(giocatore1);
	assertEquals(giocatore2.getCasellaCorrente().getNumero(),1);
	
	}
	@Test
	public void testCasellaPonte() {
	System.out.println("testCasellaPonte");
	Giocatore giocatore1=new Giocatore("Pippo");
	giocatore1.setCasellaCorrente(new CasellaSemplice(1));
	Giocatore giocatore2=new Giocatore("Pluto");
	giocatore2.setCasellaCorrente(new CasellaPonte(2));
	CasellaPonte casellaTrappola= new CasellaPonte(2,giocatore2);
	casellaTrappola.welcomeGiocatore(giocatore1);
	assertEquals(giocatore2.getCasellaCorrente().getNumero(),1);
	
	}
	
	@Test
	public void testCasellaOca() {
	System.out.println("testCasellaOca");
	Giocatore giocatore1=new Giocatore("Pippo");
	giocatore1.setCasellaCorrente(new CasellaSemplice(1));
	Giocatore giocatore2=new Giocatore("Pluto");
	giocatore2.setCasellaCorrente(new CasellaOca(2));
	CasellaOca casellaTrappola= new CasellaOca(2,giocatore2);
	casellaTrappola.welcomeGiocatore(giocatore1);
	assertEquals(giocatore2.getCasellaCorrente().getNumero(),1);
	
	}
	
	

}
