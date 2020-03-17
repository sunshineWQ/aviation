package com.bd10.knowledgesystems.model.dto;

/**
 * @author 王青
 * @version V1.0
 * @Project: 意见反馈表
 * @Package com.bd10.knowledgesystems.model.dto
 * @date 2020/2/15 17:48 星期六
 */
public class FeedBack {
    private  int feedback_id;
    private String feedback_content;
    private  int user_foreign_key;
    private String  feedback_createtime;
   private int feedback_delete_status;

    public int getFeedback_id() {
        return feedback_id;
    }

    public void setFeedback_id(int feedback_id) {
        this.feedback_id = feedback_id;
    }

    public String getFeedback_content() {
        return feedback_content;
    }

    public void setFeedback_content(String feedback_content) {
        this.feedback_content = feedback_content;
    }

    public int getUser_foreign_key() {
        return user_foreign_key;
    }

    public void setUser_foreign_key(int user_foreign_key) {
        this.user_foreign_key = user_foreign_key;
    }

    public String getFeedback_createtime() {
        return feedback_createtime;
    }

    public void setFeedback_createtime(String feedback_createtime) {
        this.feedback_createtime = feedback_createtime;
    }

    public int getFeedback_delete_status() {
        return feedback_delete_status;
    }

    public void setFeedback_delete_status(int feedback_delete_status) {
        this.feedback_delete_status = feedback_delete_status;
    }
}
