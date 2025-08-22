package com.example.EncryptedTrafficRecognition.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "appSta")
public class AppSta {

    @Id//这是主键
    @Column(name = "id")//数据库中的id对应属性中的id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "wx")
    private Integer wx;

    @Column(name = "qq")
    private Integer qq;

    @Column(name = "https")
    private Integer https;

    public AppSta() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWx() {
        return wx;
    }

    public void setWx(Integer wx) {
        this.wx = wx;
    }

    public Integer getQq() {
        return qq;
    }

    public void setQq(Integer qq) {
        this.qq = qq;
    }

    public Integer getHttps() {
        return https;
    }

    public void setHttps(Integer https) {
        this.https = https;
    }
}
