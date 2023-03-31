package com.quarki.db;

import javax.persistence.Converter;
import javax.persistence.AttributeConverter;

@Converter
public class IntArrMapper implements AttributeConverter<int[], int[]> {

    @Override
    public int[] convertToDatabaseColumn(int[] anInt) {
        return null;
    }

    @Override
    public int[] convertToEntityAttribute(int[] anInt) {
        return null;
    }
}
