package com.bd10.knowledgesystems.model.dto;

/**
 * @author 王青
 * @version V1.0
 * @Project:公司介绍
 * @Package com.bd10.knowledgesystems.model.dto
 * @date 2020/2/16 10:58 星期日
 */
public class Abouts {
    private   int  aboutus_id;//公司介绍的id
    private  String  aboutus_content;  //介绍内容

    public int getAboutus_id() {
        return aboutus_id;
    }

    public void setAboutus_id(int aboutus_id) {
        this.aboutus_id = aboutus_id;
    }

    public String getAboutus_content() {
        return aboutus_content;
    }

    public void setAboutus_content(String aboutus_content) {
        this.aboutus_content = aboutus_content;
    }
}
