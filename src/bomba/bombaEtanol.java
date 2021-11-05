package bomba;

public class bombaEtanol extends bomba {
	private String etanol;
	
	public String getEtanol() {
		return etanol;
	}
	
	public void setEtanol(String etanol) {
		this.etanol = etanol;
	}
	
	public boolean tipo(String etanol ) {
		if (etanol == "canaDeAcucar") {
			return true;
		}
		if  (etanol == "milho")
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "bombaEtanol [etanol=" + etanol + ", getQuantidade()=" + getQuantidade() + ", getPreco()=" + getPreco()
				+ ", toString()=" + super.toString() + "]";
	}

}
