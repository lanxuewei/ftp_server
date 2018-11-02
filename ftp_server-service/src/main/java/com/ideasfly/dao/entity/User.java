package com.ideasfly.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author lanxuewei Create in 2018/10/26 20:43
 * Description: User
 */
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 2424957076453438283L;

    /** 主键id */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    /** 用户名 */
    @Column(name = "user_name")
    private String userName;

    /** 密码 */
    @Column(name = "password")
    private String password;

    /** 状态码 */
    @Column(name = "status")
    private Integer status;

    /** 真实姓名 */
    @Column(name = "real_name")
    private String realName;

    /** 性别 */
    @Column(name = "sex")
    private Integer sex;

    /** 头像图片地址 */
    @Column(name = "img")
    private String img;

    /** 创建时间 */
    @Column(name = "create_time")
    private Date createTime;

    /** 更新时间 */
    @Column(name = "update_time")
    private Date updateTime;

    /** 个人简介 */
    @Column(name = "des")
    private String des;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }
}