package br.usp.ime.mac321.ep2.ex2;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

	//O leitor é chamado para a leitura de um arquivo especifico (livro,exemplares,etc)
	//E ele retorna uma lista do tipo chamado com o conteudo do csv
public class LeitorDeCsv implements LeitorBibliotecaDAO{	
	private List<Livro> livros = new ArrayList<>();
	private List<Exemplar> exemplares = new ArrayList<>();
	private List<Usuario> usuarios = new ArrayList<>();
	private List<Emprestimo> emprestimos = new ArrayList<>();

	@Override
	public List<Livro> getAllLivros(String nomeArquivoLivros) {
		try {
			
		BufferedReader reader = new BufferedReader(new FileReader(nomeArquivoLivros));
		CSVReader csvReader = new CSVReader(reader);
		List<String[]> rows = csvReader.readAll();
		
		for(int i = 1; i < rows.size();i++) {	//leitura das linhas e colunas
			String row[] = rows.get(i);
			String id = row[0];
			String titulo = row[1];
			String autores = row[2];
			String ano = row[3];
			String  editora = row[4];
			String  edicao = row[5];
			String idioma = row[6];
			livros.add(new Livro(id,titulo,autores, ano, editora,  edicao, idioma));
		}
		reader.close();
		csvReader.close();
		}catch(Exception e) {
			e.getMessage();
		}
		return livros;
	}
	@Override
	public List<Exemplar> getAllExemplares(String nomeArquivoExemplares) {
		try {
			
		BufferedReader reader = new BufferedReader(new FileReader(nomeArquivoExemplares));
		CSVReader csvReader = new CSVReader(reader);
		List<String[]> rows2 = csvReader.readAll();
		
		for(int i = 1; i < rows2.size();i++) {
			String row[] = rows2.get(i);
			String idE = row[0];
			String idL = row[1];
			exemplares.add(new Exemplar(idE,idL));
		}
		reader.close();
		csvReader.close();
		}catch(Exception e) {
			e.getMessage();
		}
		return exemplares;
	}
	@Override
	public List<Usuario> getAllUsuarios(String nomeArquivoUsuarios) {
		try {
		BufferedReader reader = new BufferedReader(new FileReader(nomeArquivoUsuarios));
		CSVReader csvReader = new CSVReader(reader);
		List<String[]> rows3 = csvReader.readAll();
		
		for(int i = 1; i < rows3.size();i++) {
			String row[] = rows3.get(i);
			String nome = row[1];
			String cpf = row[0];
			usuarios.add(new Usuario(nome,cpf));
		}
		reader.close();
		csvReader.close();
		}catch(Exception e) {
			e.getMessage();
		}
		return usuarios;
	}
	@Override
	public List<Emprestimo> getAllEmprestimos(String nomeArquivoEmprestimos) {
		try {
		BufferedReader reader = new BufferedReader(new FileReader(nomeArquivoEmprestimos));
		CSVReader csvReader = new CSVReader(reader);
		List<String[]> rows4 = csvReader.readAll();
		
		for(int i = 1; i < rows4.size();i++) {
			String row[] = rows4.get(i);
			String cpf = row[0];
			String idExemp = row[1];
			String dEmprestimo = row[2];
			String  dRetorno = row[3];
			String  dRetornado = row[4];
			emprestimos.add(new Emprestimo(cpf, idExemp, dEmprestimo, dRetorno, dRetornado));
		}
		reader.close();
		csvReader.close();
		}catch(Exception e) {
			e.getMessage();
		}
		return emprestimos;
	}
}
