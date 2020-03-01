package com.blog.core.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blog.core.entity.SysMenuEntity;
import com.blog.core.entity.SysRoleEntity;
import com.blog.core.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * @Description 系统用户DAO
 * @Author youcong
 */
@Mapper
public interface SysUserDao extends BaseMapper<SysUserEntity> {

    /**
     * 通过用户ID查询角色集合
     * @Author youcong
     * @Param  userId 用户ID
     * @Return List<SysRoleEntity> 角色名集合
     */
    List<SysRoleEntity> selectSysRoleByUserId(Long userId);
    /**
     * 通过用户ID查询权限集合
     * @Author youcong
     * @Param  userId 用户ID
     * @Return List<SysMenuEntity> 角色名集合
     */
    List<SysMenuEntity> selectSysMenuByUserId(Long userId);
	
}
