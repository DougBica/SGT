package br.com.sgt.error;

public class ExceptionResponse {
	private EnCodException code;
	private String message;

	public EnCodException getCode() {
		return code;
	}

	public void setCode(EnCodException code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
