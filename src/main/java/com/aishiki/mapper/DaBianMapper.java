package com.aishiki.mapper;

import com.aishiki.model.DaBian;
import com.aishiki.model.DaBianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DaBianMapper {
    long countByExample(DaBianExample example);

    int deleteByExample(DaBianExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DaBian record);

    int insertSelective(DaBian record);

    List<DaBian> selectByExample(DaBianExample example);

    DaBian selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DaBian record, @Param("example") DaBianExample example);

    int updateByExample(@Param("record") DaBian record, @Param("example") DaBianExample example);

    int updateByPrimaryKeySelective(DaBian record);

    int updateByPrimaryKey(DaBian record);

	DaBian getThisStudentScore(String studentId);
}