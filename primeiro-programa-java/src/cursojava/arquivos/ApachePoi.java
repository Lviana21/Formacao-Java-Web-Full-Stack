package cursojava.arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;



public class ApachePoi {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\Users\\Luciano Viana\\git\\Formacao-Java-Web-Full-Stack\\primeiro-programa-java\\src\\cursojava\\arquivos\\arquivo_excel.xls");
		
		if(!file.exists()) {
			file.createNewFile();
		}
	
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Luciano");
		pessoa1.setEmail("teste@gmail.com");
		pessoa1.setIdade(30);

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Debora");
		pessoa2.setEmail("teste2@gmail.com");
		pessoa2.setIdade(25);

		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Bruna");
		pessoa3.setEmail("teste3@gmail.com");
		pessoa3.setIdade(23);

		Pessoa pessoa4 = new Pessoa();
		pessoa4.setNome("Lais");
		pessoa4.setEmail("teste4@gmail.com");
		pessoa4.setIdade(20);
		
		/* Pode vim do banco de dados ou de qualquer fonte de dados */
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); /*Vai ser usado para escrever a planilha*/
		HSSFSheet linhasPessoas = hssfWorkbook.createSheet("Planilha de pessoas Dev Java");/*Criar a planilha*/
		
		int numeroLinha = 0;
		
		for (Pessoa p : pessoas) {
			
			Row linha = linhasPessoas.createRow(numeroLinha++); /*Criando a linha na planilha*/
			
			int celula = 0;
			
			Cell celNome = linha.createCell(celula++);/*Celula 1*/
			celNome.setCellValue(p.getNome());
			
			Cell celEmail = linha.createCell(celula++); /*Celula 2*/	
			celEmail.setCellValue(p.getEmail());
			
			Cell celIdade = linha.createCell(celula++);/*Celula 3*/
			celIdade.setCellValue(p.getIdade());
			
		}// Termino de montrar a planilha
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);//Escreve planilhaa em arquivo
		saida.flush();//Para persisitir as alterações utiliza o flush() 
		saida.close();//Fechar o arquivo
		
		System.out.println("Planilha foi criada!!");
		
	}
}
