package modulo_datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatasLocalDate {

	public static void main(String[] args) {

		/* Nova API de data a partir do Java 8 */

		LocalDate dataAtual = LocalDate.now(); 
		System.out.println("Data atual: " + dataAtual);

		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora atual: " + horaAtual);

		LocalDateTime dataEHoraAtual = LocalDateTime.now();
		System.out.println("Data e Hora atual: " + dataEHoraAtual);

	}

}
