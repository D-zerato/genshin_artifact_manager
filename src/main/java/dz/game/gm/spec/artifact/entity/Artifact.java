package dz.game.gm.spec.artifact.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dz.game.gm.spec.artifact.vo.ArtifactStat;
import dz.game.gm.spec.vo.ReliquaryType;
import dz.game.gm.repository.util.ListArtifactStatConverter;
import dz.game.gm.repository.util.ListIntegerConverter;
import dz.shared.util.json.JsonSerializable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(schema = "ARTIFACT")
public class Artifact implements JsonSerializable {
    @Id
    private String id;
    private int artifactCode;
    @Enumerated(EnumType.STRING)
    private ReliquaryType type;
    private int rarity;
    private int level;
    @Convert(converter = ArtifactStat.class)
    private ArtifactStat mainStat;
    @Convert(converter = ListArtifactStatConverter.class)
    private List<ArtifactStat> subStats;
    @Convert(converter = ListIntegerConverter.class)
    private List<Integer> reinforcementPattern;

    public Artifact(
            int artifactCode
            , ReliquaryType type
            , int rarity
            , int level
            , ArtifactStat mainStat
            , List<ArtifactStat> subStats
    ) {
        this.artifactCode = artifactCode;
        this.type = type;
        this.rarity = rarity;
        this.level = level;
        this.mainStat = mainStat;
        this.subStats = subStats;
        this.reinforcementPattern = new ArrayList<>();
    }

    public Artifact(
            int artifactCode
            , ReliquaryType type
            , int rarity
            , int level
            , ArtifactStat mainStat
            , List<ArtifactStat> subStats
            , List<Integer> reinforcementPattern
    ) {
        this(artifactCode, type, rarity, level, mainStat, subStats);
        this.reinforcementPattern = reinforcementPattern;
    }

    public String generateId() {
        return String.format("%s_%s_%s", artifactCode, rarity, getStatsStringForGenerateId());
    }

    @JsonIgnore
    private String getStatsStringForGenerateId() {
        String result = mainStat.toId();

        if (this.subStats == null || this.subStats.isEmpty()) {
            return result;
        }

        String subStatsString = subStats.stream().map(ArtifactStat::toId).collect(Collectors.joining("_"));

        return result + "_" + subStatsString;
    }
}
