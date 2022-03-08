package br.usp.ime.mac321.ep2.ex2;

public class Usuario {
	private String Nome;
	private String CPF;
	
	public Usuario(String nome, String cpf) {
		this.Nome = nome;
		this.CPF = cpf;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String[] getAll() {	//retorna um vetor com todos os atributos do livro para facilitar varredura e comparacao
		String[] get = new String[2];
		for(int i = 0; i < 2; i++)
			get[i]="";
		get[0] = Nome;
		get[1] = CPF;
		return get;
	}
}
