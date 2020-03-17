package com.bd10.knowledgesystems.util;

import cz.mallat.uasparser.OnlineUpdater;
import cz.mallat.uasparser.UASparser;
import cz.mallat.uasparser.UserAgentInfo;

import java.io.IOException;

/**
 * @author 王青
 * @version V1.0
 * @Project: demo-login
 * @Package com.bd10.demologin.util
 * @date 2020/1/5 00:10 星期日
 *  解析浏览器的user agent的工具类
 *
 */
    public class UserAgentUtils {

//解析浏览器的useragent的工具类，内部就是调用这个uasparser jar文件
//3、UserAgent的解析
//        UserAgentUtil工具类解析浏览器代理对象
//        包含内部类AgentInfo用于封装浏览器信息
//        AgentInfo包括浏览器名称，浏览器版本，操作系统名称，操作系统版本4个属性
//        UserAgentUtil包含方法 public static AgentInfo parserUserAgent(String userAgent)
//        返回值为AgentInfo的一个对象。
//        数据中b_iev的内容为浏览器代理对象，可以解析出浏览器信息，
//        包括浏览器名称，浏览器版本，操作系统名称，操作系统版本
//        使用uasparser-0.6.1.jar解析浏览器信息
//        import cz.mallat.uasparser.OnlineUpdater;
//        import cz.mallat.uasparser.UASparser;
//        import cz.mallat.uasparser.UserAgentInfo;

        public   static UASparser  uaSparser=null;

        //初始化usaParser对象
        static {
            try {
                uaSparser=new UASparser(OnlineUpdater.getVendoredInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        public   static   void  main(String[]args) throws IOException {
            String request="";
            UserAgentInfo  userAgentInfo=UserAgentUtils.uaSparser.parse(request);
            System.out.println(userAgentInfo.getDeviceType());
        }
    }
