package fr.doriandelaval.exception;

import fr.doriandelaval.controller.RestApiController;

/**
 * classe d'erreur pour l'api rest des clients permets de créer des erreurs avec
 * un status ,message,timestamp
 * 
 * classe utilisée dans le @HandlerException du {@link RestApiController} qui
 * renvoie une liste d'erreurs de ce type
 * 
 * @author delaval
 *
 */
public class ClientErrorResponse {

	private int status;
	private String message;
	private long timeStamp;

	public ClientErrorResponse() {

	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

}
