package br.usp.ime.mac321.ep2.ex2;

public class Livro {
	private String IdLivro;
	private String Titulo;
	private String Autores;
	private String Ano;
	private String Editora;
	private String Edição;
	private String Idioma;
	
	public Livro(String id, String titulo, String autores, String ano, String  editora, String  edicao, String idioma) {
		this.IdLivro = id;
		this.Titulo = titulo;
		this.Autores = autores;
		this.Ano = ano;
		this.Editora = editora;
		this.Edição = edicao;
		this.Idioma = idioma;
	}

	public String getIdLivro() {
		return IdLivro;
	}

	public void setIdLivro(String idLivro) {
		IdLivro = idLivro;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getAutores() {
		return Autores;
	}

	public void setAutores(String autores) {
		Autores = autores;
	}

	public String getAno() {
		return Ano;
	}

	public void setAno(String ano) {
		Ano = ano;
	}

	public String getEditora() {
		return Editora;
	}

	public void setEditora(String editora) {
		Editora = editora;
	}

	public String getEdição() {
		return Edição;
	}

	public void setEdição(String edição) {
		Edição = edição;
	}

	public String getIdioma() {
		return Idioma;
	}

	public void setIdioma(String idioma) {
		Idioma = idioma;
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
		get[5] = Edição;
		get[6] = Idioma;
		return get;
	}

}

