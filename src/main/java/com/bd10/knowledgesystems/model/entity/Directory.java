package com.bd10.knowledgesystems.model.entity;

/**
 * @author 王青
 * @version V1.0
 * @Project:目录表
 * @Package com.bd10.knowledgesystems.model.entity
 * @date 2020/2/13 18:39 星期四
 */
public class Directory {
    private  int directory_id;//目录的主键  id
    private  int  regulations_foreign_key;//法规的主键  idindex
    private  int  level;//几级目录
    private  String directory_name;//目录名称
    private  int  distance_show_status;//是否在前台显示
    private   int  index;//在同级目录排第几

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getDirectory_id() {
        return directory_id;
    }

    public void setDirectory_id(int directory_id) {
        this.directory_id = directory_id;
    }

    public int getRegulations_foreign_key() {
        return regulations_foreign_key;
    }

    public void setRegulations_foreign_key(int regulations_foreign_key) {
        this.regulations_foreign_key = regulations_foreign_key;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDirectory_name() {
        return directory_name;
    }

    public void setDirectory_name(String directory_name) {
        this.directory_name = directory_name;
    }

    public int getDistance_show_status() {
        return distance_show_status;
    }

    public void setDistance_show_status(int distance_show_status) {
        this.distance_show_status = distance_show_status;
    }

    @Override
    public String toString() {
        return "directory{" +
                "directory_id=" + directory_id +
                ", regulations_foreign_key=" + regulations_foreign_key +
                ", level=" + level +
                ", directory_name='" + directory_name + '\'' +
                ", distance_show_status=" + distance_show_status +
                ", index=" + index +
                '}';
    }
}
