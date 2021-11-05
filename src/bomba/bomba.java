package bomba;

public class bomba {

	private double quantidade;
	private double preco;
	private double litrosVendidos;
	private double litros;
	private double faturamento;
	
	public double getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getLitrosVendidos() {
		return litrosVendidos;
	}
	
	public void setLitrosVendidos(double litroVendidos) {
		this.litrosVendidos = litrosVendidos;
	}
	
	public bomba(double quantidade, double preco, double litrosVendidos) {
		this.quantidade = 0.0;
		this.preco = preco;
		this.litrosVendidos = 0.0;
	}
	
	public bomba() {
	}
	
	private double valorParaLitros;
	
	public double getValorParaLitros() {
		return valorParaLitros;
	}
	
	public void setValorParaLitros() {
		this.getValorParaLitros();
	}
	
	public double litros() {
		litros = valorParaLitros / preco;
		return litros;
	}
	
	public boolean abastecerPorLitro(double quantidade) {
		if (quantidade >= litros) {
			quantidade -= litros;
			litrosVendidos += litros;
			return true;
		}
		return false;
	}
	
	public boolean abastecerPorValor(double quantidade) {
		litros = valorParaLitros / preco;
		if (quantidade >= litros) {
			quantidade -= litros;
			litrosVendidos += litros;
			return true;
		}
		return false;
	}
	
	public double faturamento() {
		faturamento = litrosVendidos * preco;
		return faturamento;
	}

	@Override
	public String toString() {
		return "bomba [quantidade=" + quantidade + ", preco=" + preco + ", toString()=" + super.toString() + "]";
	}
	
}
