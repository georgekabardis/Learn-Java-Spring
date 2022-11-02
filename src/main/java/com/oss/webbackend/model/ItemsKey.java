package com.oss.webbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ItemsKey implements Serializable {
    private static final long serialVersionUID = -5825573785355675036L;
    @Column(name = "BOOK", nullable = false)
    private Integer book;

    @Column(name = "ITTY", nullable = false, length = 1)
    private String itty;

    @Column(name = "ITEM", nullable = false, length = 16)
    private String item;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ItemsKey entity = (ItemsKey) o;
        return Objects.equals(this.itty, entity.itty) &&
                Objects.equals(this.item, entity.item) &&
                Objects.equals(this.book, entity.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itty, item, book);
    }

}