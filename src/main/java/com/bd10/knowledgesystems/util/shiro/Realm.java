package com.bd10.knowledgesystems.util.shiro;

import com.bd10.knowledgesystems.dao.users.UserDao;
import com.bd10.knowledgesystems.model.entity.Admin;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 王青
 * @version V1.0
 * @Project: demo-shiro
 * @Package com.bd10.demoshiro.util
 * @date 2020/3/7 17:39 星期六
 */
public class Realm extends AuthorizingRealm{
    @Resource
    private UserDao userDao;
    //这是授权得信息
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("授权方法进来了");
        String phone=(String) SecurityUtils.getSubject().getPrincipal();
        SimpleAuthorizationInfo  info=new SimpleAuthorizationInfo();
        //根据手机号查询用户角色信息
        String rolesList=userDao.queryRoleByPhone(phone);
        System.out.println(rolesList);
        Set<String>roles=new HashSet<>();
        roles.add(rolesList);
        info.setRoles(roles);

        return info;
    }

    //完成身份认证  并且返回认证信息
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
       //重写获取用户信息
        //获取输入的信息

        if(authenticationToken.getPrincipal()==null){
            System.out.println("1111");
            return  null;
        }
        String  phone=(String)authenticationToken.getPrincipal();
        Admin  admin=userDao.queryAdminByPhone(phone);
        if(admin==null){
            throw   new  UnknownAccountException("没有该用户");
        }

        //将数据库查询到的信息封装到SimpleAuthenticationInfo
        SimpleAuthenticationInfo  info=new SimpleAuthenticationInfo(phone,admin.getAdmin_password(),getName());

        return info;
    }


}
