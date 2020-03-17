package com.bd10.knowledgesystems.service.laws;

import com.bd10.knowledgesystems.model.vo.RegulationTypeVo;
import com.bd10.knowledgesystems.model.vo.RegulationVo;
import com.bd10.knowledgesystems.model.entity.Directory;
import com.bd10.knowledgesystems.model.entity.RegulationType;
import com.bd10.knowledgesystems.model.entity.Regulations;
import com.bd10.knowledgesystems.model.vo.RegulationTypeVo;
import com.bd10.knowledgesystems.model.vo.RegulationVo;

import java.util.List;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.service.laws
 * @date 2020/2/11 21:33 星期二
 */
public interface RegulationsService {
    List<RegulationVo> queryAllRegulations();
    List<RegulationTypeVo> getzuzhiList();
    int  delzuzhi(int id);
    int  addYijiType(String regulations_type_name);
    List<RegulationType>  getzuzhiByType(int cengji);
    int  addErjiType(String regulations_type_name, int cengji, int shangji);
    boolean addRegulations(Regulations regulations);

    List<RegulationType>   getzuzhiBySid(int sid);//查下及的方法
    List<RegulationVo>queryRegulationByType(int classify_foreign_key);
    List<Directory> queryAllDirectory(int regulations_foreign_key);

    boolean  addDirectory(String directory_name, int index, int regulations_foreign_key, int level);
    boolean delDirectory(int directory_id);
    boolean  delRegulation(int regulations_id);
    List<RegulationTypeVo>queryminhang();
    List<RegulationVo>queryRegulationsByErji(int classify_foreign_key);
}
