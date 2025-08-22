package com.example.EncryptedTrafficRecognition.domain;

import jakarta.persistence.*;

// 以下是17个传输层的常用端口：
// 1. HTTP - 80 (TCP) 2. HTTPS - 443 (TCP)
// 3. FTP - 20 (TCP)、21 (TCP) 4. SSH - 22 (TCP) 5. Telnet - 23 (TCP)
// 6. SMTP - 25 (TCP) 7. POP3 - 110 (TCP) 8. IMAP - 143 (TCP) 9. DNS - 53 (TCP/UDP)
// 10. SNMP - 161 (UDP) 11. NTP - 123 (UDP) 12. DHCP - 67 (UDP)、68 (UDP)
// 13. TFTP - 69 (UDP) 14. RDP - 3389 (TCP) 15. SIP - 5060 (TCP/UDP)

@Entity
@Table(name = "comportsta")
public class ComPortSta {

    @Id//这是主键
    @Column(name = "id")//数据库中的id对应属性中的id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="port_80")
    private Integer port_80;

    @Column(name="port_443")
    private Integer port_443;

    @Column(name="port_20")
    private Integer port_20;

    @Column(name="port_21")
    private Integer port_21;

    @Column(name="port_22")
    private Integer port_22;

    @Column(name="port_23")
    private Integer port_23;

    @Column(name="port_25")
    private Integer port_25;

    @Column(name="port_110")
    private Integer port_110;

    @Column(name="port_143")
    private Integer port_143;

    @Column(name="port_53")
    private Integer port_53;

    @Column(name="port_161")
    private Integer port_161;

    @Column(name="port_123")
    private Integer port_123;

    @Column(name="port_67")
    private Integer port_67;

    @Column(name="port_68")
    private Integer port_68;

    @Column(name="port_69")
    private Integer port_69;

    @Column(name="port_3389")
    private Integer port_3389;

    @Column(name="port_5060")
    private Integer port_5060;

    @Column(name="port_8000")
    private Integer port_8000;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPort_80() {
        return port_80;
    }

    public void setPort_80(Integer port_80) {
        this.port_80 = port_80;
    }

    public Integer getPort_443() {
        return port_443;
    }

    public void setPort_443(Integer port_443) {
        this.port_443 = port_443;
    }

    public Integer getPort_20() {
        return port_20;
    }

    public void setPort_20(Integer port_20) {
        this.port_20 = port_20;
    }

    public Integer getPort_21() {
        return port_21;
    }

    public void setPort_21(Integer port_21) {
        this.port_21 = port_21;
    }

    public Integer getPort_22() {
        return port_22;
    }

    public void setPort_22(Integer port_22) {
        this.port_22 = port_22;
    }

    public Integer getPort_23() {
        return port_23;
    }

    public void setPort_23(Integer port_23) {
        this.port_23 = port_23;
    }

    public Integer getPort_25() {
        return port_25;
    }

    public void setPort_25(Integer port_25) {
        this.port_25 = port_25;
    }

    public Integer getPort_110() {
        return port_110;
    }

    public void setPort_110(Integer port_110) {
        this.port_110 = port_110;
    }

    public Integer getPort_143() {
        return port_143;
    }

    public void setPort_143(Integer port_143) {
        this.port_143 = port_143;
    }

    public Integer getPort_53() {
        return port_53;
    }

    public void setPort_53(Integer port_53) {
        this.port_53 = port_53;
    }

    public Integer getPort_161() {
        return port_161;
    }

    public void setPort_161(Integer port_161) {
        this.port_161 = port_161;
    }

    public Integer getPort_123() {
        return port_123;
    }

    public void setPort_123(Integer port_123) {
        this.port_123 = port_123;
    }

    public Integer getPort_67() {
        return port_67;
    }

    public void setPort_67(Integer port_67) {
        this.port_67 = port_67;
    }

    public Integer getPort_68() {
        return port_68;
    }

    public void setPort_68(Integer port_68) {
        this.port_68 = port_68;
    }

    public Integer getPort_69() {
        return port_69;
    }

    public void setPort_69(Integer port_69) {
        this.port_69 = port_69;
    }

    public Integer getPort_3389() {
        return port_3389;
    }

    public void setPort_3389(Integer port_3389) {
        this.port_3389 = port_3389;
    }

    public Integer getPort_5060() {
        return port_5060;
    }

    public void setPort_5060(Integer port_5060) {
        this.port_5060 = port_5060;
    }

    public Integer getPort_8000() {
        return port_8000;
    }

    public void setPort_8000(Integer port_8000) {
        this.port_8000 = port_8000;
    }

    public ComPortSta() {
        this.port_20 = 0;
        this.port_21 = 0;
        this.port_22 = 0;
        this.port_23 = 0;
        this.port_25 = 0;
        this.port_53 = 0;
        this.port_67 = 0;
        this.port_68 = 0;
        this.port_69 = 0;
        this.port_80 = 0;
        this.port_110 = 0;
        this.port_123 = 0;
        this.port_143 = 0;
        this.port_161 = 0;
        this.port_443 = 0;
        this.port_3389 = 0;
        this.port_5060 = 0;
        this.port_8000 = 0;
    }


}
