package com.bd10.knowledgesystems.model.vo;

/**
 * @author 王青
 * @version V1.0
 * @Project: 条款列表需要展示的内容
 * @Package com.bd10.knowledgesystems.model.vo
 * @date 2020/2/21 12:42 星期五
 */
public class RegulationClasueVo {
   private int clause_id;//条款的  唯一主键id
    private int   clause_no;//条款的编号
    private String clause_no_alias;//条款的编号
    private String  clause_title;//条款的标题
    private String regulations_name;//所属法规名称
    private String  clause_version;//条款版本号

    public int getClause_id() {
        return clause_id;
    }

    public void setClause_id(int clause_id) {
        this.clause_id = clause_id;
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

    public String getClause_title() {
        return clause_title;
    }

    public void setClause_title(String clause_title) {
        this.clause_title = clause_title;
    }

    public String getRegulations_name() {
        return regulations_name;
    }

    public void setRegulations_name(String regulations_name) {
        this.regulations_name = regulations_name;
    }

    public String getClause_version() {
        return clause_version;
    }

    public void setClause_version(String clause_version) {
        this.clause_version = clause_version;
    }

    @Override
    public String toString() {
        return "RegulationClasueVo{" +
                "clause_id=" + clause_id +
                ", clause_no=" + clause_no +
                ", clause_no_alias='" + clause_no_alias + '\'' +
                ", clause_title='" + clause_title + '\'' +
                ", regulations_name='" + regulations_name + '\'' +
                ", clause_version='" + clause_version + '\'' +
                '}';
    }
}
