package com.bd10.knowledgesystems.model.vo;

/**
 * @author 王青
 * @version V1.0
 * @Project: 咨询列表  点击查看 需要展示的内容
 * @Package com.bd10.knowledgesystems.model.vo
 * @date 2020/2/22 20:37 星期六
 */
public class ConclauseVo {

    private   String    consult_name;//咨询人姓名
    private String consult_phone;//咨询人手机号
    private String consult_content;//咨询内容
    private String clause_no_alias;//相关条款


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

    public String getConsult_content() {
        return consult_content;
    }

    public void setConsult_content(String consult_content) {
        this.consult_content = consult_content;
    }

    public String getClause_no_alias() {
        return clause_no_alias;
    }

    public void setClause_no_alias(String clause_no_alias) {
        this.clause_no_alias = clause_no_alias;
    }

    @Override
    public String toString() {
        return "conclauseVo{" +
                "consult_name='" + consult_name + '\'' +
                ", consult_phone='" + consult_phone + '\'' +
                ", consult_content='" + consult_content + '\'' +
                ", clause_no_alias='" + clause_no_alias + '\'' +
                '}';
    }
}
