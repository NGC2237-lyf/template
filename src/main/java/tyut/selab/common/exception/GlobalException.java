
package tyut.selab.geoguard.common.exception;

import tyut.selab.geoguard.common.utils.MessageUtils;

/**
 * 自定义异常
 */
public class GlobalException extends RuntimeException {
	private static final long serialVersionUID = 1L;

    private int code;
	private String msg;

	public GlobalException(int code) {
		this.code = code;
		this.msg = MessageUtils.getMessage(code);
	}

	public GlobalException(int code, String... params) {
		this.code = code;
		this.msg = MessageUtils.getMessage(code, params);
		}

	public GlobalException(int code, Throwable e) {
		super(e);
		this.code = code;
		this.msg = MessageUtils.getMessage(code);
	}

	public GlobalException(int code, Throwable e, String... params) {
		super(e);
		this.code = code;
		this.msg = MessageUtils.getMessage(code, params);
	}

	public GlobalException(String msg) {
		super(msg);
		this.code = ErrorCode.INTERNAL_SERVER_ERROR;
		this.msg = msg;
	}

	public GlobalException(String msg, Throwable e) {
		super(msg, e);
		this.code = ErrorCode.INTERNAL_SERVER_ERROR;
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
