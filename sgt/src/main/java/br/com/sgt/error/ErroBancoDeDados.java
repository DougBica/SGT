package br.com.sgt.error;

public class ErroBancoDeDados  extends RuntimeException{

	public ErroBancoDeDados(String string) {
		super(string);
	}

}
