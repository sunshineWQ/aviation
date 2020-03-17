package com.bd10.knowledgesystems.model.entity;

/**
 * @author 王青
 * @version V1.0
 * @Project: 条款
 * @Package com.bd10.knowledgesystems.model.entity
 * @date 2020/2/14 23:15 星期五
 */
public class Clause {
    private int  clause_id;//条款主键id
    private int   directory_foreign_key;//条款所在目录的外键
    private int clause_no;//条款的编号
    private String  clause_no_alias;//条款编号别名
    private String clause_version;//条款版本号
    private String   clause_title;//条款标题
    private  String clause_content;//条款的内容
    private  String  clause_antistop;//条款的关键词
    private  int clause_show_status;//条款的显示状态  1正常  2不显示   如果所在目录的显示状态是2  那么条款的状态就是2
    private  String     clause_createtime;//条款的创建时间
    private  String  clause_updatetime;
    private int regulation_foregin_key;//对应的法规的外键

    public int getRegulation_foregin_key() {
        return regulation_foregin_key;
    }

    public void setRegulation_foregin_key(int regulation_foregin_key) {
        this.regulation_foregin_key = regulation_foregin_key;
    }

    public int getClause_id() {
        return clause_id;
    }

    public void setClause_id(int clause_id) {
        this.clause_id = clause_id;
    }

    public int getDirectory_foreign_key() {
        return directory_foreign_key;
    }

    public void setDirectory_foreign_key(int directory_foreign_key) {
        this.directory_foreign_key = directory_foreign_key;
    }

    public int getClause_no() {
        return clause_no;
    }

    public void setClause_no(int clause_no) {
        this.clause_no = clause_no;
    }

    public String getClause_no_alias() {
        return clause_no_alias;
    }

    public void setClause_no_alias(String clause_no_alias) {
        this.clause_no_alias = clause_no_alias;
    }

    public String getClause_version() {
        return clause_version;
    }

    public void setClause_version(String clause_version) {
        this.clause_version = clause_version;
    }

    public String getClause_title() {
        return clause_title;
    }

    public void setClause_title(String clause_title) {
        this.clause_title = clause_title;
    }

    public String getClause_content() {
        return clause_content;
    }

    public void setClause_content(String clause_content) {
        this.clause_content = clause_content;
    }

    public String getClause_antistop() {
        return clause_antistop;
    }

    public void setClause_antistop(String clause_antistop) {
        this.clause_antistop = clause_antistop;
    }

    public int getClause_show_status() {
        return clause_show_status;
    }

    public void setClause_show_status(int clause_show_status) {
        this.clause_show_status = clause_show_status;
    }

    public String getClause_createtime() {
        return clause_createtime;
    }

    public void setClause_createtime(String clause_createtime) {
        this.clause_createtime = clause_createtime;
    }

    public String getClause_updatetime() {
        return clause_updatetime;
    }

    public void setClause_updatetime(String clause_updatetime) {
        this.clause_updatetime = clause_updatetime;
    }

    @Override
    public String toString() {
        return "Clause{" +
                "clause_id=" + clause_id +
                ", directory_foreign_key=" + directory_foreign_key +
                ", clause_no=" + clause_no +
                ", clause_no_alias='" + clause_no_alias + '\'' +
                ", clause_version='" + clause_version + '\'' +
                ", clause_title='" + clause_title + '\'' +
                ", clause_content='" + clause_content + '\'' +
                ", clause_antistop='" + clause_antistop + '\'' +
                ", clause_show_status=" + clause_show_status +
                ", clause_createtime='" + clause_createtime + '\'' +
                ", clause_updatetime='" + clause_updatetime + '\'' +
                '}';
    }
}
