package com.bd10.knowledgesystems.model.vo;

/**
 * @author 王青
 * @version V1.0
 * @Project: 管理端  法规列表需要展示的内容
 * @Package com.bd10.knowledgesystems.model.vo
 * @date 2020/2/12 15:50 星期三
 */
public class RegulationVo {
    private   int  regulations_id;//法规的id

    private  int regulations_part_no;//部号
    private   String regulations_part_no_alias;//法规部号别名
    private    String regulations_version; //版本号
    private   String  regulations_name;//法规名称
    private   String   regulations_type_name; //组织   所属的上级
    private   int regulations_show_status;//前台显示
    private   int  classify_foreign_key;//所属

    public int getRegulations_id() {
        return regulations_id;
    }

    public void setRegulations_id(int regulations_id) {
        this.regulations_id = regulations_id;
    }

    public int getClassify_foreign_key() {
        return classify_foreign_key;
    }

    public void setClassify_foreign_key(int classify_foreign_key) {
        this.classify_foreign_key = classify_foreign_key;
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

    public String getRegulations_type_name() {
        return regulations_type_name;
    }

    public void setRegulations_type_name(String regulations_type_name) {
        this.regulations_type_name = regulations_type_name;
    }

    public int getRegulations_show_status() {
        return regulations_show_status;
    }

    public void setRegulations_show_status(int regulations_show_status) {
        this.regulations_show_status = regulations_show_status;
    }
}
