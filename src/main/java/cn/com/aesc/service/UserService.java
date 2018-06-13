package cn.com.aesc.service;

import cn.com.aesc.entity.Users;

public interface UserService {

  Users selectByExamples(String example);
}
