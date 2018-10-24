package autobuska_stanica;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PolazakTest {
	
	Polazak instance;

	@Before
	public void setUp() throws Exception {
		instance = new Polazak();
	}

	@After
	public void tearDown() throws Exception {
		instance = null;
	}

	@Test
	public void metoda_setDestinacija() {
		instance.setDestinacija("Baku");
		
		assertEquals("Kada se unese 'Baku', atribut ne dobija tu vrednost", "Baku", instance.getDestinacija());
	}

	@Test
	public void metoda_setVreme() {
		fail("Not yet implemented");
	}

	@Test
	public void metoda_setBrojSlobodnihMesta() {
		fail("Not yet implemented");
	}

	@Test
	public void metoda_toString() {
		fail("Not yet implemented");
	}

}
