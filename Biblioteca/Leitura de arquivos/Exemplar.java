package br.usp.ime.mac321.ep2.ex1;

public class Exemplar {
	private String IdExemplar;
	private String IdLivro;

	public Exemplar(String idE, String idL) {
		this.IdExemplar = idE;
		this.IdLivro = idL;
	}
	public String[] getAll() {	//retorna um vetor com todos os atributos do livro para facilitar varredura e comparacao
		String[] get = new String[6];
		for(int i = 0; i < 6; i++)
			get[i]="";
		get[0] = IdExemplar;
		get[1] = IdLivro;
		
		return get;
	}
}
