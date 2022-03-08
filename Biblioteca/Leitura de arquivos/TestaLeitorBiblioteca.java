package br.usp.ime.mac321.ep2.ex1;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class TestaLeitorBiblioteca {

	List<Usuario> usuarios;
	List<Livro> livros;
	List<Exemplar> exemplares;
	List<Emprestimo> emprestimos;
	LeitorBibliotecaDAO leitor;

	@BeforeEach 	//mudei de All para Each pois o All não estava nem rodando
	public void setUp(){
		leitor = new LeitorDeCsv();
	}
	
	@Test
	public void testLivros(){
		livros = leitor.getAllLivros("livros.csv");
		assertEquals(3, livros.size());
	}
	@Test
	public void testExemplares(){
		livros = leitor.getAllLivros("livros.csv");
		exemplares = leitor.getAllExemplares("exemplares.csv");
		assertEquals(6, exemplares.size());
	}
	
	@Test
	public void testUsuarios(){
		usuarios = leitor.getAllUsuarios("usuarios.csv");
		assertEquals(2, usuarios.size());
	}
	
	@Test
	public void testEmprestimos(){
		livros = leitor.getAllLivros("livros.csv");
		usuarios = leitor.getAllUsuarios("usuarios.csv");
		exemplares = leitor.getAllExemplares("exemplares.csv");
		emprestimos = leitor.getAllEmprestimos("emprestimos.csv");
		assertEquals(3, emprestimos.size());
	}
	@Test
	public void testLivrosComRepeticao(){
		livros = leitor.getAllLivros("livrosComRepetição.csv");
		assertEquals(3, livros.size());
	}
	@Test
	public void testExemplaresComErro(){
		livros = leitor.getAllLivros("livros.csv");
		exemplares = leitor.getAllExemplares("exemplaresComErro.csv");
		usuarios = leitor.getAllUsuarios("usuarios.csv");
		assertEquals(5, exemplares.size());
	}
	@Test
	public void testEmprestimosComErro(){
		livros = leitor.getAllLivros("livros.csv");
		exemplares = leitor.getAllExemplares("exemplares.csv");
		emprestimos = leitor.getAllEmprestimos("emprestimosComErro.csv");
		assertEquals(2, emprestimos.size());
	}
}
