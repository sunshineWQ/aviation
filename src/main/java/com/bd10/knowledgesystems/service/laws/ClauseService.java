package com.bd10.knowledgesystems.service.laws;

import com.bd10.knowledgesystems.model.entity.Clause;
import com.bd10.knowledgesystems.model.vo.RegulationClasueVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 王青
 * @version V1.0
 * @Project: knowledge-systems
 * @Package com.bd10.knowledgesystems.dao.laws
 * @date 2020/2/20 16:22 星期四
 */
public interface ClauseService {
    //添加条款
    boolean addClauseDao(Clause clause);
    List<Clause> queryClauseByDirectory_id(int directory_id);
    //  查询所有条款
    List<RegulationClasueVo>queryAllClause();
    boolean   delClause(int clause_id);
    Clause queryClauseDetailById(int clause_id);
    List<RegulationClasueVo>queryClause(@Param("regulations_id") Integer regulations_id, @Param("clause_no") Integer clause_no, @Param("clause_antistop") String clause_antistop);
}
