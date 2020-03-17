package com.bd10.knowledgesystems.service.others.Impl;

import com.bd10.knowledgesystems.service.others.QNService;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.InputStream;

@Service
public class QNServiceImpl implements QNService, InitializingBean {
    @Autowired
    private UploadManager uploadManager;

    @Autowired
    private BucketManager bucketManager;

    @Autowired
    private Auth auth;

    @Value("zlsnk")
    private String bucket;

    private StringMap putPolicy;

    @Override
    public Response uploadFile(InputStream is) throws QiniuException {
        Response response=uploadManager.put(is,null,getToken(),null,null);
        int trytimes=0;
        while (response.needRetry()&&trytimes<3){
            response=uploadManager.put(is,null,getToken(),null,null);
            trytimes++;
        }
        return response;
    }

    private String getToken(){
        return this.auth.uploadToken(bucket,null,3600,putPolicy);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.putPolicy=new StringMap();
        putPolicy.put("returnBody", "{\"key\":\"$(key)\",\"hash\":\"$(etag)\",\"bucket\":\"$(bucket)\",\"fsize\":$(fsize)}");
    }
}
