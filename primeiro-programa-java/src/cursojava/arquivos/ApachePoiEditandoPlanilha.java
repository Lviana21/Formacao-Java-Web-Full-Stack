package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiEditandoPlanilha {
	
	public static void main(String[] args) throws Exception {
		
		//Pegar arquivo onde será alterado 
		File file = new File("C:\\Users\\Luciano Viana\\git\\Formacao-Java-Web-Full-Stack\\primeiro-programa-java\\src\\cursojava\\arquivos\\arquivo_excel.xls");
		
		//Entrada de dados
		FileInputStream entrada = new FileInputStream(file);
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); //Prepara a entrada do arquivo xsl do excel
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0); //Pegando a planilha
		
		Iterator<Row> linhaIterator = planilha.iterator();//Percorrer linhas
		
		while (linhaIterator.hasNext()) {//Enquanto tiver linha
			Row linha = linhaIterator.next();//Dados da pessoa na linha
			
			int numeroCelulas = linha.getPhysicalNumberOfCells();//Quantidade de celula
			
			Cell cell = linha.createCell(numeroCelulas);//Cria nova celula na linha
			cell.setCellValue("5.487,20");
		}
		
		entrada.close();
		
		FileOutputStream saida = new FileOutputStream(file);//Saida de dados para o mesmo arquivo excel
		hssfWorkbook.write(saida);//Escrita para a saida
		saida.flush();
		saida.close();
		
		System.out.println("Planilha atualizada");
		
	}

}
