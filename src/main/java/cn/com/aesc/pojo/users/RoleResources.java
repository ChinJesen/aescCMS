/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: RoleResources
 * Author:   dawn@acdiost.com
 * Date:     2018-06-04 14:29
 * Description: 权限资源
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.pojo.users;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈权限资源〉
 *
 * @author dawn@acdiost.com
 * @create 2018-06-04
 * @since 1.0.0
 */
@Table(name = "resources_roles")
public class RoleResources implements Serializable {
  private static final long serialVersionUID = -8559867942708057891L;
  @Id
  @Column(name = "roleId")
  private Integer roleid;

  @Id
  @Column(name = "resourcesId")
  private String resourcesid;

  /**
   * @return roleId
   */
  public Integer getRoleid() {
    return roleid;
  }

  /**
   * @param roleid
   */
  public void setRoleid(Integer roleid) {
    this.roleid = roleid;
  }

  public String getResourcesid() {
    return resourcesid;
  }

  public void setResourcesid(String resourcesid) {
    this.resourcesid = resourcesid;
  }
}