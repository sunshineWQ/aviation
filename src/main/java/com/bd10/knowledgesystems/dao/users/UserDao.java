package com.bd10.knowledgesystems.dao.users;
import com.bd10.knowledgesystems.model.entity.Admin;
import com.bd10.knowledgesystems.model.entity.User;
import com.bd10.knowledgesystems.model.entity.consult;
import com.bd10.knowledgesystems.model.vo.ConclauseVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-system
 * @Package com.bd10.knowledgesystem.dao.users
 * @date 2020/2/11 18:20 星期二
 */
public interface UserDao {
    Admin login(@Param("admin_phone") String admin_phone, @Param("admin_password") String admin_password);
    //用户列表
    List<User> queryAllUser();
    //咨询列表
    List<consult>quertAllCon();
    //管理员列表
    List<Admin>allAdmin();
    //删除管理员
    int  delAdmin(int admin_id);
//   //添加管理员
//    int  addAdmin(Admin admin);
    int addAdmin(@Param("admin_phone") String admin_phone,@Param("admin_password")String admin_password,@Param("admin_name") String admin_name);
    //根据管理员  id  查询管理员
    String  queryAdminById(int admin_id);

    //修改管理员姓名和手机号
    int  updataAdmin(Admin admin);

    //咨询列表  点击查看需要查看的内容
    ConclauseVo queryDetailByConsultId(int consult_id);
    //微信端注册
    int  RegisterUser(User user);
    User   userLogin(@Param("user_phone") String user_phone,@Param("user_password") String user_password);
   //根据手机号查询是否有该用户
    Admin  queryAdminByPhone(String admin_phone);
    //根据手机号查询该用户下的角色
    String queryRoleByPhone(String admin_phone);
    //添加管理员类型
    int addAdminType(@Param("admin_type") int admin_type ,@Param("aid") int  aid);
    //根据 管理员姓名层查询管理员的id
    int queryIdByAdminName(@Param("admin_name") String  admin_name);
}
