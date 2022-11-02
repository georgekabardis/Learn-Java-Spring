package com.oss.webbackend.model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Doctm01Id implements Serializable {
    private static final long serialVersionUID = 8378265302332832293L;
    @Column(name = "PERIOD", nullable = false)
    private Integer period;

    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "SENU", nullable = false)
    private Integer senu;

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSenu() {
        return senu;
    }

    public void setSenu(Integer senu) {
        this.senu = senu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Doctm01Id entity = (Doctm01Id) o;
        return Objects.equals(this.period, entity.period) &&
                Objects.equals(this.id, entity.id) &&
                Objects.equals(this.senu, entity.senu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(period, id, senu);
    }

}