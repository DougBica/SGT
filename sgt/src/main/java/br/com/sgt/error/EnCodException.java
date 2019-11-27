package br.com.sgt.error;

public enum EnCodException {
	
	COD001("Login não permitido"),
	COD002("Usuário não encontrado"),
	COD003("conhecimentos não encontrados");
	
	private final String msg;
	
	private EnCodException(final String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}

}
