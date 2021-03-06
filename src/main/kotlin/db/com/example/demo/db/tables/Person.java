/*
 * This file is generated by jOOQ.
 */
package com.example.demo.db.tables;


import com.example.demo.db.Indexes;
import com.example.demo.db.Keys;
import com.example.demo.db.tables.records.PersonRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;
import javax.annotation.processing.Generated;

import db.com.example.demo.db.tables.records.PersonRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Person extends TableImpl<PersonRecord> {

    private static final long serialVersionUID = 1801834181;

    /**
     * The reference instance of <code>person.PERSON</code>
     */
    public static final Person PERSON_ = new Person();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PersonRecord> getRecordType() {
        return PersonRecord.class;
    }

    /**
     * The column <code>person.PERSON.ID</code>.
     */
    public final TableField<PersonRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>person.PERSON.NAME</code>.
     */
    public final TableField<PersonRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>person.PERSON.EMAIL</code>.
     */
    public final TableField<PersonRecord, String> EMAIL = createField("EMAIL", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * Create a <code>person.PERSON</code> table reference
     */
    public Person() {
        this(DSL.name("PERSON"), null);
    }

    /**
     * Create an aliased <code>person.PERSON</code> table reference
     */
    public Person(String alias) {
        this(DSL.name(alias), PERSON_);
    }

    /**
     * Create an aliased <code>person.PERSON</code> table reference
     */
    public Person(Name alias) {
        this(alias, PERSON_);
    }

    private Person(Name alias, Table<PersonRecord> aliased) {
        this(alias, aliased, null);
    }

    private Person(Name alias, Table<PersonRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Person(Table<O> child, ForeignKey<O, PersonRecord> key) {
        super(child, key, PERSON_);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return com.example.demo.db.Person.PERSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PERSON_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PersonRecord> getPrimaryKey() {
        return Keys.KEY_PERSON_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PersonRecord>> getKeys() {
        return Arrays.<UniqueKey<PersonRecord>>asList(Keys.KEY_PERSON_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Person as(String alias) {
        return new Person(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Person as(Name alias) {
        return new Person(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Person rename(String name) {
        return new Person(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Person rename(Name name) {
        return new Person(name, null);
    }
}
