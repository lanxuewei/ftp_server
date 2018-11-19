package com.ideasfly.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author lanxuewei Create in 2018/10/26 20:43
 * Description: User
 */
@Data
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

}