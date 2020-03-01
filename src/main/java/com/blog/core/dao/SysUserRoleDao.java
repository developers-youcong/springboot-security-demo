package com.blog.core.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blog.core.entity.SysUserRoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description 用户与角色关系DAO
 * @Author youcong
 */
@Mapper
public interface SysUserRoleDao extends BaseMapper<SysUserRoleEntity> {
	
}
