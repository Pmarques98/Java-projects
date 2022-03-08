package br.usp.ime.mac321.ep2.ex2;



import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.util.List;



import com.opencsv.CSVWriter;


public class EscritorDeArquivosUsuarios implements EscritorDeCsvUsuarios {


	public void escrever(List<Usuario> usuarios, String nomeDoArquivo) {
	    try {
	    	Writer writer = new BufferedWriter(new FileWriter(nomeDoArquivo));
	    	CSVWriter csvWriter = new CSVWriter (writer, CSVWriter.DEFAULT_ESCAPE_CHARACTER,
	    			                                    CSVWriter.NO_QUOTE_CHARACTER,
	    			                                    CSVWriter.DEFAULT_SEPARATOR,
	    			                                    CSVWriter.DEFAULT_LINE_END);
	    	 
	    	String[] coluna = {"nome","cpf"};
	    	csvWriter.writeNext(coluna);
	    	
	    	
	    	for(Usuario Usuario : usuarios) {
	    	    String nome = Usuario.getNome();
	    	    String cpf = Usuario.getCPF();
	    	    String[] row = {nome,cpf};
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
