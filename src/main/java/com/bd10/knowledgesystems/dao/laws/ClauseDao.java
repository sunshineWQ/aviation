package com.bd10.knowledgesystems.dao.laws;

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
public interface ClauseDao {
    //添加条款
    int  addClauseDao(Clause clause);
    //根据  目录Id  查询该目录下的条款
    List<Clause>queryClauseByDirectory_id(int directory_id);


    //  查询所有条款
    List<RegulationClasueVo>queryAllClause();
    //根据条款id  删除条款
    int   delClause(int clause_id);
    //根据条款表id  查看  条款的详细内容
    Clause queryClauseDetailById(int clause_id);

    //根据法规  条款号  条款关键字查询条款
    List<RegulationClasueVo>queryClause(@Param("regulations_id") Integer regulations_id, @Param("clause_no") Integer clause_no, @Param("clause_antistop") String clause_antistop);
}
