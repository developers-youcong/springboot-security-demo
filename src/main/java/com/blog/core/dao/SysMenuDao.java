package com.blog.core.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blog.core.entity.SysMenuEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 权限DAO
 * @Author youcong
 */
@Mapper
public interface SysMenuDao extends BaseMapper<SysMenuEntity> {

}