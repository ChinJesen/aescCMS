package cn.com.aesc.mapper;

import cn.com.aesc.entity.users.Roles;
import cn.com.aesc.entity.users.RolesExample;
import cn.com.aesc.utils.AescMapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RolesMapper extends AescMapper<Roles> {
    long countByExample(RolesExample example);

    int deleteByExample(RolesExample example);

    List<Roles> selectByExample(RolesExample example);

    int updateByExampleSelective(@Param("record") Roles record, @Param("example") RolesExample example);

    int updateByExample(@Param("record") Roles record, @Param("example") RolesExample example);
}