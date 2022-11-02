package com.oss.webbackend.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "DOCTM")
public class Doctm {
    @EmbeddedId
    private DoctmId id;

    public DoctmId getId() {
        return id;
    }

    public void setId(DoctmId id) {
        this.id = id;
    }

//TODO [JPA Buddy] generate columns from DB
}