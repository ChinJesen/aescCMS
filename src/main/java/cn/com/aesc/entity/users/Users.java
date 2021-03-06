package cn.com.aesc.entity.users;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Users implements Serializable {
  private static final long serialVersionUID = 1L;
  /**
   * 用户id主键
   */
  @Id
  @Column(name = "userId")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer userid;
  /**
   * 用户名
   */
  @Column(name = "userName")
  private String username;
  /**
   * 密码
   */
  private String password;
  /**
   * 部门
   */
  private String department;
  /**
   * 邮箱
   */
  private String email;
  /**
   * 电话号码
   */
  private String telephone;
  /**
   * 账户是否启用
   */
  private Integer enable;

  /**
   * 获取用户id主键
   *
   * @return userId - 用户id主键
   */
  public Integer getUserid() {
    return userid;
  }

  /**
   * 设置用户id主键
   *
   * @param userid 用户id主键
   */
  public void setUserid(Integer userid) {
    this.userid = userid;
  }

  /**
   * 获取用户名
   *
   * @return userName - 用户名
   */
  public String getUsername() {
    return username;
  }

  /**
   * 设置用户名
   *
   * @param username 用户名
   */
  public void setUsername(String username) {
    this.username = username == null ? null : username.trim();
  }

  /**
   * 获取密码
   *
   * @return password - 密码
   */
  public String getPassword() {
    return password;
  }

  /**
   * 设置密码
   *
   * @param password 密码
   */
  public void setPassword(String password) {
    this.password = password == null ? null : password.trim();
  }

  /**
   * 获取部门
   *
   * @return department - 部门
   */
  public String getDepartment() {
    return department;
  }

  /**
   * 设置部门
   *
   * @param department 部门
   */
  public void setDepartment(String department) {
    this.department = department == null ? null : department.trim();
  }

  /**
   * 获取邮箱
   *
   * @return email - 邮箱
   */
  public String getEmail() {
    return email;
  }

  /**
   * 设置邮箱
   *
   * @param email 邮箱
   */
  public void setEmail(String email) {
    this.email = email == null ? null : email.trim();
  }

  /**
   * 获取电话号码
   *
   * @return telephone - 电话号码
   */
  public String getTelephone() {
    return telephone;
  }

  /**
   * 设置电话号码
   *
   * @param telephone 电话号码
   */
  public void setTelephone(String telephone) {
    this.telephone = telephone == null ? null : telephone.trim();
  }

  /**
   * 获取账户是否启用
   *
   * @return enable - 账户是否启用
   */
  public Integer getEnable() {
    return enable;
  }

  /**
   * 设置账户是否启用
   *
   * @param enable 账户是否启用
   */
  public void setEnable(Integer enable) {
    this.enable = enable;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" [");
    sb.append("Hash = ").append(hashCode());
    sb.append(", userid=").append(userid);
    sb.append(", username=").append(username);
    sb.append(", password=").append(password);
    sb.append(", department=").append(department);
    sb.append(", email=").append(email);
    sb.append(", telephone=").append(telephone);
    sb.append(", enable=").append(enable);
    sb.append("]");
    return sb.toString();
  }
}