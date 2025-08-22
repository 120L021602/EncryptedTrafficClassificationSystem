package com.example.EncryptedTrafficRecognition.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "encryptedmessage")
public class EncryptedMessage {

    @Id//这是主键
    @Column(name = "id")//数据库中的id对应属性中的id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "protocol")
    private String protocol;

    @Column(name = "port")
    private Integer port;

    @Column(name = "catalogue")
    private String catalogue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(String catalogue) {
        this.catalogue = catalogue;
    }
}
