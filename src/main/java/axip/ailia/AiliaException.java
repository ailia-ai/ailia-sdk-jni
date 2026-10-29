/* Copyright 2018-2021 AXELL CORPORATION */
/* Updated July 28, 2021*/

package axip.ailia;

/**
* Exception object
*/
public class AiliaException extends Exception {
	private AiliaStatus status;

	public AiliaException(String message) {
		super(message);
		this.status = AiliaStatus.OTHER_ERROR;
	}

	public AiliaException(String message, int code) {
		super(message);
		this.status = AiliaStatus.fromInt(code);
	}

	public AiliaException(String message, AiliaStatus status) {
		super(message);
		this.status = status;
	}

	public AiliaStatus getStatus() {
		return this.status;
	}
}
