package com.quarki;

import com.quarki.db.jooq.tables.records.FooRecord;
import org.mapstruct.Mapper;

import static org.mapstruct.MappingConstants.ComponentModel.CDI;

@Mapper(componentModel = CDI)
public interface FooMapper {
//    @Mapping(target = "value3", ignore = true)
//    @Mapping(target = "value2", ignore = true)
//    @Mapping(target = "value1", ignore = true)
//    @Mapping(target = "original", ignore = true)
//    @Mapping(target = "into", ignore = true)
//    @Mapping(target = "getValue", ignore = true)
//    @Mapping(target = "get", ignore = true)
    default FooRecord toRecord(Foo foo) {
        return new FooRecord(foo.name(), foo.nums().toArray(new Integer[0]), foo.date());
    }

}
