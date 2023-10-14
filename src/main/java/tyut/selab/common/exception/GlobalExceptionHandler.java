package tyut.selab.geoguard.common.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import tyut.selab.geoguard.common.utils.Result;


/**
 * 异常处理器
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);


	/**
	 * 处理自定义异常
	 */
	@ExceptionHandler(GlobalException.class)
	public Result handleRenException(GlobalException ex){
		Result result = new Result();
		result.error(ex.getCode(), ex.getMsg());
		return result;
	}

	@ExceptionHandler(DuplicateKeyException.class)
	public Result handleDuplicateKeyException(DuplicateKeyException ex){
		Result result = new Result();
		result.error(ErrorCode.DB_RECORD_EXISTS);
		return result;
	}

	@ExceptionHandler(Exception.class)
	public Result handleException(Exception ex){
		logger.error(ex.getMessage(), ex);

		saveLog(ex);

		return new Result().error();
	}

	/**
	 * 保存异常日志
	 */
	private void saveLog(Exception ex){

	}
}
