package cn.com.aesc.entity.users;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * 
 * @Author: dawn@acdiost.com
 * @Date: 2018-06-14 11:34
 * @Param: 
 * @Return: 
 * @See: 
 * @Throws: 
 * @Version: 
 * @Description: 
 */
@Entity
@Table(name = "resources_roles")
public class ResourcesRoles implements Serializable {
  private static final long serialVersionUID = 1L;
  /**
   * 资源id
   */
  @Column(name = "resourcesId")
  private Integer resourcesid;
  /**
   * 角色id
   */
  @Column(name = "roleId")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer roleid;

  /**
   * 获取资源id
   *
   * @return resourcesId - 资源id
   */
  public Integer getResourcesid() {
    return resourcesid;
  }

  /**
   * 设置资源id
   *
   * @param resourcesid 资源id
   */
  public void setResourcesid(Integer resourcesid) {
    this.resourcesid = resourcesid;
  }

  /**
   * 获取角色id
   *
   * @return roleId - 角色id
   */
  public Integer getRoleid() {
    return roleid;
  }

  /**
   * 设置角色id
   *
   * @param roleid 角色id
   */
  public void setRoleid(Integer roleid) {
    this.roleid = roleid;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" [");
    sb.append("Hash = ").append(hashCode());
    sb.append(", resourcesid=").append(resourcesid);
    sb.append(", roleid=").append(roleid);
    sb.append("]");
    return sb.toString();
  }
}