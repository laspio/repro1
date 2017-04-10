package m5.prac2;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class PilaBuidaTest {
	private Pila ppila;
	@Before
	public void setUp() throws Exception {
		ppila = new Pila();
	}

	@Test
	public void testPilaBuida() {
		assertEquals(ppila.pilaBuida(),true);
	}

	@Test
	public void testApilar() {
		int pilaso = ppila.getNumElements();
		ppila.apilar(10);
		assertEquals(ppila.getNumElements(), pilaso+1);
	}

	@Test
	public void testDesapilar() {
		assertEquals(ppila.desapilar(), (Integer)null);
	}

	@Test
	public void testGetNumElements() {
		assertEquals(ppila.getNumElements(), 0);
	}

}
