package com.bd10.knowledgesystems.model.entity;

/**
 * @author 王青
 * @version V1.0
 * @Project: 咨询表
 * @Package com.bd10.knowledgesystems.model.entity
 * @date 2020/2/13 14:37 星期四
 */
public class consult {

    private int  consult_id;  //咨询的id
//    private int user_foreign_key;//关联用户的主键
    private int  clause_foreign_key; //关联条款的主键
    private String  consult_content;//咨询的内容
    private int   consult_delete_status;  //1  正常  2  删除
    private String consult_createtime;  //咨询的时间

    private String consult_name;//咨询人姓名
    private String consult_phone;//咨询人手机号
    private String consult_email;//邮箱
    private String consult_wechat;//微信号
    private  String consult_work;

    public String getConsult_work() {
        return consult_work;
    }

    public void setConsult_work(String consult_work) {
        this.consult_work = consult_work;
    }

    public String getConsult_name() {
        return consult_name;
    }

    public void setConsult_name(String consult_name) {
        this.consult_name = consult_name;
    }

    public String getConsult_phone() {
        return consult_phone;
    }

    public void setConsult_phone(String consult_phone) {
        this.consult_phone = consult_phone;
    }

    public String getConsult_email() {
        return consult_email;
    }

    public void setConsult_email(String consult_email) {
        this.consult_email = consult_email;
    }

    public String getConsult_wechat() {
        return consult_wechat;
    }

    public void setConsult_wechat(String consult_wechat) {
        this.consult_wechat = consult_wechat;
    }

    public int getConsult_id() {
        return consult_id;
    }

    public void setConsult_id(int consult_id) {
        this.consult_id = consult_id;
    }


    public int getClause_foreign_key() {
        return clause_foreign_key;
    }

    public void setClause_foreign_key(int clause_foreign_key) {
        this.clause_foreign_key = clause_foreign_key;
    }

    public String getConsult_content() {
        return consult_content;
    }

    public void setConsult_content(String consult_content) {
        this.consult_content = consult_content;
    }

    public int getConsult_delete_status() {
        return consult_delete_status;
    }

    public void setConsult_delete_status(int consult_delete_status) {
        this.consult_delete_status = consult_delete_status;
    }

    public String getConsult_createtime() {
        return consult_createtime;
    }

    public void setConsult_createtime(String consult_createtime) {
        this.consult_createtime = consult_createtime;

    }

    @Override
    public String toString() {
        return "consult{" +
                "consult_id=" + consult_id +
                ", clause_foreign_key=" + clause_foreign_key +
                ", consult_content='" + consult_content + '\'' +
                ", consult_delete_status=" + consult_delete_status +
                ", consult_createtime='" + consult_createtime + '\'' +
                '}';
    }
}
