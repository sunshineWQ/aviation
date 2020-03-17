package com.bd10.knowledgesystems.service.users.Impl;


import com.alibaba.fastjson.JSON;
import com.bd10.knowledgesystems.dao.users.UserDao;
import com.bd10.knowledgesystems.model.entity.Admin;
import com.bd10.knowledgesystems.model.entity.User;
import com.bd10.knowledgesystems.model.entity.consult;
import com.bd10.knowledgesystems.model.vo.ConclauseVo;
import com.bd10.knowledgesystems.service.users.UserService;
import com.bd10.knowledgesystems.util.MD5;
import com.bd10.knowledgesystems.util.redis.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-system
 * @Package com.bd10.knowledgesystem.service.users.Impl
 * @date 2020/2/11 18:34 星期二
 */

@Service
public class UserServiceImpl   implements UserService {

    @Autowired
    private   RedisUtils  redisUtils;
    @Resource
    private UserDao userDao;
    @Override
    public Admin login(String admin_phone, String admin_password) {

        return userDao.login(admin_phone,admin_password);
    }

    @Override
    public List<User> queryAllUser() {
        return userDao.queryAllUser();
    }

    @Override
    public List<consult> quertAllCon() {
        return userDao.quertAllCon();
    }

    @Override
    public List<Admin> allAdmin() {
        return userDao.allAdmin();
    }

    @Override
    public boolean delAdmin(int admin_id) {
        if(userDao.delAdmin(admin_id)>0){
      return   true;
        }
        return false;
    }
    @Override
    public boolean addAdmin(String admin_phone, String admin_password, String admin_name) {
        if(userDao.addAdmin(admin_phone,admin_password,admin_name)>0){
            return   true;
        }
        return false;
    }
    @Override
    public String queryAdminById(int admin_id) {
        return userDao.queryAdminById(admin_id);
    }

    @Override
    public boolean updataAdmin(Admin admin) {

        if(userDao.updataAdmin(admin)>0){
         return true;
        }
        return false;
    }
    @Override
    public ConclauseVo queryDetailByConsultId(int consult_id) {
        return userDao.queryDetailByConsultId(consult_id);
    }

    @Override
    public boolean RegisterUser(User user) {
        if(userDao.RegisterUser(user)>0){
            return true;
        }
        return false;
    }
    @Override
    public User userLogin(String user_phone, String user_password) {
        return userDao.userLogin(user_phone,user_password);
    }

    public  Object[]login(String user_phone, String user_password,String type){
        if(this.userLogin(user_phone,user_password)==null){  //根据手机号和密码登录  为null  说明登录失败  手机号或者密码错误
            return  null;
        }
        //到这里  说明登录没有问题   我们就创建一个  token  token  为了 确保单点登录  没有在其他客户端登录
       String token=createToken(this.userLogin(user_phone,user_password).getUser_name(),type);
        //将token  保存在redis  中
        saveToken(token,this.userLogin(user_phone,user_password).getUser_name());
        return new Object[]{this.userLogin(user_phone,user_password),token};
    }
    @Override
    public Admin queryAdminByPhone(String admin_phone) {
        return userDao.queryAdminByPhone(admin_phone);
    }
    @Override
    public String queryRoleByPhone(String admin_phone) {
        return userDao.queryRoleByPhone(admin_phone);
    }

    @Override
    public int queryIdByAdminName(String admin_name) {
        return userDao.queryIdByAdminName(admin_name);
    }

    @Override
    public int addAdminType(int admin_type, int aid) {
        return userDao.addAdminType(admin_type,aid);
    }

    //保存 token
    public  void   saveToken(String  token,String  user_name){

        String  tokenkey="user"+user_name;
        String tokenValue=null;


        if((tokenValue= (String)redisUtils.get(tokenkey))!=null){
            //证明登录过
            redisUtils.delete(tokenkey);//删除键
            redisUtils.delete(tokenValue);//删除值
        }

        //重新设置他的键值对
        redisUtils.set(tokenkey,token,3000);
        redisUtils.set(token, JSON.toJSONString(user_name),3000);
    }

    //生成token   的方法、

    public  String   createToken(String  user_name,String   type){
        StringBuilder  builder  =new StringBuilder();
        builder.append("token-");
        builder.append(type+"-");
        String  info= MD5.getMD5(user_name,32);
        builder.append(info+"-");
        builder.append(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
        builder.append(UUID.randomUUID().toString().substring(0,6));
        return  builder.toString();
    }


}
