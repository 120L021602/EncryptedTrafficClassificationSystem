package com.example.EncryptedTrafficRecognition.domain;

import jakarta.persistence.*;

//        以下是十个常用的传输层协议，我对它们进行统计：
//        1. TCP (Transmission Control Protocol)传输控制协议
//        2. UDP (User Datagram Protocol)用户数据报协议
//        3. SCTP (Stream Control Transmission Protocol)流控制传输协议
//        4. DCCP (Datagram Congestion Control Protocol)数据包拥塞控制协议
//        5. RSVP (Resource Reservation Protocol)资源预分配协议
//        6. RUDP (Reliable User Datagram Protocol)可靠的用户数据报协议
//        7. TLS (Transport Layer Security)传输层安全协议
//        8. QUIC (Quick UDP Internet Connections)快速UDP网络连接协议
//        9. SPX (Sequenced Packet Exchange)序列化数据包交换协议
//        10. MPTCP (Multipath TCP)多路径传输控制协议
@Entity
@Table(name = "comprosta")
public class ComProSta {

    @Id//这是主键
    @Column(name = "id")//数据库中的id对应属性中的id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="tcp")
    private Integer tcp;

    @Column(name="udp")
    private Integer udp;

    @Column(name="sctp")
    private Integer sctp;

    @Column(name="dccp")
    private Integer dccp;

    @Column(name="rsvp")
    private Integer rsvp;

    @Column(name="rudp")
    private Integer rudp;

    @Column(name="tls")
    private Integer tls;

    @Column(name="quic")
    private Integer quic;

    @Column(name="spx")
    private Integer spx;

    @Column(name="mptcp")
    private Integer mptcp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTcp() {
        return tcp;
    }

    public void setTcp(Integer tcp) {
        this.tcp = tcp;
    }

    public Integer getUdp() {
        return udp;
    }

    public void setUdp(Integer udp) {
        this.udp = udp;
    }

    public Integer getSctp() {
        return sctp;
    }

    public void setSctp(Integer sctp) {
        this.sctp = sctp;
    }

    public Integer getDccp() {
        return dccp;
    }

    public void setDccp(Integer dccp) {
        this.dccp = dccp;
    }

    public Integer getRsvp() {
        return rsvp;
    }

    public void setRsvp(Integer rsvp) {
        this.rsvp = rsvp;
    }

    public Integer getRudp() {
        return rudp;
    }

    public void setRudp(Integer rudp) {
        this.rudp = rudp;
    }

    public Integer getTls() {
        return tls;
    }

    public void setTls(Integer tls) {
        this.tls = tls;
    }

    public Integer getQuic() {
        return quic;
    }

    public void setQuic(Integer quic) {
        this.quic = quic;
    }

    public Integer getSpx() {
        return spx;
    }

    public void setSpx(Integer spx) {
        this.spx = spx;
    }

    public Integer getMptcp() {
        return mptcp;
    }

    public void setMptcp(Integer mptcp) {
        this.mptcp = mptcp;
    }

    public ComProSta() {
    }
}
