package com.quarki.db;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "foo")
public class Foo {
    @Id
    @Lob
    @Column(name = "name")
    private String name;

    @Column(name = "date")
    private LocalDate date;

    @Convert(converter = IntArrMapper.class)
    @Column(name = "nums", columnDefinition = "int4[]")
    private int[] nums;

}