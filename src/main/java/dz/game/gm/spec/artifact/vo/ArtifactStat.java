package dz.game.gm.spec.artifact.vo;

import dz.game.gm.spec.vo.AppendProp;
import dz.game.gm.spec.vo.StatCategory;
import dz.shared.util.json.JsonSerializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class ArtifactStat implements JsonSerializable {
    private StatCategory statCategory;
    private AppendProp statType;
    private BigDecimal originalValue;

    public String toId() {
        return String.format("%s:%s", statType.toString());
    }

    public static ArtifactStat mainStatSample() {
        return new ArtifactStat(StatCategory.MAIN, AppendProp.FIGHT_PROP_HP, BigDecimal.valueOf(4780.0));
    }

    public static ArtifactStat subStatSample() {
        return new ArtifactStat(StatCategory.SUB, AppendProp.FIGHT_PROP_CRITICAL, BigDecimal.valueOf(0.03889999911189079));
    }
}
