package br.com.sgt.error;

public class ErroBancoDeDados  extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EnCodException cod;

	public ErroBancoDeDados(EnCodException cod) {
		super(cod.getMsg());
		this.cod = cod;
	}
	
	
	public EnCodException getCod() {
		return cod;
	}
	
}
