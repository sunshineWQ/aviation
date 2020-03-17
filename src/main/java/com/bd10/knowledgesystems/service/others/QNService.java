package com.bd10.knowledgesystems.service.others;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;

import java.io.InputStream;

public interface QNService {
    Response uploadFile(InputStream is)throws QiniuException;
}
