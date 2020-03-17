package com.bd10.knowledgesystems.model.entity;

/**
 * @author 王青
 * @version V1.0
 * @Project: 管理员
 * @Package com.bd10.knowledgesystems.dao.users
 * @date 2020/2/11 21:02 星期二
 */
public class Admin {

    private int  admin_id;
    private String admin_phone;
    private String admin_name;
    private  String admin_createtime;
    private  int admin_delete_status;   //1  正常  2  删除
    private  String   admin_password;
    private  int  admin_type;  //  1  普通  2  超级

    public int getAdmin_id() {

        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_phone() {
        return admin_phone;
    }

    public void setAdmin_phone(String admin_phone) {
        this.admin_phone = admin_phone;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_createtime() {
        return admin_createtime;
    }

    public void setAdmin_createtime(String admin_createtime) {
        this.admin_createtime = admin_createtime;
    }

    public int getAdmin_delete_status() {
        return admin_delete_status;
    }

    public void setAdmin_delete_status(int admin_delete_status) {
        this.admin_delete_status = admin_delete_status;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public int getAdmin_type() {
        return admin_type;
    }

    public void setAdmin_type(int admin_type) {
        this.admin_type = admin_type;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "admin_id=" + admin_id +
                ", admin_phone='" + admin_phone + '\'' +
                ", admin_name='" + admin_name + '\'' +
                ", admin_createtime='" + admin_createtime + '\'' +
                ", admin_delete_status=" + admin_delete_status +
                ", admin_password='" + admin_password + '\'' +
                ", admin_type=" + admin_type +
                '}';
    }
}
