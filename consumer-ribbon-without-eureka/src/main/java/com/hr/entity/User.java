package com.hr.entity;


import java.math.BigDecimal;

/**
 * @author 胡冉
 * @Description: TODO
 * @date 2019/1/716:45
 * @copyright {@link www.hndfsj.com}
 */
public class User {
    private Long id;
    private String username;
    private String name;
    private short age;
    private BigDecimal balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
