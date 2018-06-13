/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: PasswordEncryption
 * Author:   dawn@acdiost.com
 * Date:     2018-05-29 9:10
 * Description: 对密码进行加密处理
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.utils;

import cn.com.aesc.entity.Users;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * 〈一句话功能简述〉<br>
 * 〈对密码进行加密处理〉
 * algorithm 算法 计算法则
 *
 * @author dawn@acdiost.com
 * @create 2018-05-29
 * @since 1.0.0
 */
public class PasswordEncryption {
  private String algorithmName = "md5";
  /**
   * 加密循环次数
   */
  private int hashIterations = 3;

  public void encryptPassword(Users user) {
    String newPassword = new SimpleHash(algorithmName, user.getPassword(), ByteSource.Util.bytes(user.getUsername()), hashIterations).toHex();
    user.setPassword(newPassword);
  }

  public static void main(String[] args) {
    PasswordEncryption passwordHelper = new PasswordEncryption();
    Users user = new Users();
    user.setUsername("admin");
    user.setPassword("admin");
    passwordHelper.encryptPassword(user);
    System.out.println(user);
  }
}
