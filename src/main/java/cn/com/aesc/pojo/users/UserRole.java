/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: UserRole
 * Author:   dawn@acdiost.com
 * Date:     2018-06-04 14:04
 * Description: 用户权限关系
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.pojo.users;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户权限关系〉
 *
 * @author dawn@acdiost.com
 * @create 2018-06-04
 * @since 1.0.0
 */
@Table(name = "users_roles")
public class UserRole {
  private static final long serialVersionUID = -916411139749530670L;
  @Column(name = "userId")
  private Integer userid;

  @Column(name = "roleId")
  private String roleid;

  /**
   * @return userId
   */
  public Integer getUserid() {
    return userid;
  }

  /**
   * @param userid
   */
  public void setUserid(Integer userid) {
    this.userid = userid;
  }

  public String getRoleid() {
    return roleid;
  }

  public void setRoleid(String roleid) {
    this.roleid = roleid;
  }
}
