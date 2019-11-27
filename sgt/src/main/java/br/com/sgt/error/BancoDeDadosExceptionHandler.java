package br.com.sgt.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BancoDeDadosExceptionHandler {
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(ErroBancoDeDados.class)
	public final ExceptionResponse handleAllBancoDeDadosExceptions(ErroBancoDeDados ex) {
		ExceptionResponse error = new ExceptionResponse();
		error.setCode(ex.getCod());
		error.setMessage(ex.getMessage());
		return error;
	}
}
