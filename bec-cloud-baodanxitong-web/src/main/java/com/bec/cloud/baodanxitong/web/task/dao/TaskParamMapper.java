package com.bec.cloud.baodanxitong.web.task.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.task.model.TaskParam;

@Mapper
public interface TaskParamMapper {
    int deleteByPrimaryKey(Long paramId);

    int insert(TaskParam record);

    int insertSelective(TaskParam record);

    TaskParam selectByPrimaryKey(Long paramId);

    int updateByPrimaryKeySelective(TaskParam record);

    int updateByPrimaryKey(TaskParam record);

	List<TaskParam> selectTaskParam(TaskParam record);
}