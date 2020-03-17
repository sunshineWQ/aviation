package com.bd10.knowledgesystems.model.entity;

/**   用来给前端做反馈
 * @author 王青
 * @version V1.0
 * @Project: demo-login
 * @Package com.bd10.demologin.entity
 * @date 2020/1/5 11:05 星期日
 */
    public class Result {

        private   Integer  code;
        private  String  message;
        private  Object[]  data;
        private  String seesionId;

    public String getSeesionId() {
        return seesionId;
    }

    public void setSeesionId(String seesionId) {
        this.seesionId = seesionId;
    }

    public Object[] getData() {
        return data;
    }

    public void setData(Object[] data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
