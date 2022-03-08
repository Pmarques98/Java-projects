package br.usp.ime.mac321.ep2.ex1;

public class Emprestimo {
	private String CPF;
	private String IdExemplar;
	private String DataEmprestimo;
	private String DataRetorno;
	private String DataRetornado;

	public Emprestimo(String cpf, String idExemp, String dEmprestimo, String dRetorno, String dRetornado) {
		this.CPF = cpf;
		this.DataEmprestimo = dEmprestimo;
		this.DataRetornado = dRetornado;
		this.DataRetorno = dRetorno;
		this.IdExemplar = idExemp;
	}
	
	public String[] getAll() {	//retorna um vetor com todos os atributos do livro para facilitar varredura e comparacao
		String[] get = new String[6];
		for(int i = 0; i < 6; i++)
			get[i]="";
		get[0] = CPF;
		get[1] = IdExemplar;
		get[2] = DataEmprestimo;
		get[3] = DataRetorno;
		get[4] = DataRetornado;
		
		return get;
	}
}
