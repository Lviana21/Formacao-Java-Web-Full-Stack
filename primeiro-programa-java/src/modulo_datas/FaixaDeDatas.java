package modulo_datas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FaixaDeDatas {
	
	public static void main(String[] args) {
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-01-01"), LocalDate.now());//Total de dias de uma data até data de hoje
		long dias2 = ChronoUnit.DAYS.between(LocalDate.parse("2021-01-01"), LocalDate.parse("2021-08-05")); //Total de dias entre duas datas
		
		System.out.println("Total de " + dias + " dias no intervalo de data informada com data atual ");
		System.out.println("Total de " + dias2 + " dias no intervalo de duas datas informadas");
		
	}

}
