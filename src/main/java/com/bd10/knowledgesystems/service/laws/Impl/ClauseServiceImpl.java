package com.bd10.knowledgesystems.service.laws.Impl;

import com.bd10.knowledgesystems.dao.laws.ClauseDao;
import com.bd10.knowledgesystems.model.entity.Clause;
import com.bd10.knowledgesystems.model.vo.RegulationClasueVo;
import com.bd10.knowledgesystems.service.laws.ClauseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.dao.laws
 * @date 2020/2/20 16:22 星期四
 */
@Service
public class ClauseServiceImpl  implements ClauseService {

    @Resource
    private ClauseDao clauseDao;
    @Override
    public boolean addClauseDao(Clause clause) {
        if(clauseDao.addClauseDao(clause)>0){
            return   true;
        }
        return false;
    }

    @Override
    public List<Clause> queryClauseByDirectory_id(int directory_id) {
        return clauseDao.queryClauseByDirectory_id(directory_id);
    }

    @Override
    public List<RegulationClasueVo> queryAllClause() {
        return clauseDao.queryAllClause();
    }

    @Override
    public boolean delClause(int clause_id) {
        if (clauseDao.delClause(clause_id)>0) {
            return   true;
        }
        return false;
    }

    @Override
    public Clause queryClauseDetailById(int  clause_id) {
        return clauseDao.queryClauseDetailById(clause_id);
    }

    @Override
    public List<RegulationClasueVo> queryClause(@Param("regulations_id") Integer regulations_id, @Param("clause_no") Integer clause_no,@Param("clause_antistop") String  clause_antistop) {
        return clauseDao.queryClause(regulations_id, clause_no,clause_antistop);
    }


}
