package cn.com.aesc.service.users;

import cn.com.aesc.pojo.users.Users;

public interface UserService {
  Users selectByUserName(String userName);
}
