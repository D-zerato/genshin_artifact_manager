package dz.game.gm.repository.util;

import dz.shared.util.json.JsonUtils;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.NoArgsConstructor;

import java.util.List;

@Converter
@NoArgsConstructor
public class ListIntegerConverter implements AttributeConverter<List<Integer>, String> {
    public String convertToDatabaseColumn(List<Integer> attribute) {
        return attribute == null ? null : JsonUtils.toJson(attribute);
    }

    public List<Integer> convertToEntityAttribute(String dbData) {
        return dbData == null ? null : JsonUtils.fromJsonList(dbData, Integer.class);
    }
}
