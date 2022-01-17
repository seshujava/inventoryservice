package in.cognitivzen.inventoryservice.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionMapping {
	
	@ExceptionHandler(value=MyResourceNotFoundException.class)
	public ResponseEntity<ExceptionResponse> handleNoDataFound(MyResourceNotFoundException nfd) throws RuntimeException{
		ExceptionResponse er=new ExceptionResponse();
		er.setErrorCode("Err102");
		er.setErrorMsg("Invalid Item ID");
		er.setErrorDate(LocalDateTime.now());
		return new ResponseEntity<>(er,HttpStatus.BAD_REQUEST);
	}
}
