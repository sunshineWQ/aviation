package com.bd10.knowledgesystems.model.vo;

/**
 * @author 王青
 * @version V1.0
 * @Project:咨询表要展示的内容
 * @Package com.bd10.knowledgesystems.model.vo
 * @date 2020/2/13 14:40 星期四
 */
public class consoultVo {
    private  int consult_id;
    private  String  user_name;
    private   String  consult_content;
    private  String consult_createtime;
    private String  user_phone;

    public int getConsult_id() {
        return consult_id;
    }

    public void setConsult_id(int consult_id) {
        this.consult_id = consult_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getConsult_content() {
        return consult_content;
    }

    public void setConsult_content(String consult_content) {
        this.consult_content = consult_content;
    }

    public String getConsult_createtime() {
        return consult_createtime;
    }

    public void setConsult_createtime(String consult_createtime) {
        this.consult_createtime = consult_createtime;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    @Override
    public String toString() {
        return "consoultVo{" +
                "consult_id=" + consult_id +
                ", user_name='" + user_name + '\'' +
                ", consult_content='" + consult_content + '\'' +
                ", consult_createtime='" + consult_createtime + '\'' +
                ", user_phone='" + user_phone + '\'' +
                '}';
    }
}
