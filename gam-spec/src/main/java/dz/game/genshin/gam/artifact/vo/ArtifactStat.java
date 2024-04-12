package dz.game.genshin.gam.artifact.vo;

import com.sun.javafx.binding.StringFormatter;
import dz.game.genshin.gam.meta.vo.AppendProp;
import dz.game.genshin.gam.meta.vo.StatCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class ArtifactStat implements Serializable {
    //
    private StatCategory statCategory;
    private AppendProp statType;
    private BigDecimal approximationValue;
    private BigDecimal originalValue;

    public String toString() {
        return StringFormatter.format("%s:%s", statType.toString(), approximationValue.toString()).toString();
    }

    public static ArtifactStat mainStatSample() {
        //
        return new ArtifactStat(StatCategory.MAIN, AppendProp.FIGHT_PROP_HP, BigDecimal.valueOf(4780), BigDecimal.valueOf(4780.0));
    }

    public static ArtifactStat subStatSample() {
        //
        return new ArtifactStat(StatCategory.SUB, AppendProp.FIGHT_PROP_CRITICAL, BigDecimal.valueOf(3.9), BigDecimal.valueOf(0.03889999911189079));
    }
}
