package com.bd10.knowledgesystems.model.vo;

/**
 * @author 王青
 * @version V1.0
 * @Project: 管理端组织设定 需要展示的内容   视频中的层级Vo
 * @Package com.bd10.knowledgesystems.model.vo
 * @date 2020/2/12 17:03 星期三
 */
public class RegulationTypeVo {

    private int regulations_type_id;//类型编号

    private String regulations_type_name;//类型名称

    private int cengji;//属于di'j第几层级

    private int shangji;//她的上级是谁

    private  String xiaji;//她的下级

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

    public String getXiaji() {
        return xiaji;
    }

    public void setXiaji(String xiaji) {
        this.xiaji = xiaji;
    }

    @Override
    public String toString() {
        return "RegulationTypeVo{" +
                "regulations_type_id=" + regulations_type_id +
                ", regulations_type_name='" + regulations_type_name + '\'' +
                ", cengji=" + cengji +
                ", shangji=" + shangji +
                ", xiaji='" + xiaji + '\'' +
                '}';
    }
}
