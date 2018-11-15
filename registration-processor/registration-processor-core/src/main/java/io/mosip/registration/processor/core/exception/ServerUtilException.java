package io.mosip.registration.processor.core.exception;

import java.net.UnknownHostException;

import io.mosip.kernel.core.exception.BaseUncheckedException;
import io.mosip.registration.processor.core.exception.errorcodes.AbstractVerticleErrorCodes;

/**
 * The Class ServerUtilException.
 */
public class ServerUtilException extends BaseUncheckedException {

	/**
	 * The Constant serialVersionUID.
	 *
	 * @author M1048860
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new server util exception.
	 */
	public ServerUtilException() {
		super();
	}

	/**
	 * Instantiates a new server util exception.
	 *
	 * @param e
	 *            the e
	 */
	public ServerUtilException(UnknownHostException e) {
		super(AbstractVerticleErrorCodes.IIS_EPU_ATU_UNKNOWN_EXCEPTION, e.toString());
	}

}
