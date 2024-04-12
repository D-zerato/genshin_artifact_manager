package dz.util.jpa;

import dz.util.string.JsonUtils;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.NoArgsConstructor;

import java.util.List;

@Converter
@NoArgsConstructor
public class ListStringConverter implements AttributeConverter<List<String>, String> {
    //
    public String convertToDatabaseColumn(List<String> attribute) {
        return attribute == null ? null : JsonUtils.toJson(attribute);
    }

    public List<String> convertToEntityAttribute(String dbData) {
        return dbData == null ? null : JsonUtils.fromJsonList(dbData, String.class);
    }
}
