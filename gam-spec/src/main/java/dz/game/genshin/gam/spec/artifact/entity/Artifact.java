package dz.game.genshin.gam.spec.artifact.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dz.game.genshin.gam.spec.artifact.vo.ArtifactStat;
import dz.game.genshin.gam.spec.vo.ReliquaryType;
import dz.util.domain.JsonSerializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Artifact implements JsonSerializable {
    //
    private int artifactCode;
    private ReliquaryType type;
    private int rarity;
    private ArtifactStat mainStat;
    private List<ArtifactStat> subStats;
    private List<Integer> reinforcementPattern;

    public Artifact(
            int artifactCode
            , ReliquaryType type
            , int rarity
            , ArtifactStat mainStat
            , List<ArtifactStat> subStats
    ) {
        this.artifactCode = artifactCode;
        this.type = type;
        this.rarity = rarity;
        this.mainStat = mainStat;
        this.subStats = subStats;
        this.reinforcementPattern = new ArrayList<>();
    }

    public String generateId() {
        //
        return String.format("%s_%i%s", artifactCode, rarity, getStatsStringForGenerateId());
    }

    @JsonIgnore
    private String getStatsStringForGenerateId() {
        //
        String result = "_" + mainStat.toString();

        if (this.subStats == null || this.subStats.isEmpty()) {
            return result;
        }

        String subStatsString = subStats.stream().map(ArtifactStat::toString).collect(Collectors.joining("_"));

        return result + "_" + subStatsString;
    }
}
