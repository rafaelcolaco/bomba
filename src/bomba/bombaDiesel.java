package bomba;

public class bombaDiesel extends bomba {
	private String diesel;
	
	public String getDiesel() {
		return diesel;
	}
	
	public void setDiesel(String diesel) {
		this.diesel = diesel;
	}
	
	public boolean tipo(String diesel ) {
		if (diesel == "S10") {
			return true;
		}
		if  (diesel == "S50")
			return true;
		if  (diesel ==  "S500")
			return true;
		if  (diesel == "S1800")
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "bombaDiesel [diesel=" + diesel + ", getQuantidade()=" + getQuantidade() + ", getPreco()=" + getPreco()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
