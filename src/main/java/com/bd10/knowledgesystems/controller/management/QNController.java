package com.bd10.knowledgesystems.controller.management;

import com.bd10.knowledgesystems.service.others.QNService;
import com.google.gson.Gson;
import com.qiniu.http.Response;
import com.qiniu.storage.model.DefaultPutRet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class QNController {
    @Autowired
    private QNService service;
    @Value("http://q3rklshd9.bkt.clouddn.com")
    private  String path;
    @PostMapping("/uploadFile")
    public String uploadFile(@RequestParam("regulations_pdf_path")MultipartFile file, Model model) throws IOException {
        Response response=service.uploadFile(file.getInputStream());
        DefaultPutRet putRet=new Gson().fromJson(response.bodyString(),DefaultPutRet.class);
        String url=path+"/"+putRet.key;
        System.out.println(url);
        model.addAttribute("url",url);
        return "regulations_add";
    }

}
