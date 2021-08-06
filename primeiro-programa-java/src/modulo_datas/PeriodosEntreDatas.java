package modulo_datas;

import java.time.LocalDate;
import java.time.Period;

public class PeriodosEntreDatas {

	public static void main(String[] args) {
		
		//LocalDate dataAntiga = LocalDate.of(2019, 2, 2);
		//LocalDate dataNova = LocalDate.of(2021, 9, 7);
		
		LocalDate dataAntiga = LocalDate.parse("2019-02-02");
		LocalDate dataNova = LocalDate.parse("2021-09-15");
		
		//Compração se data antiga é maior que data nova
		System.out.println("Data antiga é maior que data nova: " + dataAntiga.isAfter(dataNova));
		
		System.out.println("Data antiga é anterior a data nova: " + dataAntiga.isBefore(dataNova));
		
		System.out.println("Datas são iguais: " + dataAntiga.isEqual(dataNova));
		
		//Periodo entre datas
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos dias: " + periodo.getDays() + " dias");
		
		System.out.println("Quantos meses: " + periodo.getMonths() + " mes(es)");
		
		System.out.println("Somente meses: " + periodo.toTotalMonths() + " mes(es)");
		
		System.out.println("Quantos anos: " + periodo.getYears() + " ano(s)");
		
		System.out.println("Periodo é : " + periodo.getYears() + " ano(s) " + periodo.getMonths() + " mes(es) " + periodo.getDays() + " dia(s)");
		
		
		
	}
}
