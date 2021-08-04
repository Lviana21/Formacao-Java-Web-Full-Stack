package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComparacaoDatas {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date dataVencimentoBoleto = simpleDateFormat.parse("15/08/2021");

		Date dataAtualHoje = simpleDateFormat.parse("16/08/2021");

		/*Se a data 1 é maior que a data 2*/
		if (dataVencimentoBoleto.after(dataAtualHoje)) {/*Posterior ou maior ou depois da data atual*/
			System.out.println("Boleto não venceu!!");
		} else {
			System.out.println("Boleto Vencido - URGENTE");
		}

	}

}