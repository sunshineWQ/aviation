package com.bd10.knowledgesystems.util.qiniu;

import com.google.gson.Gson;
import com.qiniu.common.Zone;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;

@Configuration
public class QNConfig {
    @Bean
    public com.qiniu.storage.Configuration qiniuConfig(){
        return new com.qiniu.storage.Configuration(Zone.zone1());
    }
    @Bean
    public UploadManager uploadManager(){
        return new UploadManager(qiniuConfig());
    }
    @Value("3-hEx3FCr86uPA_WRGvD8t6sTkSgUOcqE7hTyXjm")
    private String accessKey;
    @Value("G8ePInf0_lolLnxpP5h-FuWdm9px85k_8_J1XUYp")
    private String secretKey;
    @Bean
    public Auth auth(){
        return Auth.create(accessKey,secretKey);
    }
    @Bean
    public BucketManager bucketManager(){
        return new BucketManager(auth(),qiniuConfig());
    }
    @Bean
    public Gson gson(){
        return new Gson();
    }
    /**
     * 文件上传大小限制配置    springBoot默认限制1MB大小文件
     * @return
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //单个文件最大 5M
        factory.setMaxFileSize("5120KB"); //KB,MB
        /// 设置总上传数据总大小
        factory.setMaxRequestSize("102400KB");
        return factory.createMultipartConfig();
    }
}
