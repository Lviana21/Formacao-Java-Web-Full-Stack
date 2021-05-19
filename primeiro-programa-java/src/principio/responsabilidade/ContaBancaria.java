package principio.responsabilidade;

public class ContaBancaria {

	/* Metodos Soma, Diminui, Deposita, Saque */
	private String Descricao;
	private double saldo = 8000;

	public void soma100Reias() {
		saldo += 100;
	}

	public void diminui100Reias() {
		saldo -= 100;
	}

	public void sacarDinhiero(double saque) {
		saldo -= saque;

	}

	public void depositaDinheiro(double deposita) {
		saldo += deposita;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public String getDescricao() {
		return Descricao;
	}

	@Override
	public String toString() {
		return "ContaBancaria [Descricao=" + Descricao + ", saldo=" + saldo + "]";
	}

}
