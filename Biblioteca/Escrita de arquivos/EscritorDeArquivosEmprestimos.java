package br.usp.ime.mac321.ep2.ex2;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.util.List;


import com.opencsv.CSVWriter;

public class EscritorDeArquivosEmprestimos implements EscritorDeCsvEmprestimos {

	
	public void escrever(List<Emprestimo> emprestimos, String nomeDoArquivo) {
		 try {
		    	Writer writer = new BufferedWriter(new FileWriter(nomeDoArquivo));
		    	CSVWriter csvWriter = new CSVWriter (writer, CSVWriter.DEFAULT_ESCAPE_CHARACTER,
		    			                                    CSVWriter.NO_QUOTE_CHARACTER,
		    			                                    CSVWriter.DEFAULT_SEPARATOR,
		    			                                    CSVWriter.DEFAULT_LINE_END);
		    	 
		    	String[] coluna = {"cpf","idExemp","dEmprestimo","dRetorno","dRetornado"};
		    	csvWriter.writeNext(coluna);
		    	
		    	for(Emprestimo Emprestimo: emprestimos) {
		    		String cpf = Emprestimo.getCPF();
		    		String idExemp = Emprestimo.getIdExemplar();
		    		String dEmprestimo = Emprestimo.getDataEmprestimo();
		    		String dRetorno = Emprestimo.getDataRetorno();
		    		String dRetornado = Emprestimo.getDataRetornado();
		    		String[] row = {cpf,idExemp,dEmprestimo,dRetorno,dRetornado};
		    		csvWriter.writeNext(row);
		    	}
		    	
		    	writer.close();
		    	csvWriter.close();
		    	
		    	
	}catch(Exception e){
    	e.getMessage();
    	e.printStackTrace();
    }

	}
	
}
