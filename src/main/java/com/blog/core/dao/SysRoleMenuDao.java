package com.blog.core.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blog.core.entity.SysRoleMenuEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色权限关系DAO
 * @Author youcong
 */
@Mapper
public interface SysRoleMenuDao extends BaseMapper<SysRoleMenuEntity> {
	
}
