/* Copyright 2018-2021 AXELL CORPORATION */
/* Updated July 28, 2021*/

package axip.ailia;

/**
* Profile mode for inference
*/
public enum AiliaProfileMode {
	/**
	 * Disable profile mode
	 */
	PROFILE_DISABLE(0),
	/**
	 * Measure the processing time for each layer.
	 * If you infer multiple times, the average value excluding the first execution is saved.
	 */
	PROFILE_AVERAGE(1),
	/**
	 * Default profile mode (same as {@link #PROFILE_DISABLE})
	 */
	PROFILE_DEFAULT(0);

    private int value;
    private AiliaProfileMode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
