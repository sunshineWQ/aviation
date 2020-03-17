package com.bd10.knowledgesystems.dao.laws;

import com.bd10.knowledgesystems.model.entity.Directory;
import com.bd10.knowledgesystems.model.entity.Regulations;
import com.bd10.knowledgesystems.model.vo.RegulationTypeVo;
import com.bd10.knowledgesystems.model.vo.RegulationVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.dao.laws
 * @date 2020/2/11 21:32 星期二
 */
public interface RegulationsDao {
    //查询所有法规
    List<RegulationVo>queryAllRegulations();
    //添加法规
    int addRegulations(Regulations regulations);
    //查询民航法规  下面分类的法规
    List<RegulationVo>queryRegulationByType(int classify_foreign_key);

    //查询法规下面的所有目录
    List<Directory> queryAllDirectory(int regulations_foreign_key);

    //添加目录
    int  addDirectory(@Param("directory_name") String directory_name, @Param("index") int index, @Param("regulations_foreign_key") int regulations_foreign_key, @Param("level") int level);
     //根据目录 的 主键  id  删除
    int delDirectory(int directory_id);
    //根据  法规表的主键  id  删除法规
    int  delRegulation(int regulations_id);
    //查询所有民航法规下面得分类
    List<RegulationTypeVo>queryminhang();
    //根据二级分类查询法规
    List<RegulationVo>queryRegulationsByErji(int classify_foreign_key);
}
