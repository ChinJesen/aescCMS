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
  private String telephone;
  private String sexs;
  // 注册时间
  private Date registerTime;
  // 登录时间
  private Date loginTime;
  // 注册IP
  private String registerIp;
  // 登录IP
  private String loginIp;
  // 访问标识
  private String accessToken;
  // 访问过期
  private String accessExpire;
  private String email;
  private String address;
  // 密码盐
  private String salt;
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

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getSexs() {
    return sexs;
  }

  public void setSexs(String sexs) {
    this.sexs = sexs;
  }

  public Date getRegisterTime() {
    return registerTime;
  }

  public void setRegisterTime(Date registerTime) {
    this.registerTime = registerTime;
  }

  public Date getLoginTime() {
    return loginTime;
  }

  public void setLoginTime(Date loginTime) {
    this.loginTime = loginTime;
  }

  public String getRegisterIp() {
    return registerIp;
  }

  public void setRegisterIp(String registerIp) {
    this.registerIp = registerIp;
  }

  public String getLoginIp() {
    return loginIp;
  }

  public void setLoginIp(String loginIp) {
    this.loginIp = loginIp;
  }

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public String getAccessExpire() {
    return accessExpire;
  }

  public void setAccessExpire(String accessExpire) {
    this.accessExpire = accessExpire;
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

  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
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
            ", username='" + userName + '\'' +
            ", password='" + password + '\'' +
            ", department='" + department + '\'' +
            ", telephone='" + telephone + '\'' +
            ", sexs='" + sexs + '\'' +
            ", registerTime=" + registerTime +
            ", loginTime=" + loginTime +
            ", registerIp='" + registerIp + '\'' +
            ", loginIp='" + loginIp + '\'' +
            ", accessToken='" + accessToken + '\'' +
            ", accessExpire='" + accessExpire + '\'' +
            ", email='" + email + '\'' +
            ", address='" + address + '\'' +
            ", salt='" + salt + '\'' +
            ", enable=" + enable +
            '}';
  }
}
