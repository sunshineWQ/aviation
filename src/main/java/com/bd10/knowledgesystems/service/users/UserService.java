package com.bd10.knowledgesystems.service.users;


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
 * @Package com.bd10.knowledgesystem.service.users
 * @date 2020/2/11 18:34 星期二
 */
public interface UserService {

    Admin login(@Param("admin_phone") String admin_phone, @Param("admin_password") String admin_password);
    List<User> queryAllUser();
    List<consult>quertAllCon();
    List<Admin>allAdmin();
    boolean delAdmin(int admin_id);
    boolean addAdmin(@Param("admin_phone") String admin_phone,@Param("admin_password")String admin_password,@Param("admin_name") String admin_name);
    //boolean  addAdmin(Admin admin);
    String  queryAdminById(int admin_id);
    boolean  updataAdmin(Admin admin);
    ConclauseVo queryDetailByConsultId(int consult_id);
    boolean  RegisterUser(User user);
    User   userLogin(String user_phone,String user_password);
    public  Object[]login(String user_phone, String user_password,String type);
    Admin  queryAdminByPhone(String admin_phone);
    String queryRoleByPhone(String admin_phone);
    int queryIdByAdminName(String  admin_name);
    int addAdminType(@Param("admin_type") int admin_type ,@Param("aid") int  aid);
}
