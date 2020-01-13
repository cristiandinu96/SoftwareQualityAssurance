import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestCaroserie {
	@Test
	public void setTipCaroserie_Test() {
		String tipCaroserie = "test caroserie";
		Masina masina = new Masina();
		masina.setTipCaroserie(tipCaroserie);
		Assert.assertEquals(tipCaroserie, masina.getTipCaroserie());
	}
	
	@Test
	public void setCodCuloare_Test() {
		int codCuloare = 25;
		Masina masina = new Masina();
		masina.setCodCuloare(codCuloare);
		Assert.assertEquals(codCuloare, masina.getCodCuloare());
	}

}
