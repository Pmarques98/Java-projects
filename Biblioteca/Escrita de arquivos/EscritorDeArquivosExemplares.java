package br.usp.ime.mac321.ep2.ex2;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.util.List;



import com.opencsv.CSVWriter;

public class EscritorDeArquivosExemplares implements EscritorDeCsvExemplares {

	public void escrever(List<Exemplar> exemplares, String nomeDoArquivo) {
	    try {
	    	Writer writer = new BufferedWriter(new FileWriter(nomeDoArquivo));
	    	CSVWriter csvWriter = new CSVWriter (writer, CSVWriter.DEFAULT_ESCAPE_CHARACTER,
	    			                                    CSVWriter.NO_QUOTE_CHARACTER,
	    			                                    CSVWriter.DEFAULT_SEPARATOR,
	    			                                    CSVWriter.DEFAULT_LINE_END);
	    	String[] coluna = {"idE","idL"};
	    	csvWriter.writeNext(coluna);
	    	
	    	for(Exemplar Exemplar: exemplares) {
	    		String idE = Exemplar.getIdExemplar();
	    		String idL = Exemplar.getIdLivro();
	    		String[] row = {idE,idL};
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
