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
@Table(name = "users_roles")
public class UsersRoles implements Serializable {
  private static final long serialVersionUID = 1L;
  /**
   * 角色id
   */
  @Column(name = "roleId")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer roleid;
  /**
   * 用户id
   */
  @Column(name = "userId")
  private Integer userid;

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

  /**
   * 获取用户id
   *
   * @return userId - 用户id
   */
  public Integer getUserid() {
    return userid;
  }

  /**
   * 设置用户id
   *
   * @param userid 用户id
   */
  public void setUserid(Integer userid) {
    this.userid = userid;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" [");
    sb.append("Hash = ").append(hashCode());
    sb.append(", roleid=").append(roleid);
    sb.append(", userid=").append(userid);
    sb.append("]");
    return sb.toString();
  }
}