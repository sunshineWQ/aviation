package com.bd10.knowledgesystems.model.entity;

/**
 * @author 王青
 * @version V1.0
 * @Project:  法规类型  视频中的层级
 * * @Package com.bd10.knowledgesystems.model.entity
 * @date 2020/2/12 15:23 星期三
 */
public class RegulationType {
    private   int regulations_type_id;// 层级的类型编号
    private   String   regulations_type_name;  //类型名称
    private   int  cengji; //他是第几级
    private   int   shangji; //她的上级有几个

    public int getRegulations_type_id() {
        return regulations_type_id;
    }

    public void setRegulations_type_id(int regulations_type_id) {
        this.regulations_type_id = regulations_type_id;
    }

    public String getRegulations_type_name() {
        return regulations_type_name;
    }

    public void setRegulations_type_name(String regulations_type_name) {
        this.regulations_type_name = regulations_type_name;
    }

    public int getCengji() {
        return cengji;
    }

    public void setCengji(int cengji) {
        this.cengji = cengji;
    }

    public int getShangji() {
        return shangji;
    }

    public void setShangji(int shangji) {
        this.shangji = shangji;
    }

    @Override
    public String toString() {
        return "RegulationType{" +
                "regulations_type_id=" + regulations_type_id +
                ", regulations_type_name='" + regulations_type_name + '\'' +
                ", cengji=" + cengji +
                ", shangji=" + shangji +
                '}';
    }
}
