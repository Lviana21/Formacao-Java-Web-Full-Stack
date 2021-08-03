package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {

		Date date = new Date();

		System.out.println("Data em milisegundos: " + date.getTime());

		System.out.println("M�s do ano: " + date.getMonth());

		System.out.println("Dia do m�s: " + date.getDate());

		System.out.println("Dia da semana: " + date.getDay());

		System.out.println("Hora do dia: " + date.getHours());

		System.out.println("Minutos da hora: " + date.getMinutes());

		System.out.println("Segundos: " + date.getSeconds());

		System.out.println("Ano: " + (date.getYear() + 1900));
		System.out.println("\n");

		/*------------------------------Simple Date Format--------------------------------*/

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		System.out.println("Data atual em formato padrao e String: " + simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		System.out.println("Data em formato para banco de dados: " + simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Objeto Date: " + simpleDateFormat.parse("1987-10-18"));

		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Objeto Date: " + simpleDateFormat.parse("18/10/1987"));

	}

}