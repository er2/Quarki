/*
 * This file is generated by jOOQ.
 */
package com.quarki.db.jooq.tables.records;


import com.quarki.db.jooq.tables.Foo;

import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FooRecord extends TableRecordImpl<FooRecord> implements Record3<String, Integer[], LocalDate> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.foo.name</code>.
     */
    public FooRecord setName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.foo.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.foo.nums</code>.
     */
    public FooRecord setNums(Integer[] value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.foo.nums</code>.
     */
    public Integer[] getNums() {
        return (Integer[]) get(1);
    }

    /**
     * Setter for <code>public.foo.date</code>.
     */
    public FooRecord setDate(LocalDate value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.foo.date</code>.
     */
    public LocalDate getDate() {
        return (LocalDate) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, Integer[], LocalDate> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, Integer[], LocalDate> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Foo.FOO.NAME;
    }

    @Override
    public Field<Integer[]> field2() {
        return Foo.FOO.NUMS;
    }

    @Override
    public Field<LocalDate> field3() {
        return Foo.FOO.DATE;
    }

    @Override
    public String component1() {
        return getName();
    }

    @Override
    public Integer[] component2() {
        return getNums();
    }

    @Override
    public LocalDate component3() {
        return getDate();
    }

    @Override
    public String value1() {
        return getName();
    }

    @Override
    public Integer[] value2() {
        return getNums();
    }

    @Override
    public LocalDate value3() {
        return getDate();
    }

    @Override
    public FooRecord value1(String value) {
        setName(value);
        return this;
    }

    @Override
    public FooRecord value2(Integer[] value) {
        setNums(value);
        return this;
    }

    @Override
    public FooRecord value3(LocalDate value) {
        setDate(value);
        return this;
    }

    @Override
    public FooRecord values(String value1, Integer[] value2, LocalDate value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FooRecord
     */
    public FooRecord() {
        super(Foo.FOO);
    }

    /**
     * Create a detached, initialised FooRecord
     */
    public FooRecord(String name, Integer[] nums, LocalDate date) {
        super(Foo.FOO);

        setName(name);
        setNums(nums);
        setDate(date);
    }

    /**
     * Create a detached, initialised FooRecord
     */
    public FooRecord(com.quarki.db.jooq.tables.pojos.Foo value) {
        super(Foo.FOO);

        if (value != null) {
            setName(value.getName());
            setNums(value.getNums());
            setDate(value.getDate());
        }
    }
}