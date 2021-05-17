package princio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {

		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta bancária do Luciano");

		bancaria.diminui100Reias();
		System.out.println(bancaria);

		bancaria.soma100Reias();
		System.out.println(bancaria);

		bancaria.sacarDinhiero(500);
		System.out.println(bancaria);

		bancaria.depositaDinheiro(500);
		System.out.println(bancaria);

	}

}
