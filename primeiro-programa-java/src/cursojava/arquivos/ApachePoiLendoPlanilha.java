package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiLendoPlanilha {

	public static void main(String[] args) throws Exception {

		//===========================================LER O ARQUIVO ENTRADA E PEGA A PLANILHA======================================================
		// Entrada de dados
		FileInputStream entrada = new FileInputStream(new File(
				"C:\\Users\\Luciano Viana\\git\\Formacao-Java-Web-Full-Stack\\primeiro-programa-java\\src\\cursojava\\arquivos\\arquivo_excel.xls"));
		// Objeto Workbook
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);// Prepara a entrada do arquivo excel para ler
		// HSSFSheet utilizado para pegar a planilha
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0); // Pega a primeira planilha do nosso arquivo de excel
		// Percorrer as linhas
		Iterator<Row> linhaIterator = planilha.iterator();

		
		
		//===========================================VARRE AS LINHAS, DENTRO DAS LINHAS TEM AS CELULAS==============================================
		// Percorrer tabela do excel
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		while (linhaIterator.hasNext()) {// Enquanto tiver linha no arquivo excel

			Row linha = linhaIterator.next();// Dados da pessoa na linha

			Iterator<Cell> celulas = linha.iterator();// Para cada linha pecorrer as celulas

			Pessoa pessoa = new Pessoa();

			while (celulas.hasNext()) {// Percorrer as celulas
				Cell cell = celulas.next();

				switch (cell.getColumnIndex()) {// Pegar o index das celulas
				case 0:
					pessoa.setNome(cell.getStringCellValue());
					break;
				case 1:
					pessoa.setEmail(cell.getStringCellValue());
					break;
				case 2:
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;
				}
			}/*Fim das celulas da linha*/
			
			
			pessoas.add(pessoa);
		}
		
		entrada.close();//Terminou de ler o arquivo excel
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}

	}
}
