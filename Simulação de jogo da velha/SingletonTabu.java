package br.ime.usp.mac321.ex2;

public class SingletonTabu {
	private volatile static SingletonTabu instance;

	  private SingletonTabu() {
		  int [][] tabuleiro = new int[3][3];
		  Jogo j = new Jogo(tabuleiro);
		  j.executar();
	  }

	  public static SingletonTabu getInstance() {
		  if(instance == null ) {
			instance  = new SingletonTabu();
		  }
		  return instance;
	}
}
