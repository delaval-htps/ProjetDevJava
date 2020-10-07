package fr.doriandelaval.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

	/**
	 * methode de gestion d'exception de client non trouvé
	 * 
	 * @param e une exception de type client not found
	 * @return la liste des erreurs associé de type {@link ClientErrorResponse}
	 */
	@ExceptionHandler
	public ResponseEntity<ClientErrorResponse> handlerException(ClientNotFoundException e) {

		ClientErrorResponse error = new ClientErrorResponse();

		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(e.getMessage());
		error.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<ClientErrorResponse>(error, HttpStatus.NOT_FOUND);

	}

	/**
	 * gestion des autres clients errors qui se passeraient
	 * 
	 * @param e exception de type Exception
	 * @return la liste des {@link ClientErrorResponse}
	 */
	@ExceptionHandler
	public ResponseEntity<ClientErrorResponse> handleException(Exception e) {
		ClientErrorResponse error = new ClientErrorResponse();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(e.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

}
