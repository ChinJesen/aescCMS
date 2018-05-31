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


import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户信息〉
 *
 * @author dawn@acdiost.com
 * @create 2018-05-10
 * @since 1.0.0
 */
public class Users {

  private int userId;
  private String userName;
  private String password;
  private String department;
  private String email;
  private String address;
  private String telephone;
  private String sex;
  // 简介
  private String bio;
  // 账户是否可用
  private int enable;

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
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

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
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
            "userId=" + userId +
            ", userName='" + userName + '\'' +
            ", password='" + password + '\'' +
            ", department='" + department + '\'' +
            ", email='" + email + '\'' +
            ", address='" + address + '\'' +
            ", telephone='" + telephone + '\'' +
            ", sex='" + sex + '\'' +
            ", bio='" + bio + '\'' +
            ", enable=" + enable +
            '}';
  }
}
