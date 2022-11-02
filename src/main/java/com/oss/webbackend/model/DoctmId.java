package com.oss.webbackend.model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DoctmId implements Serializable {
    private static final long serialVersionUID = -6525071653133098607L;
    @Column(name = "PERIOD", nullable = false)
    private Integer period;

    @Column(name = "ID", nullable = false)
    private Integer id;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DoctmId entity = (DoctmId) o;
        return Objects.equals(this.period, entity.period) &&
                Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(period, id);
    }

}