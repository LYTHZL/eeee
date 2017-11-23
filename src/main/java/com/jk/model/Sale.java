package com.jk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/11/16.
 */
@Entity
public class Sale implements Serializable {
    private static final long serialVersionUID = 900622924998310211L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true)
    private String custom;
    @Column(nullable = true)
    private String saledate;
    @Column(nullable = true)
    private String money;
    @Column(nullable = true)
    private String moneydate;
    @Column(nullable = true)
    private Long tran;
    @Column(nullable = true)
    private String trandate;
    @Column(nullable = true)
    private String saleman;
    @Column(nullable = true)
    private String info;
    @Column(nullable = true)
    private Long dengji;
    @Column(nullable = true)
    private Long shenhe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }

    public String getSaledate() {
        return saledate;
    }

    public void setSaledate(String saledate) {
        this.saledate = saledate;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getMoneydate() {
        return moneydate;
    }

    public void setMoneydate(String moneydate) {
        this.moneydate = moneydate;
    }

    public Long getTran() {
        return tran;
    }

    public void setTran(Long tran) {
        this.tran = tran;
    }

    public String getTrandate() {
        return trandate;
    }

    public void setTrandate(String trandate) {
        this.trandate = trandate;
    }

    public String getSaleman() {
        return saleman;
    }

    public void setSaleman(String saleman) {
        this.saleman = saleman;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Long getDengji() {
        return dengji;
    }

    public void setDengji(Long dengji) {
        this.dengji = dengji;
    }

    public Long getShenhe() {
        return shenhe;
    }

    public void setShenhe(Long shenhe) {
        this.shenhe = shenhe;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", custom='" + custom + '\'' +
                ", saledate='" + saledate + '\'' +
                ", money='" + money + '\'' +
                ", moneydate='" + moneydate + '\'' +
                ", tran=" + tran +
                ", trandate='" + trandate + '\'' +
                ", saleman='" + saleman + '\'' +
                ", info='" + info + '\'' +
                ", dengji=" + dengji +
                ", shenhe=" + shenhe +
                '}';
    }
}
