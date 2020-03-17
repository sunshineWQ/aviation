package com.bd10.knowledgesystems.util;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.util
 * @date 2020/2/24 19:30 星期一
 */
public enum  CommonEnum {
    SUCCESS("200","success"),
    NOT_FOUND("400","file  not found"),
    SERVER_ERROR("500","server error")
    ;

    private String  code;
    private String msg;

    CommonEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
