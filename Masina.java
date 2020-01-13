public class Masina {
	private String model;
	private double pret;
	private String tipCaroserie;
	private int codCuloare;

	public String getTipCaroserie() {
		return tipCaroserie;
	}
	
	public void setTipCaroserie(String tipCaroserie) {
		if(tipCaroserie == null)
			throw new IllegalArgumentException();
		this.tipCaroserie = tipCaroserie;
	}

	public int getCodCuloare() {
		return codCuloare;
	}
	public void setCodCuloare(int codCuloare) {
		if(codCuloare < 0 || codCuloare > 255)
			throw new IllegalArgumentException();
		this.codCuloare = codCuloare;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		if(model == null)
			throw new IllegalArgumentException();
		this.model = model;
	}
	public double getPret() {
		return pret;
	}
	public void setPret(double pret) {
		if(pret < 0)
			throw new IllegalArgumentException();
		this.pret = pret;
	}
	public Masina(){
		this.model="";
		this.pret=0;
	}
	
	public Masina(String model, double pret) {
		super();
		this.model = model;
		this.pret = pret;
	}
}
