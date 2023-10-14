package tyut.selab.geoguard.common.exception;

public interface ErrorCode {
    /**
     * 内部服务器错误
     */
    int INTERNAL_SERVER_ERROR = 500;
    /**
     * 未经授权
     */
    int UNAUTHORIZED = 401;
    /**
     * 不能为null
     */
    int NOT_NULL = 10001;
    /**
     * 数据库记录不存在
     */
    int DB_RECORD_EXISTS = 10002;
    /**
     * 参数出错
     */
    int PARAMS_GET_ERROR = 10003;
    /**
     * 密码错误
     */
    int ACCOUNT_PASSWORD_ERROR = 10004;
    /**
     * 帐户禁用
     */
    int ACCOUNT_DISABLE = 10005;
    /**
     * 标识符不为空
     */
    int IDENTIFIER_NOT_NULL = 10006;
    /**
     * 验证码错误
     */
    int CAPTCHA_ERROR = 10007;

}
