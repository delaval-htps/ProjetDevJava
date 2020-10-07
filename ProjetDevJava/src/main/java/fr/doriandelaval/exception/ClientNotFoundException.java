package fr.doriandelaval.exception;

import fr.doriandelaval.controller.RestApiController;

/**
 * classe de definition d'exception concernant un client non trouvé utilisé pour
 * lever (throw) une exception notamment dans le {@link RestApiController}
 * 
 * @author delaval
 *
 */
public class ClientNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClientNotFoundException(String message) {
		super(message);
	}

	public ClientNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ClientNotFoundException(Throwable cause) {
		super(cause);
	}
}
