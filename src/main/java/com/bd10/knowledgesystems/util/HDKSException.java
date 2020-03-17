package com.bd10.knowledgesystems.util;

/**
 * @author 王青
 * @version V1.0
 * @Project: 自己的异常
 * @Package com.bd10.knowledgesystems.util
 * @date 2020/2/25 15:29 星期二
 */
public class HDKSException   extends   RuntimeException{

    private static   final  long   serialVersionUID=1L;
    protected  String errorCode;
    protected   String errorMsg;

    public HDKSException() {
        super();
    }

    public HDKSException(BaseErrorInfo  baseErrorInfo){
        super(baseErrorInfo.getCode());
        this.errorCode=baseErrorInfo.getCode();
        this.errorMsg=baseErrorInfo.getMsg();
    }
    public HDKSException(BaseErrorInfo baseErrorInfo,Throwable cause){
        super(baseErrorInfo.getCode(),cause);
        this.errorCode=baseErrorInfo.getCode();
        this.errorMsg=baseErrorInfo.getMsg();
    }
    public HDKSException(String errorCode,String errorMsg){
        super(errorMsg);
        this.errorCode=errorCode;
        this.errorMsg=errorMsg;
    }
    public HDKSException(String errorMsg){
        super(errorMsg);
        this.errorMsg=errorMsg;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }



}
