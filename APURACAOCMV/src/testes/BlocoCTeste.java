package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import modelBlocoC.BlocoC;

public class BlocoCTeste {

	BlocoC blocoC;

	@Before
	public void setUp() throws Exception {
		this.blocoC = new BlocoC();
	}

	@Test
	public void testBlocoC() {
		// fail("Not yet implemented");
		assertEquals(4, blocoC.getListC100().size());
	}

	@Test
	public void testCarregaListaBlocoCC100() {
		fail("Not yet implemented");
	}

	@Test
	public void testCarregaListaBlocoCC300() {
		fail("Not yet implemented");
	}

	@Test
	public void testCarregaListaBlocoCC350() {
		fail("Not yet implemented");
	}

	@Test
	public void testImprimeListC100() {
		fail("Not yet implemented");
	}

	@Test
	public void testImprimeListC300() {
		fail("Not yet implemented");
	}

}
