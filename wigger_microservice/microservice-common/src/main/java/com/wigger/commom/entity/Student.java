package com.wigger.commom.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_springcloud_student")
@Data
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    // JPA的一些注解
    @Id
    @GeneratedValue
    private Integer id;

    @Column(length=50)
    private String name;

    @Column(length=50)
    private String grade;
}
