package com.blog.core.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blog.core.entity.SysRoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description 角色DAO
 * @Author youcong
 */
@Mapper
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {

}