package cn.com.aesc.service.users;

import cn.com.aesc.pojo.users.RoleResources;
import cn.com.aesc.service.IService;

public interface RoleResourcesService extends IService<RoleResources> {
  void addRoleResources(RoleResources roleResources);
}
