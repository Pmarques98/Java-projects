package br.usp.ime.mac321.ep2.ex2;


@SuppressWarnings("serial")
public class Execao extends Exception{
	private String Culpado;
	private String Tipo;
	
	public Execao(String culpado,String tipo) {
		this.Culpado = culpado;
		this.Tipo = tipo;
	}
	@Override
	public String getMessage() {
		String mensagem = "";
		if(Tipo == "Repetido")
			mensagem = "O livro " + Culpado + " esta repetido";
		else if(Tipo == "Exemplar")
			mensagem = "Exemplar com Id incorreto: " + Culpado;
		else if(Tipo == "Usuario")
			mensagem = "Emprestimo para o cliente inesistente: "+Culpado;
		else if(Tipo == "Emprestimo")
			mensagem = "emprestimo de exempllar inexistente: "+ Culpado;
		else mensagem = "Erro inesperado";
		
		System.out.println(mensagem);
		
		return mensagem ;
	}

}
