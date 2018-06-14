package cn.com.aesc.mapper;

import cn.com.aesc.entity.users.UsersRoles;
import cn.com.aesc.entity.users.UsersRolesExample;
import cn.com.aesc.utils.AescMapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersRolesMapper extends AescMapper<UsersRoles> {
    long countByExample(UsersRolesExample example);

    int deleteByExample(UsersRolesExample example);

    List<UsersRoles> selectByExample(UsersRolesExample example);

    int updateByExampleSelective(@Param("record") UsersRoles record, @Param("example") UsersRolesExample example);

    int updateByExample(@Param("record") UsersRoles record, @Param("example") UsersRolesExample example);
}