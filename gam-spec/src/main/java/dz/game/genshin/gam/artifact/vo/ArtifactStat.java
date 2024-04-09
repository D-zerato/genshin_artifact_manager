package dz.game.genshin.gam.artifact.vo;

import dz.game.genshin.gam.meta.vo.AppendProp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class ArtifactStat {
    //
    private AppendProp statType;
    private BigDecimal value;
}
