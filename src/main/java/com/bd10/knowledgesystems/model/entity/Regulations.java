package com.bd10.knowledgesystems.model.entity;

/**
 * @author 王青
 * @version V1.0
 * @Project: 法规
 * @Package com.bd10.knowledgesystems.model.entity
 * @date 2020/2/11 21:27 星期二
 */
public class Regulations {

    private   int  regulations_id;
    private  int regulations_part_no;
    private   String regulations_part_no_alias;
    private    String regulations_version;
    private   String  regulations_name;
    private   int regulations_show_status;
    private   String  regulations_icon_path;
    private    String  regulations_pdf_name;
    private String     regulations_pdf_path;
    private   String  regulations_version_explain;
    private  String   regulations_createtime;
    private   int  classify_foreign_key;//所属的类型

    public int getClassify_foreign_key() {
        return classify_foreign_key;
    }

    public void setClassify_foreign_key(int classify_foreign_key) {
        this.classify_foreign_key = classify_foreign_key;
    }

    public int getRegulations_id() {
        return regulations_id;
    }

    public void setRegulations_id(int regulations_id) {
        this.regulations_id = regulations_id;
    }

    public int getRegulations_part_no() {
        return regulations_part_no;
    }

    public void setRegulations_part_no(int regulations_part_no) {
        this.regulations_part_no = regulations_part_no;
    }

    public String getRegulations_part_no_alias() {
        return regulations_part_no_alias;
    }

    public void setRegulations_part_no_alias(String regulations_part_no_alias) {
        this.regulations_part_no_alias = regulations_part_no_alias;
    }

    public String getRegulations_version() {
        return regulations_version;
    }

    public void setRegulations_version(String regulations_version) {
        this.regulations_version = regulations_version;
    }

    public String getRegulations_name() {
        return regulations_name;
    }

    public void setRegulations_name(String regulations_name) {
        this.regulations_name = regulations_name;
    }

    public int getRegulations_show_status() {
        return regulations_show_status;
    }

    public void setRegulations_show_status(int regulations_show_status) {
        this.regulations_show_status = regulations_show_status;
    }

    public String getRegulations_icon_path() {
        return regulations_icon_path;
    }

    public void setRegulations_icon_path(String regulations_icon_path) {
        this.regulations_icon_path = regulations_icon_path;
    }

    public String getRegulations_pdf_name() {
        return regulations_pdf_name;
    }

    public void setRegulations_pdf_name(String regulations_pdf_name) {
        this.regulations_pdf_name = regulations_pdf_name;
    }

    public String getRegulations_pdf_path() {
        return regulations_pdf_path;
    }

    public void setRegulations_pdf_path(String regulations_pdf_path) {
        this.regulations_pdf_path = regulations_pdf_path;
    }

    public String getRegulations_version_explain() {
        return regulations_version_explain;
    }

    public void setRegulations_version_explain(String regulations_version_explain) {
        this.regulations_version_explain = regulations_version_explain;
    }

    public String getRegulations_createtime() {
        return regulations_createtime;
    }

    public void setRegulations_createtime(String regulations_createtime) {
        this.regulations_createtime = regulations_createtime;
    }

    @Override
    public String toString() {
        return "Regulations{" +
                "regulations_id=" + regulations_id +
                ", regulations_part_no=" + regulations_part_no +
                ", regulations_part_no_alias='" + regulations_part_no_alias + '\'' +
                ", regulations_version='" + regulations_version + '\'' +
                ", regulations_name='" + regulations_name + '\'' +
                ", regulations_show_status=" + regulations_show_status +
                ", regulations_icon_path='" + regulations_icon_path + '\'' +
                ", regulations_pdf_name='" + regulations_pdf_name + '\'' +
                ", regulations_pdf_path='" + regulations_pdf_path + '\'' +
                ", regulations_version_explain='" + regulations_version_explain + '\'' +
                ", regulations_createtime='" + regulations_createtime + '\'' +
                '}';
    }
}
