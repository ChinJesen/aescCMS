package cn.com.aesc.mapper;

import cn.com.aesc.pojo.Users;
import cn.com.aesc.pojo.UsersExample;
import cn.com.aesc.utils.AescMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper extends AescMapper<Users> {
    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    List<Users> selectByExample(UsersExample example);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);
}