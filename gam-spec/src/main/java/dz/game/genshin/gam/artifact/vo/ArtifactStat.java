package dz.game.genshin.gam.artifact.vo;

import com.sun.javafx.binding.StringFormatter;
import dz.game.genshin.gam.meta.vo.AppendProp;
import dz.game.genshin.gam.meta.vo.StatCategoryType;
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
    private StatCategoryType statCategoryType;
    private AppendProp statType;
    private BigDecimal value;

    public String toString() {
        return StringFormatter.format("%s:%s", statType.toString(), value.toString()).toString();
    }
}
