/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: RoleResourcesServiceImpl
 * Author:   dawn@acdiost.com
 * Date:     2018-06-04 14:28
 * Description: 权限资源
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.service.impl.users;

import cn.com.aesc.mapper.UserRoleMapper;
import cn.com.aesc.pojo.users.RoleResources;
import cn.com.aesc.service.impl.BaseService;
import cn.com.aesc.service.users.RoleResourcesService;
import cn.com.aesc.shiro.CustomizeRealm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈权限资源〉
 *
 * @author dawn@acdiost.com
 * @create 2018-06-04
 * @since 1.0.0
 */
@Service("roleResourcesService")
public class RoleResourcesServiceImpl extends BaseService<RoleResources> implements RoleResourcesService {

  @Autowired
  private CustomizeRealm customizeRealm;

  @Resource
  private UserRoleMapper userRoleMapper;

  /**
   * Copyright (C), 2005-2018, 重庆汽博实业有限公司
   *
   * @Author: dawn@acdiost.com
   * @Date: 2018-06-04 14:35
   * @Param:
   * @Return:
   * @See:
   * @Throws:
   * @Version:
   * @Description: 更新权限
   */
  @Override
  @Transactional(propagation= Propagation.REQUIRED,readOnly=false,rollbackFor={Exception.class})
  public void addRoleResources(RoleResources roleResources) {
    // 删除
    Example example = new Example(RoleResources.class);
    Example.Criteria criteria = example.createCriteria();
    criteria.andEqualTo("roleid",roleResources.getRoleid());
    mapper.deleteByExample(example);
    // 添加
    if(!StringUtils.isEmpty(roleResources.getResourcesid())){
      String[] resourcesArr = roleResources.getResourcesid().split(",");
      for(String resourcesId:resourcesArr ){
        RoleResources r = new RoleResources();
        r.setRoleid(roleResources.getRoleid());
        r.setResourcesid(resourcesId);
        mapper.insert(r);
      }
    }

    List<Integer> userIds= userRoleMapper.findUserIdByRoleId(roleResources.getRoleid());
    // 更新当前登录的用户的权限缓存
    customizeRealm.clearUserAuthByUserId(userIds);
  }
}
