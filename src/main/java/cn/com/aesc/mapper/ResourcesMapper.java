package cn.com.aesc.mapper;

import cn.com.aesc.entity.users.Resources;
import cn.com.aesc.entity.users.ResourcesExample;
import cn.com.aesc.utils.AescMapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ResourcesMapper extends AescMapper<Resources> {
    long countByExample(ResourcesExample example);

    int deleteByExample(ResourcesExample example);

    List<Resources> selectByExample(ResourcesExample example);

    int updateByExampleSelective(@Param("record") Resources record, @Param("example") ResourcesExample example);

    int updateByExample(@Param("record") Resources record, @Param("example") ResourcesExample example);
}