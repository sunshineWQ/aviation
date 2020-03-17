package com.bd10.knowledgesystems.model.entity;

/**
 * @author 王青
 * @version V1.0
 * @Project: 用户
 * @Package com.bd10.knowledgesystem.model.entity
 * @date 2020/2/11 18:24 星期二
 */
public class User {

    private   int  user_id;
    private   String user_name;
    private   String  user_phone;
    private  int user_sex;
    private int user_type;   // 1  免费  2  付费
    private   String user_createtime;
    private  String user_delete_status;
    private  String  user_updatetime;
    private  String user_password;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public int getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(int user_sex) {
        this.user_sex = user_sex;
    }

    public int getUser_type() {
        return user_type;
    }

    public void setUser_type(int user_type) {
        this.user_type = user_type;
    }

    public String getUser_createtime() {
        return user_createtime;
    }

    public void setUser_createtime(String user_createtime) {
        this.user_createtime = user_createtime;
    }

    public String getUser_delete_status() {
        return user_delete_status;
    }

    public void setUser_delete_status(String user_delete_status) {
        this.user_delete_status = user_delete_status;
    }

    public String getUser_updatetime() {
        return user_updatetime;
    }

    public void setUser_updatetime(String user_updatetime) {
        this.user_updatetime = user_updatetime;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_sex=" + user_sex +
                ", user_type=" + user_type +
                ", user_createtime='" + user_createtime + '\'' +
                ", user_delete_status='" + user_delete_status + '\'' +
                ", user_updatetime='" + user_updatetime + '\'' +
                ", user_password='" + user_password + '\'' +
                '}';
    }
}
