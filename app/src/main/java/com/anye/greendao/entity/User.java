package com.anye.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by anye0 on 2016/7/24.
 */
@Entity
public class User {
    @Id
    private Long id;
    private String name;
    private int age;
    private int age1;
    private int age2;

    private String somrthing;
    @Transient
    private int tempUsageCount; // not persisted



    @Generated(hash = 869337688)
    public User(Long id, String name, int age, int age1, int age2, String somrthing) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.age1 = age1;
        this.age2 = age2;
        this.somrthing = somrthing;
    }


    @Generated(hash = 586692638)
    public User() {
    }




    public int getAge() {
        return this.age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Long getId() {
        return this.id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getSomrthing() {
        return this.somrthing;
    }


    public void setSomrthing(String somrthing) {
        this.somrthing = somrthing;
    }


    public int getAge2() {
        return this.age2;
    }


    public void setAge2(int age2) {
        this.age2 = age2;
    }


    public int getAge1() {
        return this.age1;
    }


    public void setAge1(int age1) {
        this.age1 = age1;
    }







}
