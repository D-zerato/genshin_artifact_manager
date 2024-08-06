package dz.game.gm.repository.util;

import dz.game.gm.spec.artifact.vo.ArtifactStat;
import dz.shared.util.json.JsonUtils;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.NoArgsConstructor;

@Converter
@NoArgsConstructor
public class ArtifactStatConverter implements AttributeConverter<ArtifactStat, String> {
    public String convertToDatabaseColumn(ArtifactStat attribute) {
        return attribute == null ? null : JsonUtils.toJson(attribute);
    }

    public ArtifactStat convertToEntityAttribute(String dbData) {
        return dbData == null ? null : JsonUtils.fromJson(dbData, ArtifactStat.class);
    }
}
