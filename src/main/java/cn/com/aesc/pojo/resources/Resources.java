/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 * FileName: Resources
 * Author:   dawn@acdiost.com
 * Date:     2018-06-01 15:39
 * Description: 资源类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.com.aesc.pojo.resources;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈资源类〉
 *
 * @author dawn@acdiost.com
 * @create 2018-06-01
 * @since 1.0.0
 */
public class Resources implements Serializable {
  private static final long serialVersionUID = -6812242071705361506L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer resources_id;

  /**
   * 资源名称
   */
  private String role_resources;


  /**
   * 资源url
   */
  @Column(name = "resources_url")
  private String resources_url;

  /**
   * 资源类型   1:菜单    2：按钮
   */
  private Integer type;

  /**
   * 父资源
   */
  @Column(name = "parentId")
  private Integer parentId;

  /**
   * 排序
   */
  private Integer sort;

  @Transient
  private String checked;//是否选中

  public static long getSerialVersionUID() {
    return serialVersionUID;
  }

  public Integer getResources_id() {
    return resources_id;
  }

  public void setResources_id(Integer resources_id) {
    this.resources_id = resources_id;
  }

  public String getRole_resources() {
    return role_resources;
  }

  public void setRole_resources(String role_resources) {
    this.role_resources = role_resources;
  }

  public String getResources_url() {
    return resources_url;
  }

  public void setResources_url(String resources_url) {
    this.resources_url = resources_url;
  }

  /**
   * 获取资源类型   1:菜单    2：按钮
   *
   * @return type - 资源类型   1:菜单    2：按钮
   */
  public Integer getType() {
    return type;
  }

  /**
   * 设置资源类型   1:菜单    2：按钮
   *
   * @param type 资源类型   1:菜单    2：按钮
   */
  public void setType(Integer type) {
    this.type = type;
  }

  /**
   * 获取父资源
   *
   * @return parentId - 父资源
   */
  public Integer getParentId() {
    return parentId;
  }

  /**
   * 设置父资源
   *
   * @param parentId 父资源
   */
  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  /**
   * 获取排序
   *
   * @return sort - 排序
   */
  public Integer getSort() {
    return sort;
  }

  /**
   * 设置排序
   *
   * @param sort 排序
   */
  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public String getChecked() {
    return checked;
  }

  public void setChecked(String checked) {
    this.checked = checked;
  }

  @Override
  public String toString() {
    return "Resources{" +
            "resources_id=" + resources_id +
            ", role_resources='" + role_resources + '\'' +
            ", resources_url='" + resources_url + '\'' +
            ", type=" + type +
            ", parentid=" + parentId +
            ", sort=" + sort +
            ", checked='" + checked + '\'' +
            '}';
  }
}