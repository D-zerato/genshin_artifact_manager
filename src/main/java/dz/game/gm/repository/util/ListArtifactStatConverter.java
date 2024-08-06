package dz.game.gm.repository.util;

import dz.game.gm.spec.artifact.vo.ArtifactStat;
import dz.shared.util.json.JsonUtils;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.NoArgsConstructor;

import java.util.List;

@Converter
@NoArgsConstructor
public class ListArtifactStatConverter implements AttributeConverter<List<ArtifactStat>, String> {
    public String convertToDatabaseColumn(List<ArtifactStat> attribute) {
        return attribute == null ? null : JsonUtils.toJson(attribute);
    }

    public List<ArtifactStat> convertToEntityAttribute(String dbData) {
        return dbData == null ? null : JsonUtils.fromJsonList(dbData, ArtifactStat.class);
    }
}
