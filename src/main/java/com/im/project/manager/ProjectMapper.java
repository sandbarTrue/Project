package com.im.project.manager;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.im.project.model.Project;

@Repository("projectDao")
public interface ProjectMapper extends BaseDao<Project, Integer> {
	/**
	 * 分不同类型查询项目
	 * @param projectMap 封装PageSize,pageId
	 * @param type
	 * @return
	 */
	public List<Project> findAllByType( Map<String,Object> projectMap,@Param("type")Integer type);
	/**
	 * 分页查找未完成的研究成果
	 * @param projectMap 
	 * @return 结果集
	 */
	public List<Project> findAllDoing( Map<String,Object> projectMap);
	/**
	 * 分页查找已完成的项目
	 * @param projectMap
	 * @return 结果集
	 */
	public List<Project> findAllCompleted( Map<String,Object> projectMap);
}
