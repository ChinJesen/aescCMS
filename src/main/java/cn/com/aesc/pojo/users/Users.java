/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: Users
 * Author:   dawn@acdiost.com
 * Date:     2018-05-10 14:44
 * Description: 用户信息
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.pojo.users;


import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户信息〉
 *
 * @author dawn@acdiost.com
 * @create 2018-05-10
 * @since 1.0.0
 */
@Table(name = "users")
public class Users {
  @Column(name = "user_id")
  private int user_id;
  @Column(name = "user_name")
  private String user_name;
  @Column(name = "password")
  private String password;
  @Column(name = "department")
  private String department;
  @Column(name = "email")
  private String email;
  @Column(name = "telephone")
  private String telephone;
  // 账户是否可用
  @Column(name = "enable")
  private int enable;

  public int getUser_id() {
    return user_id;
  }

  public void setUser_id(int user_id) {
    this.user_id = user_id;
  }

  public String getUser_name() {
    return user_name;
  }

  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public int getEnable() {
    return enable;
  }

  public void setEnable(int enable) {
    this.enable = enable;
  }

  @Override
  public String toString() {
    return "Users{" +
            "userId=" + user_id +
            ", userName='" + user_name + '\'' +
            ", password='" + password + '\'' +
            ", department='" + department + '\'' +
            ", email='" + email + '\'' +
            ", telephone='" + telephone + '\'' +
            ", enable=" + enable +
            '}';
  }
}
