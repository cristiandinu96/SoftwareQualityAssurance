import static org.junit.Assert.*;

import org.junit.Test;

public class TestMasinaException {
	@Test(expected = IllegalArgumentException.class)
	public void setModel_illegal_exception() {
		Masina masina = new Masina();
		masina.setModel(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void setPret_illegal_exception() {
		Masina masina = new Masina();
		masina.setPret(-1);
	}
}
