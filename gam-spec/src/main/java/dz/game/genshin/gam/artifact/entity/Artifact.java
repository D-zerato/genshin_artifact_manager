package dz.game.genshin.gam.artifact.entity;

import dz.game.genshin.gam.artifact.vo.ArtifactStat;
import dz.game.genshin.gam.meta.vo.ReliquaryType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Artifact {
    //
    private ReliquaryType type;
    private int rarity;
    private String code;
    private ArtifactStat mainStat;
    private List<ArtifactStat> subStats;
}
