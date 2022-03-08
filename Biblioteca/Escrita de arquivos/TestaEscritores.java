package br.usp.ime.mac321.ep2.ex2;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestaEscritores {
	List<Usuario> usuarios;
	List<Livro> livros;
	List<Exemplar> exemplares;
	List<Emprestimo> emprestimos;
	
	@Test
	public void testaLivros() {
	    LeitorDeCsv leitor = new LeitorDeCsv();
	    EscritorDeArquivosLivros a = new EscritorDeArquivosLivros();
		
		livros = leitor.getAllLivros("livros.csv");
			
		livros.add(new Livro("2508Z","Código Limpo","Robert C. Martin","1990","ALTA BOOKS","1","português"));
	    
		a.escrever(livros, "livros_atual_ex2.csv");
		
		livros = leitor.getAllLivros("livros_atual_ex2.csv");
	    
		assertEquals(4, livros.size());
	}
	
	@Test
	public void testaExemplares() {
		LeitorDeCsv leitor = new LeitorDeCsv();
	    EscritorDeArquivosExemplares a = new EscritorDeArquivosExemplares();
	    
	    exemplares = leitor.getAllExemplares("exemplares.csv");
	    
	    exemplares.add(new Exemplar("E007","5080Z"));
	    
	    a.escrever(exemplares,"exemplares_atual_ex2.csv");
	    
	    exemplares = leitor.getAllExemplares("exemplares_atual_ex2.csv");
	    
	    assertEquals(7, exemplares.size());
	}
	
	@Test
	public void testaUsuarios() {
		LeitorDeCsv leitor = new LeitorDeCsv();
	    EscritorDeArquivosUsuarios a = new EscritorDeArquivosUsuarios();
	    
	    usuarios = leitor.getAllUsuarios("usuarios.csv");
	    
	    usuarios.add(new Usuario("164252507-39","João da Silva"));
	    
	    a.escrever(usuarios,"usuarios_atual_ex2.csv");
	    
	    usuarios = leitor.getAllUsuarios("usuarios_atual_ex2.csv");
	    
	    assertEquals(3, usuarios.size());
	}
	
	@Test
	public void testaEmprestimos() {
		LeitorDeCsv leitor = new LeitorDeCsv();                        
		EscritorDeArquivosEmprestimos a = new EscritorDeArquivosEmprestimos();
		
        emprestimos = leitor.getAllEmprestimos("emprestimos.csv");
        
        emprestimos.add(new Emprestimo("164252507-39","E004","24/07/21","10/08/21","09/08/21"));
		
		a.escrever(emprestimos,"emprestimos_atual_ex2.csv");
		
		emprestimos = leitor.getAllEmprestimos("emprestimos_atual_ex2.csv");
		
		assertEquals(4, emprestimos.size());
	}
}
  
/** LeitorDeCsv leitor = new LeitorDeCsv();                     
	  
                **/
/**
		 **/