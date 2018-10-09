package cn.com.aesc.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class Departments implements Serializable {
    /**
     * 部门ID
     */
    @Id
    @Column(name = "departmentId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer departmentid;

    /**
     * 部门名称
     */
    @Column(name = "departmentName")
    private String departmentname;

    /**
     * 部门描述
     */
    @Column(name = "departmentDescription")
    private String departmentdescription;

    private static final long serialVersionUID = 1L;

    /**
     * 获取部门ID
     *
     * @return departmentId - 部门ID
     */
    public Integer getDepartmentid() {
        return departmentid;
    }

    /**
     * 设置部门ID
     *
     * @param departmentid 部门ID
     */
    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    /**
     * 获取部门名称
     *
     * @return departmentName - 部门名称
     */
    public String getDepartmentname() {
        return departmentname;
    }

    /**
     * 设置部门名称
     *
     * @param departmentname 部门名称
     */
    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

    /**
     * 获取部门描述
     *
     * @return departmentDescription - 部门描述
     */
    public String getDepartmentdescription() {
        return departmentdescription;
    }

    /**
     * 设置部门描述
     *
     * @param departmentdescription 部门描述
     */
    public void setDepartmentdescription(String departmentdescription) {
        this.departmentdescription = departmentdescription == null ? null : departmentdescription.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", departmentid=").append(departmentid);
        sb.append(", departmentname=").append(departmentname);
        sb.append(", departmentdescription=").append(departmentdescription);
        sb.append("]");
        return sb.toString();
    }
}