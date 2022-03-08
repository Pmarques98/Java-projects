package br.usp.ime.mac321.ep2.ex1;

import java.util.List;

public class VerificaExecao {
	List<Usuario> usuarios;
	List<Livro> livros;
	List<Exemplar> exemplares;
	List<Emprestimo> emprestimos;
	
	public VerificaExecao(List<Usuario> usuarios, List<Livro> livros, List<Exemplar> exemplares, List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
		this.exemplares = exemplares;
		this.livros = livros;
		this.usuarios = usuarios;
	}
	public void verificaRepeticao() throws Execao{
		//verifica os livros
				for(int i = 0; i < livros.size(); i++) {	//percorre a lista duas vezes comparando os elementos
					for(int j = i + 1; j < livros.size(); j++) {
						int repetido = 0;
						for(int k = 0; k < 6; k++) {
							if((livros.get(i).getAll()[k]).equals(livros.get(j).getAll()[k]) ){	//verifica repeticoes
								repetido++;
							}
						}
						if(repetido >=6) {
							System.out.println("Execao Repeticao");
							String culpado = livros.get(i).getAll()[0];
							livros.remove(i);
							throw new Execao(culpado, "Repetido");
						}
					}
				}
	}
		//verifica o Exemplar
	public void verificaExemplar() throws Execao{
		for(int i = 0; i < exemplares.size(); i++) {
			boolean correto = false;
			for(int j = 0; j < livros.size(); j++) {
					if((livros.get(j).getAll()[0]).equals(exemplares.get(i).getAll()[1])) {	//verifica se o exemplar esta certo
						correto = true;		
					}
			}
			if(correto == false) {
				System.out.println("Execao Exemplar");
				String culpado = exemplares.get(i).getAll()[0];
				exemplares.remove(i);
				throw new Execao(culpado,"Exemplar");//joga execao se o exemplar nao bter com um livro
			}
		}
	}
	
	public void verificaUsuario() throws Execao{
		//verifica emprestimos com usuarios
				for(int i = 0; i < emprestimos.size(); i++) {
					boolean correto = false;
					for(int j = 0; j < usuarios.size(); j++) {
							if((emprestimos.get(i).getAll()[0]).equals(usuarios.get(j).getAll()[1])) {//verifica existencia do usuario
								correto = true;											
							}
					}
					if(correto == false) {
						System.out.println("Execao Usuario");
						String culpado = emprestimos.get(i).getAll()[0];
						emprestimos.remove(i);
						throw new Execao(culpado, "Usuario");
					}
				}
	}
	
	public void verificaEmprestimo() throws Execao{
		//verifica emprestimos com exemplares
		for(int i = 0; i < emprestimos.size(); i++) {
			boolean correto = false;
			for(int j = 0; j < exemplares.size(); j++) {
					if((emprestimos.get(i).getAll()[1]).equals(exemplares.get(j).getAll()[0])) {//verifica existencia do exemplar
						correto = true;							
					}
			}
			if(correto == false) {
				System.out.println("Execao emprestimo");
				String culpado = emprestimos.get(i).getAll()[1];
				emprestimos.remove(i);
				throw new Execao(culpado, "Emprestimo");
			}
		}
	}
}
