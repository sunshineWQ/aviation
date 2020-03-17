package com.bd10.knowledgesystems.dao.laws;
import com.bd10.knowledgesystems.model.entity.RegulationType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.dao.laws
 * @date 2020/2/12 17:11 星期三
 */

public interface ZuzhiDao {
    //查询数据库的前四个   明航规章  法律法规
    List<RegulationType>  getzuzhiByType(int cengji); //根据层级查询
    //查询民航规章下级的分类
    List<RegulationType>   getzuzhiBySid(int sid);//查下及的方法

    //根据法规的类型 id 删除组织
    int  delzuzhi(int id);
    //添加一级分类
    int  addYijiType(String regulations_type_name);
    //添加二级分类
    int  addErjiType(@Param("regulations_type_name") String regulations_type_name, @Param("cengji") int cengji, @Param("shangji") int shangji);
}
