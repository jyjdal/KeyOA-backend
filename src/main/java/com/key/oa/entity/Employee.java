package com.key.oa.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author 孙强
 * 员工实体类
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Employee {
    /**
     * 主键Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 员工的真实姓名
     * 要求：非空
     */
    @Column(nullable = false)
    private String realName;

    /**
     * 员工的密码
     * 要求：非空
     */
    @Column(nullable = false)
    private String password;

    /**
     * 员工的电子邮箱
     */
    private String email;

    /**
     * 员工的电话号码
     * 要求：非空
     */
    @Column(nullable = false)
    private String phone;

    /**
     * 员工的性别
     * 要求：非空
     */
    @Column(nullable = false)
    private Boolean gender;

    /**
     * 员工的身份证号码
     * 要求：非空、唯一
     */
    @Column(nullable = false, unique = true)
    private String identity;

    /**
     * 员工账号是否为管理员账号（暂定）
     */
    @Column(nullable = false)
    private Boolean admin;
}
