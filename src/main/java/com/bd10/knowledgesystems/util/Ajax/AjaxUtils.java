package com.bd10.knowledgesystems.util.Ajax;

//import com.alibaba.fastjson.JSON;

import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.util.Ajax
 * @date 2020/2/15 12:04 星期六
 */
public class AjaxUtils {
    public static void jsonforward(Object object, HttpServletResponse  response) throws IOException {
          String result= JSON.toJSONString(object);
          response.setContentType("text/json;charset=utf-8");
          PrintWriter  out=response.getWriter();
          out.print(result);
          out.flush();
          out.close();
    }
}
