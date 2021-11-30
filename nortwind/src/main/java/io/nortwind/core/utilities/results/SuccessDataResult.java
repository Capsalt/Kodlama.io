package io.nortwind.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {

	
	public SuccessDataResult(T data, boolean success, String message) {
		super(data, true, message);
		
	}
	
	

}
