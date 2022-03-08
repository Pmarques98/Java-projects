package br.usp.ime.mac321.ep2.ex2;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.util.List;


import com.opencsv.CSVWriter;

public class EscritorDeArquivosLivros implements EscritorDeCsvLivros {
 

	public void escrever(List<Livro> livros, String nomeDoArquivo) {
		try {
	    	Writer writer = new BufferedWriter(new FileWriter(nomeDoArquivo));
	    	CSVWriter csvWriter = new CSVWriter (writer, CSVWriter.DEFAULT_ESCAPE_CHARACTER,
	    			                                    CSVWriter.NO_QUOTE_CHARACTER,
	    			                                    CSVWriter.DEFAULT_SEPARATOR,
	    			                                    CSVWriter.DEFAULT_LINE_END);
	    	 
	    	String[] coluna = {"id", "titulo","autores","ano", "editora","edicao","idioma"};
            csvWriter.writeNext(coluna);
	    	
	    	for(Livro Livro: livros) {
	    		String id = Livro.getIdLivro();
	    		String titulo = Livro.getTitulo();
	    		String autores = Livro.getAutores();
	    		String ano = Livro.getAno();
	    		String editora = Livro.getEditora();
	    		String edicao = Livro.getEdição();
	    		String idioma = Livro.getIdioma();
	    		String[] row = {id,titulo,autores,ano,editora,edicao,idioma};
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
