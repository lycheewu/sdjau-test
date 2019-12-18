package com.sdjzu.test.exception;

import lombok.Data;

/**
 * @author wangqimen
 * @date 2019/06/25
 * @param <T>
 */
@Data
public class ApiResult<T> {
	private Boolean success;
	private T data;
	private ErrorObject error;

	public ApiResult() {
		this.success = Boolean.TRUE;
	}
	
	public ApiResult(T data) {
		this.success = Boolean.TRUE;
		this.data = data;
	}
	
	public ApiResult(ErrorObject error) {
		this.success = Boolean.FALSE;
		this.error = new ErrorObject(error);
	}
	
	public ApiResult(ErrorObject error, String reason) {
		this.success = Boolean.FALSE;
		this.error = new ErrorObject(error);
		this.error.setMsg(reason);
	}
}
