package com.oss.webbackend.model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AccountId implements Serializable {
    private static final long serialVersionUID = 8945270538272529510L;
    @Column(name = "PERIOD", nullable = false)
    private Integer period;

    @Column(name = "ACCOUNT", nullable = false, length = 16)
    private String account;

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AccountId entity = (AccountId) o;
        return Objects.equals(this.period, entity.period) &&
                Objects.equals(this.account, entity.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(period, account);
    }

}