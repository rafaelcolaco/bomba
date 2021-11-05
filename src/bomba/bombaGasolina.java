package bomba;

public class bombaGasolina extends bomba {
	private String gasolina;
	
	public String getGasolina() {
		return gasolina;
	}
	
	public void setGasolina(String gasolina) {
		this.gasolina = gasolina;
	}
	
	public boolean tipo(String gasolina ) {
		if (gasolina == "aditivada") {
			return true;
		}
		if  (gasolina == "normal")
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "bombaGasolina [gasolina=" + gasolina + ", getQuantidade()=" + getQuantidade() + ", getPreco()="
				+ getPreco() + ", toString()=" + super.toString() + "]";
	}
	
}
