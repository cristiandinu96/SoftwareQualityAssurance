import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestMasina {

	@Test
	public void constructor_test() {
		String model = "test model";
		double price = 20;
		Masina masina = new Masina(model, price);
		Assert.assertEquals(model, masina.getModel());
		Assert.assertEquals(price, masina.getPret(), 0.01);
	}
	
	@Test
	public void setModel_Test() {
		String model = "test model";
		Masina masina = new Masina();
		masina.setModel(model);
		Assert.assertEquals(model, masina.getModel());
	}
	
	@Test
	public void constructor_cross_check()
	{
		String model = "test model";
		double price = 20;
		Masina masina2 = new Masina();
		masina2.setModel(model);
		masina2.setPret(price);
		Masina masina = new Masina(model, price);
		Assert.assertEquals(masina2.getModel(), masina.getModel());
		Assert.assertEquals(masina2.getPret(), masina.getPret(), 0.01);
	}

}
