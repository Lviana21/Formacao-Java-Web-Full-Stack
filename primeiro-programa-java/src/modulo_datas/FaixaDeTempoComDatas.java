package modulo_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FaixaDeTempoComDatas {

	public static void main(String[] args) {

		LocalDate dataBase = LocalDate.parse("2019-10-05");

		System.out.println("Data atual: " + dataBase);

		System.out.println("Mais 5 dias: " + (dataBase = dataBase.plusDays(5)));

		System.out.println("Mais 5 semanas: " + (dataBase = dataBase.plusWeeks(5)));

		System.out.println("Mais 2 meses: " + (dataBase = dataBase.plusMonths(2)));

		System.out.println("Mias 2 anos: " + (dataBase = dataBase.plusYears(2)));

		System.out.println("Menos 2 anos: " + (dataBase = dataBase.minusYears(2)));

		System.out.println("Menos 2 meses: " + (dataBase = dataBase.minusMonths(2)));

		System.out.println("Menos 5 semanas: " + (dataBase = dataBase.minusWeeks(5)));

		System.out.println("Menos 5 dias: " + (dataBase = dataBase.minusDays(5)));

		System.out.println("Data Final: " + dataBase);

		System.out.println("===========================================================");

		for (int mes = 1; mes <= 12; mes++) {
			dataBase = dataBase.plusMonths(1);

			System.out.println("Data de vencimento do boleto: "
					+ dataBase.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + " do mês: " + mes);
		}
	}

}
