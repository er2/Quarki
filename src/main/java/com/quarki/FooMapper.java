package com.quarki;

import com.quarki.db.jooq.tables.pojos.Foo;
import com.quarki.db.jooq.tables.records.FooRecord;
import org.jooq.RecordMapper;
import org.jooq.RecordUnmapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import static org.mapstruct.MappingConstants.ComponentModel.CDI;

@Mapper(componentModel = CDI, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FooMapper extends RecordMapper<FooRecord, Foo>, RecordUnmapper<Foo, FooRecord> {
}
