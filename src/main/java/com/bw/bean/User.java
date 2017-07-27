package com.bw.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by ${韩文建} on 2017/7/7.
 */
@Entity
public class User implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    private String uname;
    private String upwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                '}';
    }

    public User(int id, String uname, String upwd) {

        this.id = id;
        this.uname = uname;
        this.upwd = upwd;
    }

    public User() {
    }
}
