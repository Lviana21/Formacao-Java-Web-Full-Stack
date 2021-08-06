package modulo_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DiaMesAno {

	public static void main(String[] args) {

		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data atual: " + dataAtual.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

		System.out.println("Dia da semana: " + dataAtual.getDayOfWeek().name());

		System.out.println("Dia do mês: " + dataAtual.getDayOfMonth());

		System.out.println("Dia do ano: " + dataAtual.getDayOfYear());

		System.out.println("Mês: " + dataAtual.getMonth());

		System.out.println("Ano: " + dataAtual.getYear());
	}
}
