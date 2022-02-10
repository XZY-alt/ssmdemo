package com.xzy.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 1.出现包不分层的问题，通过设置侧边栏按钮，点击Compared Mibile Pagage
 * 2.看原来的框架，感觉不是很强烈，感觉并没有加深理解，只不过自己会通过copy慢慢搭建环境
 */
public class User implements Serializable {
    private String username;
    private String adress;
    private String sex;
    private Integer id;
    private Date birthday;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", adress='" + adress + '\'' +
                ", sex='" + sex + '\'' +
                ", id=" + id +
                ", birthday=" + birthday +
                '}';
    }



}
