package com.bd10.knowledgesystems.service.laws.Impl;

import com.bd10.knowledgesystems.dao.laws.RegulationsDao;
import com.bd10.knowledgesystems.dao.laws.ZuzhiDao;
import com.bd10.knowledgesystems.model.entity.Directory;
import com.bd10.knowledgesystems.model.entity.RegulationType;
import com.bd10.knowledgesystems.model.entity.Regulations;
import com.bd10.knowledgesystems.model.vo.RegulationTypeVo;
import com.bd10.knowledgesystems.model.vo.RegulationVo;
import com.bd10.knowledgesystems.service.laws.RegulationsService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.service.laws
 * @date 2020/2/11 21:34 星期二
 */
@Service
public class RegulationsServiceImpl  implements RegulationsService {

    @Resource
    private RegulationsDao regulationsDao;
    @Resource
    private ZuzhiDao zuzhiDao;

    @Override
    public List<RegulationVo> queryAllRegulations() {
        return regulationsDao.queryAllRegulations();
    }

    @Override
    public List<RegulationTypeVo> getzuzhiList() {
       List<RegulationTypeVo>zuzhiVoList=new ArrayList<>();
        //查询一级的分类  例如  民航规章   法律法规  规范性文件
        List<RegulationType>  yiji= zuzhiDao.getzuzhiByType(1);//拿出来的是RegulationType中的前四个
        for (RegulationType cengji:  yiji){
                RegulationTypeVo cengjiVo=new RegulationTypeVo();
                cengjiVo.setCengji(cengji.getCengji());
                cengjiVo.setRegulations_type_name(cengji.getRegulations_type_name());
                cengjiVo.setRegulations_type_id(cengji.getRegulations_type_id());
                //查询二级
                List<RegulationType>erji=zuzhiDao.getzuzhiBySid(cengji.getRegulations_type_id());
                String xiaji="";
                if(erji!=null&&erji.size()>0){
                       for (RegulationType  c :erji ){
                          xiaji+=c.getRegulations_type_name();
                        xiaji+="  ";
                       }
                }else {
                     xiaji="暂无";
                }
                cengjiVo.setXiaji(xiaji);
                zuzhiVoList.add(cengjiVo);

            }
        return zuzhiVoList;
    }

    @Override
    public int delzuzhi(int id) {
        return zuzhiDao.delzuzhi(id);
    }

    @Override
    public int addYijiType(String regulations_type_name) {
        return zuzhiDao.addYijiType(regulations_type_name);
    }

    @Override
    public List<RegulationType> getzuzhiByType(int cengji) {
        return zuzhiDao.getzuzhiByType(cengji);
    }

    @Override
    public int addErjiType(String regulations_type_name, int cengji, int shangji) {
        return zuzhiDao.addErjiType(regulations_type_name,cengji,shangji);
    }

    @Override
    public boolean addRegulations(Regulations regulations) {
    if( regulationsDao.addRegulations(regulations)>0){
        return  true;
    }
        return  false;
    }

    @Override
    public List<RegulationType> getzuzhiBySid(int sid) {
        return zuzhiDao.getzuzhiBySid(sid);
    }

    @Override
    public List<RegulationVo> queryRegulationByType(int classify_foreign_key) {
        return regulationsDao.queryRegulationByType(classify_foreign_key);
    }

    @Override
    public List<Directory> queryAllDirectory(int regulations_foreign_key) {
        return  regulationsDao.queryAllDirectory(regulations_foreign_key);
    }

    @Override
    public boolean addDirectory(String directory_name, int index, int regulations_foreign_key, int level) {
       if(regulationsDao.addDirectory(directory_name,index,regulations_foreign_key,level)>0){
           return true;
       }
        return false;
    }

    @Override
    public boolean delDirectory(int directory_id) {
        if(regulationsDao.delDirectory(directory_id)>0){
            return  true;
        }
        return false;
    }

    @Override
    public boolean delRegulation(int regulations_id) {
        if(regulationsDao.delRegulation(regulations_id)>0){
            return true;
        }
        return false;
    }

    @Override
    public List<RegulationTypeVo> queryminhang() {
        return regulationsDao.queryminhang();
    }

    @Override
    public List<RegulationVo> queryRegulationsByErji(int classify_foreign_key) {
        return regulationsDao.queryRegulationsByErji(classify_foreign_key);
    }


}
