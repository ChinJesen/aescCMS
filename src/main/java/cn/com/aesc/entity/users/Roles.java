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
public class Roles implements Serializable {
  private static final long serialVersionUID = 1L;
  /**
   * 角色主键
   */
  @Id
  @Column(name = "roleId")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer roleid;
  /**
   * 角色描述
   */
  @Column(name = "roleDescription")
  private String roledescription;

  /**
   * 获取角色主键
   *
   * @return roleId - 角色主键
   */
  public Integer getRoleid() {
    return roleid;
  }

  /**
   * 设置角色主键
   *
   * @param roleid 角色主键
   */
  public void setRoleid(Integer roleid) {
    this.roleid = roleid;
  }

  /**
   * 获取角色描述
   *
   * @return roleDescription - 角色描述
   */
  public String getRoledescription() {
    return roledescription;
  }

  /**
   * 设置角色描述
   *
   * @param roledescription 角色描述
   */
  public void setRoledescription(String roledescription) {
    this.roledescription = roledescription == null ? null : roledescription.trim();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" [");
    sb.append("Hash = ").append(hashCode());
    sb.append(", roleid=").append(roleid);
    sb.append(", roledescription=").append(roledescription);
    sb.append("]");
    return sb.toString();
  }
}