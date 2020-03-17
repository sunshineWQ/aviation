package com.bd10.knowledgesystems.model.dto;

/**
 * @author 王青
 * @version V1.0
 * @Project: 邮箱smtp设置
 * @Package com.bd10.knowledgesystems.model.dto
 * @date 2020/2/16 14:40 星期日
 */
public class SmtpEmail {
    private   int smtp_id;
    private  String smtp_email;
    private   String smtp_server;
    private String   smtp_username;
    private String  smtp_password;
    private int       number;
    private String login_type;

    public SmtpEmail() {
    }

    public SmtpEmail(int smtp_id, String smtp_email, String smtp_server, String smtp_username, String smtp_password, int number, String login_type) {
        this.smtp_id = smtp_id;
        this.smtp_email = smtp_email;
        this.smtp_server = smtp_server;
        this.smtp_username = smtp_username;
        this.smtp_password = smtp_password;
        this.number = number;
        this.login_type = login_type;
    }

    public int getSmtp_id() {
        return smtp_id;
    }

    public void setSmtp_id(int smtp_id) {
        this.smtp_id = smtp_id;
    }

    public String getSmtp_email() {
        return smtp_email;
    }

    public void setSmtp_email(String smtp_email) {
        this.smtp_email = smtp_email;
    }

    public String getSmtp_server() {
        return smtp_server;
    }

    public void setSmtp_server(String smtp_server) {
        this.smtp_server = smtp_server;
    }

    public String getSmtp_username() {
        return smtp_username;
    }

    public void setSmtp_username(String smtp_username) {
        this.smtp_username = smtp_username;
    }

    public String getSmtp_password() {
        return smtp_password;
    }

    public void setSmtp_password(String smtp_password) {
        this.smtp_password = smtp_password;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLogin_type() {
        return login_type;
    }

    public void setLogin_type(String login_type) {
        this.login_type = login_type;
    }

    @Override
    public String toString() {
        return "SmtpEmail{" +
                "smtp_id=" + smtp_id +
                ", smtp_email='" + smtp_email + '\'' +
                ", smtp_server='" + smtp_server + '\'' +
                ", smtp_username='" + smtp_username + '\'' +
                ", smtp_password='" + smtp_password + '\'' +
                ", number=" + number +
                ", login_type='" + login_type + '\'' +
                '}';
    }
}
