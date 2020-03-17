package com.bd10.knowledgesystems.model.entity;

/**
 * @author 王青
 * @version V1.0
 * @Project: 网站设置类
 * @Package com.bd10.knowledgesystems.model.entity
 * @date 2020/2/15 09:08 星期六
 */
public class WebSeting {
    private int  web_id;
    private int web_status;
    private String web_title;
    private String web_domain_name;
    private String web_logo_path;
    private String web_email;
    private int language;

    public int getWeb_id() {
        return web_id;
    }

    public int getWeb_status() {
        return web_status;
    }

    public void setWeb_status(int web_status) {
        this.web_status = web_status;
    }

    public void setWeb_id(int web_id) {
        this.web_id = web_id;
    }
    public String getWeb_title() {
        return web_title;
    }

    public void setWeb_title(String web_title) {
        this.web_title = web_title;
    }

    public String getWeb_domain_name() {
        return web_domain_name;
    }

    public void setWeb_domain_name(String web_domain_name) {
        this.web_domain_name = web_domain_name;
    }

    public String getWeb_logo_path() {
        return web_logo_path;
    }

    public void setWeb_logo_path(String web_logo_path) {
        this.web_logo_path = web_logo_path;
    }

    public String getWeb_email() {
        return web_email;
    }

    public void setWeb_email(String web_email) {
        this.web_email = web_email;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }
}
