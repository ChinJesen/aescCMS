package cn.com.aesc.entity.users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Copyright (C), 2005-2018, 重庆汽博实业有限公司
 *
 * @Author: dawn@acdiost.com
 * @Date: 2018-06-14 11:29
 * @Param:
 * @Return:
 * @See:
 * @Throws:
 * @Version:
 * @Description:
 */
@Entity
public class Resources implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  private Integer id;
  /**
   * 资源名称
   */
  private String name;
  /**
   * 资源url
   */
  @Column(name = "resUrl")
  private String resurl;
  /**
   * 资源类型   1:菜单    2：按钮
   */
  private Integer type;
  /**
   * 父资源
   */
  @Column(name = "parentId")
  private Integer parentid;
  /**
   * 排序
   */
  private Integer sort;

  /**
   * @return id
   */
  public Integer getId() {
    return id;
  }

  /**
   * @param id
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * 获取资源名称
   *
   * @return name - 资源名称
   */
  public String getName() {
    return name;
  }

  /**
   * 设置资源名称
   *
   * @param name 资源名称
   */
  public void setName(String name) {
    this.name = name == null ? null : name.trim();
  }

  /**
   * 获取资源url
   *
   * @return resUrl - 资源url
   */
  public String getResurl() {
    return resurl;
  }

  /**
   * 设置资源url
   *
   * @param resurl 资源url
   */
  public void setResurl(String resurl) {
    this.resurl = resurl == null ? null : resurl.trim();
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
  public Integer getParentid() {
    return parentid;
  }

  /**
   * 设置父资源
   *
   * @param parentid 父资源
   */
  public void setParentid(Integer parentid) {
    this.parentid = parentid;
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

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" [");
    sb.append("Hash = ").append(hashCode());
    sb.append(", id=").append(id);
    sb.append(", name=").append(name);
    sb.append(", resurl=").append(resurl);
    sb.append(", type=").append(type);
    sb.append(", parentid=").append(parentid);
    sb.append(", sort=").append(sort);
    sb.append("]");
    return sb.toString();
  }
}