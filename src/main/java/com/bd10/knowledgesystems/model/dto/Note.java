package com.bd10.knowledgesystems.model.dto;

/**
 * @author 王青
 * @version V1.0
 * @Project: 短信设置
 * @Package com.bd10.knowledgesystems.model.dto
 * @date 2020/2/16 23:10 星期日
 */
public class Note {
    private   int note_id;
      private String   api_key;

    public int getNote_id() {
        return note_id;
    }

    public void setNote_id(int note_id) {
        this.note_id = note_id;
    }

    public String getApi_key() {
        return api_key;
    }

    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }
}

