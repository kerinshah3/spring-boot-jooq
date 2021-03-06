/*
 * This file is generated by jOOQ.
 */
package com.example.demo.db.tables.pojos;


import com.example.demo.db.tables.interfaces.IPerson;

import javax.annotation.Generated;
import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "PERSON", schema = "person", indexes = {
    @Index(name = "PRIMARY", unique = true, columnList = "ID ASC")
})
public class Person implements IPerson {

    private static final long serialVersionUID = -2068246213;

    private Integer id;
    private String  name;
    private String  email;

    public Person() {}

    public Person(IPerson value) {
        this.id = value.getId();
        this.name = value.getName();
        this.email = value.getEmail();
    }

    public Person(
        Integer id,
        String  name,
        String  email
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Id
    @Column(name = "ID", unique = true, nullable = false, precision = 10)
    @NotNull
    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "NAME", length = 50)
    @Size(max = 50)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "EMAIL", nullable = false, length = 50)
    @NotNull
    @Size(max = 50)
    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Person (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(email);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IPerson from) {
        setId(from.getId());
        setName(from.getName());
        setEmail(from.getEmail());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IPerson> E into(E into) {
        into.from(this);
        return into;
    }
}
