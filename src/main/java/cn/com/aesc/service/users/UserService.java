package cn.com.aesc.service.users;

import cn.com.aesc.pojo.users.Users;
import cn.com.aesc.service.IService;


public interface UserService extends IService<Users> {
  Users selectByUserName(String userName);


}
