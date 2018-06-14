package cn.com.aesc.mapper;

import cn.com.aesc.entity.users.ResourcesRoles;
import cn.com.aesc.entity.users.ResourcesRolesExample;
import cn.com.aesc.utils.AescMapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ResourcesRolesMapper extends AescMapper<ResourcesRoles> {
    long countByExample(ResourcesRolesExample example);

    int deleteByExample(ResourcesRolesExample example);

    List<ResourcesRoles> selectByExample(ResourcesRolesExample example);

    int updateByExampleSelective(@Param("record") ResourcesRoles record, @Param("example") ResourcesRolesExample example);

    int updateByExample(@Param("record") ResourcesRoles record, @Param("example") ResourcesRolesExample example);
}