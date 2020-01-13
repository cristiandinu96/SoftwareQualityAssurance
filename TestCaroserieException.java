import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaroserieException {
	@Test(expected = IllegalArgumentException.class)
	public void setModel_illegal_exception() {
		Masina masina = new Masina();
		masina.setTipCaroserie(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void setPret_illegal_exception_min() {
		Masina masina = new Masina();
		masina.setCodCuloare(-1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void setPret_illegal_exception_max() {
		Masina masina = new Masina();
		masina.setCodCuloare(256);
	}
}
