package br.usp.ime.mac321.ep2.ex1;

public class Livro {
	private String IdLivro;
	private String Titulo;
	private String Autores;
	private String Ano;
	private String Editora;
	private String Edi��o;
	private String Idioma;
	
	public Livro(String id, String titulo, String autores, String ano, String  editora, String  edicao, String idioma) {
		this.IdLivro = id;
		this.Titulo = titulo;
		this.Autores = autores;
		this.Ano = ano;
		this.Editora = editora;
		this.Edi��o = edicao;
		this.Idioma = idioma;
	}
	public String[] getAll() {	//retorna um vetor com todos os atributos do livro para facilitar varredura e comparacao
		String[] get = new String[7];
		for(int i = 0; i < 7; i++)
			get[i]="";
		get[0] = IdLivro;
		get[1] = Titulo;
		get[2] = Autores;
		get[3] = Ano;
		get[4] = Editora;
		get[5] = Edi��o;
		get[6] = Idioma;
		return get;
	}

}
