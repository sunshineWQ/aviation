package com.bd10.knowledgesystems.model.dto;

/**
 * @author 王青
 * @version V1.0
 * @Project: 服务协议表
 * @Package com.bd10.knowledgesystems.model.dto
 * @date 2020/2/16 11:40 星期日
 */
public class ServiceHttp {
     private  int service_agreement_id;//
     private   String   service_agreement_content;

    public int getService_agreement_id() {
        return service_agreement_id;
    }

    public void setService_agreement_id(int service_agreement_id) {
        this.service_agreement_id = service_agreement_id;
    }

    public String getService_agreement_content() {
        return service_agreement_content;
    }

    public void setService_agreement_content(String service_agreement_content) {
        this.service_agreement_content = service_agreement_content;
    }
}
